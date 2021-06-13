public class Counter {
    public static void main(String[] args) {
        int cnt = -10;
        while(true){
            if (cnt != -5 && cnt != 5 && cnt != 0){
                System.out.println(cnt);
            }
            cnt ++;
            if (cnt == 11){
                break;
            }
        }
    }
}
