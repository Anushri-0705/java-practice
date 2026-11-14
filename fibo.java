import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b =1;
        int i = 2;
       // int i = 0;

        /*while(i< n){
            System.out.println(a);
            int temp = a+b;
            a=b;
            b = temp; 
            i++;
        } */
       while(i<=n){
        int temp =b;
        b = a+b;
        a=temp;
        i++;
       }
        System.out.println(b);
    }
}
