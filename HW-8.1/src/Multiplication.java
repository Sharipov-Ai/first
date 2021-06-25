import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        if (number > 1 || number < 0){
            System.out.println("Wrong number");
            return;
        }
        for (int i = 0; i <= 10; i ++){
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
} /////
