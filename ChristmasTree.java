import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasTree {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int text = Integer.parseInt(reader.readLine());

        for (int i = 0; i < text; i++) {
            System.out.println("*".repeat(1 + i));
        }

        for (int i = text; i > 0; i--) {
            System.out.println("*".repeat(i));
        }
    }
}



