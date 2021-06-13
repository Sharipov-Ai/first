public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max = 0;
        int min = 11;
        int mid = 0;
        for (int i = 0; i < 10; i++){
            array[i] = (int) (Math.random()*10);
            if (array[i] > max){
                max = array[i];
            } if (array[i] < min){
                min = array[i];
            }
            mid += array[i];
        }
        System.out.println("Max: " + max + " Min: " + min + " Mid: " + mid/10);
    }
}
