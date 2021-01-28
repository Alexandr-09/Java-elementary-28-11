import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatination2 {
    public static void main(String[] args) throws IOException {
        equaels();

        }
   public  static void equaels() throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       StringBuffer firstBuffer = new StringBuffer();
       String stopWord = "хватит";

        while (true){
            String wordStop = reader.readLine();
            if (stopWord.equals(wordStop))break;
            firstBuffer.append(wordStop + ", " );

        }
       System.out.println(firstBuffer);

   }
}

