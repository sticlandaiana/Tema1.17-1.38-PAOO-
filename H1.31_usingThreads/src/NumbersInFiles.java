import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class NumbersInFiles extends Thread{

    private int number;
    private String file;

    public NumbersInFiles(int number, String file){
        this.number = number;
        this.file = file;
    }

    @Override
    public void run(){
        try{
            Thread.sleep(100);

            FileWriter writer = new FileWriter(file);
            writer.write("number = " + number);
            System.out.println(file + " was written");
            writer.close();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {  // ✅ Acum IOException are sens
            e.printStackTrace();
        }
    }
}
