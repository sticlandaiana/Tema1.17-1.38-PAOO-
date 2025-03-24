package H122;

import java.util.Scanner;

public class ComputingSumTwoNumbers {

    private Double nr1;
    private Double nr2;


    public Double readNumber(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        try{
            return scanner.nextDouble();
        }catch(Exception e){
            System.err.println("This is not a number :(");
            return null;
        }


    }

    public void computeTheSum(){
        nr1 = readNumber("Write the first number");
        nr2 = readNumber("Write the second number");

        double sum = (nr1 != null ? nr1 : 0) + (nr2 != null ? nr2 : 0);
        System.out.println("Sum = "+sum);
    }

}
