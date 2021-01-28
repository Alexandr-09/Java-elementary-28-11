import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Concatination {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        while (true) {

            String wordStop = reader.readLine();

            if (wordStop.equals("хватит")) break;
            String userWord = wordStop;
            builder.append(userWord + ", ");
        }
        System.out.println(builder);
    }

}

