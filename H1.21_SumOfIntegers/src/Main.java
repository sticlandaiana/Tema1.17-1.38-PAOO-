import java.util.ArrayList;

public class Main {

    static public void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        final int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);
        System.out.println("Sum: " + sum[0]);
    }
}
