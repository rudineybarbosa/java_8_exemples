package app01.function;
import java.util.function.IntToDoubleFunction;

import app01.Calculator;

public class IntToDoubleFunctionDemo1{

	static Calculator soma = (a, b) -> (a + b);
	static Calculator subtracao = (a, b) -> (a - b);
	static Calculator divisao = (a, b) -> (a / b);
	static Calculator produto = (a, b) -> (a * b);
	
    public static void main(String[] args) {
        IntToDoubleFunction celciusToFahrenheit = 
                (input) -> 1.8 * input + 32;
        int celcius = 100;
        
        double fahrenheit = celciusToFahrenheit.applyAsDouble(celcius);
        
        System.out.println(celcius + "\u2103" + " = " 
                + fahrenheit + "\u2109\n");
        
        System.out.println(produto.calculate(5, 2));
    }


}