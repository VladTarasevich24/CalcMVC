package calc.entity;

import lombok.Data;
import lombok.Value;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class Operation {
    private long id;
    @Min(value = 0)
    @Max(value = 1000)
    private double num1;

    @Min(value = 0)
    @Max(value = 1000)
    private double num2;


    private String type;


    private double result;

    @Override
    public String toString() {
        return  id +".  "+num1+" " +  type+" " + num2 +" = " + result;}
}
