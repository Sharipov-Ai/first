import java.util.Scanner;

public class Starts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String star = "*";
        for (int i= 0; i < 7; i ++){
            System.out.println(star);
            star += "*";
        }
    }
}
