public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("Hello");
        int j = 0;
        while(true){
            System.out.println("j = " + j);
            if(j==2){
                break;
            }
        }
    }
}