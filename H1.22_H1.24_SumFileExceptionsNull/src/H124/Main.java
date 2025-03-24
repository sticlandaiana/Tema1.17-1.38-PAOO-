package H124;

public class Main {

    public static void main(String[] args){
        ComputingSum sum1 = new ComputingSum();
        sum1.readNumberFromFile("numbers.txt");
        sum1.findSum();
        System.out.println("s = "+sum1.getSum());
    }

}
