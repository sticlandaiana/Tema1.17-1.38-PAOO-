package H124;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputingSum {

    private Integer sum;
    private ArrayList<Integer> numbers;

    public ComputingSum(){
        numbers = new ArrayList<>();
        this.sum=0;
    }

    public void readNumberFromFile(String fileName) {

        Integer numInt = 1;


        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String token = scanner.next();


                if (token.matches("-?\\d+")) {
                    System.out.println("Number found: " + token);
                    numInt = Integer.parseInt(token);

                    numbers.add(numInt);

                }

            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error :( File not found");
        } catch (NumberFormatException e) {
            System.out.println("Error :( Invalid data in our file");
        }


    }

    public void findSum(){
        for(Integer n: numbers){
            sum = sum+n;
        }
    }

    public Integer getSum(){
        return sum;
    }

}

