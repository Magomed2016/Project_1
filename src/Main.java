import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D://input.txt"))){
            String s;
            while((s=bufferedReader.readLine())!=null){
                String[] info = s.split(";");
                System.out.println(info[1].trim());

            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }





}
