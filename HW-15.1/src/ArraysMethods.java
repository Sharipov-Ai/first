import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] array = new int[10];
        Arrays.fill(array, 5); //Метод заполняет весь массив заданным значением
        print(array);
        Arrays.fill(array, 0, 5, 7); // Метод только заполняет определенный диапозон
        print(array);
        print(Arrays.copyOf(array, 15)); //Метод создает копию оригинального массива с возможность увеличить его диапозон
    }


    public static void print(int[] array){
        for (int j : array) {
            System.out.println(j);
        }
        System.out.println("--------------------");
    }
}
