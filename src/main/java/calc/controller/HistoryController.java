package calc.controller;

import calc.entity.Operation;
import calc.service.OperationService;
import calc.storage.OperationStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HistoryController {
    @Autowired
    OperationStorage operationStorage;
    @Autowired
    OperationService operationService;


    @GetMapping("/history")
    public String getAll(Model model){
        model.addAttribute("operation",operationStorage.findAll());
        return "history";
    }
    @GetMapping("/calc/delete/{id}")
    public String deleteOperation(@PathVariable Long id){
        operationStorage.deleteById(id);
       return "redirect:/calc";
   }
}
