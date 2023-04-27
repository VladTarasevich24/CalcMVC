package calc.controller;

import calc.entity.Operation;
import calc.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @Autowired
    private OperationService operationService;

    @GetMapping
    public String calc() {
        return "calc";
    }

    @PostMapping
    public String calc(@ModelAttribute("newOperation") @Valid Operation operation, BindingResult bindingResult,
                       Model model) {
        if (bindingResult.hasErrors()){
            Map<String, String> errors = new HashMap<>();
            for(FieldError fieldError: bindingResult.getFieldErrors()){
                errors.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            model.addAllAttributes(errors);
            return "calc";
        }

        Operation result = operationService.calculate(operation);

        model.addAttribute("result", result);
        return "calc";
    }


}
