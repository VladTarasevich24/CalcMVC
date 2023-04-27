package calc.storage;

import calc.entity.Operation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class OperationStorage {


        private final List<Operation> operations = new ArrayList<>();

        public void save(Operation operation){
            operations.add(operation);
        }
        public List<Operation> findAll(){
            return new ArrayList<>(this.operations);
        }
    public Boolean deleteById(Long id) {
        Iterator<Operation> i = operations.iterator();
        while (i.hasNext()) {
            if (i.next().getId() == id) {
                i.remove();
                return true;
            }
        }
        return false;
    }
    }

