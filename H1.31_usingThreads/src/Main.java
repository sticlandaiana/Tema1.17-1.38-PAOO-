import java.util.Random;

public class Main {

    static public void main(String[] args){
        Random random = new Random();
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
        int number3 = random.nextInt(100);

        Thread t1 = new NumbersInFiles(number1,"Filex1.txt");
        Thread t2 = new NumbersInFiles(number2,"Filex2.txt");
        Thread t3 = new NumbersInFiles(number3,"Filex3.txt");


        t1.start();
        t2.start();
        t3.start();
        System.out.println("Start :)");


    }
}
