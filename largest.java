import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
    /* if(a >=b && a >= c){
            System.out.println(a + "largest");
        }
        else if (b >=a && b>=c){
            System.out.println(b + "largest");
        }
        else{
            System.out.println(c + "largest");
        } */  
/*int max = a;
 if(b> max)
 {
    max = b;
 }
 else{
    max = c;
 }
 System.out.println(max); */
    
/*int max =0;
if ( a > b){
    max = a;
}
else {
    max =b;
}
if (c > max){
    max = c;
}
System.out.println(max); */

int max = Math.max(c,Math.max(a,b));
System.out.println(max);

}
}
