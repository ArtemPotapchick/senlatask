
package company;
import java.util.Scanner;


public class task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st number: ");

        int a = in.nextInt();
        System.out.print("Input 2nd number: ");
        int b = in.nextInt();
        if(a<=0 || b<=0){
            System.out.println("Wrong number.Error!");
        }
        else
        System.out.println( "GSD:"+ gcd(a,b));
        System.out.println( "LCM:"+ lcm(a,b));
        in.close();
    }
    static int  gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    static int lcm(int a,int b){
        return a / gcd(a,b) * b;
    }
}