package calc.service;

import calc.entity.Operation;
import calc.storage.OperationStorage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class OperationService {
    List<Operation> operations;
    OperationStorage operationStorage;
    private long ID = 0;


    public OperationService(OperationStorage operationStorage){
        this.operationStorage = operationStorage;

    }



    public Operation calculate(Operation operation) {
        switch (operation.getType()) {
            case "+":
                operation.setResult(operation.getNum1() + operation.getNum2());
                operation.setId(Long.valueOf(++ID));
                operationStorage.save(operation);
                return operation;
            case "-":
                operation.setResult(operation.getNum1() - operation.getNum2());
                operation.setId(Long.valueOf(++ID));
                operationStorage.save(operation);
                return operation;
            case "*":
                operation.setResult(operation.getNum1() * operation.getNum2());
                operation.setId(Long.valueOf(++ID));
                operationStorage.save(operation);
                return operation;
            case "/":
                operation.setResult(operation.getNum1() / operation.getNum2());
                operation.setId(Long.valueOf(++ID));
                operationStorage.save(operation);
                return operation;


        }
        return null;
    }

}
