import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x + y);
            System.out.println("Do you want to continue y/n?");
            String command = scanner.next();
            if (command.equals("Y") || command.equals("y")){
            } else {
                break;
            }
        } while(true);
    }
}