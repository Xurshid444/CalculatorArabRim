// https://jm-program.github.io/task-calculator
// Тестовое задание калькулятор Java

package calculatorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorM {

    public static void main(String[] args) {
        try{
            System.out.println("Калькулятор для выражений вида:" +"\n"+
                    "\"Number1 пробел Operation пробел Number2\""+"\n"+
                    "Допускаются числа от 1 до 10 или от I до X включительно. " +"\n"+
                    "Операции: + - * /");
            System.out.print("Введите выражение: \n");
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
            String calcString = bReader.readLine();
            
            Calc calc = new Calc();
            String result = calc.result(calcString);
            System.out.println("Ответ: " + result);
        } 
        catch(CalcException | IOException e){

        }

    }
    
}
