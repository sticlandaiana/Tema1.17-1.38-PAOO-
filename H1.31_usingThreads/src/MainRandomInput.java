import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainRandomInput {

    static public void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int option;
        int n;
        System.out.println("Enter 1 if you want a specific number of numbers or 2 for a randomly generated one");
        option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter your number");
                n = scanner.nextInt();
            break;
            case 2:
                n = random.nextInt(100);
            break;
            default:
                System.out.println("Wrong number :( This option doesn't exist");
                return;
        }

        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int num = random.nextInt(100);  // Generăm un număr aleator
            String fileName = "file" + i + ".txt";
            Thread thread = new Thread(new NumbersInFiles(num, fileName));
            threads.add(thread);
            thread.start();
        }

    }


}
