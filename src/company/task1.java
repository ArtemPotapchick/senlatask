package company;
 import java.util.Scanner;


public class task1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");

        int num = in.nextInt();
     if(num<=0){
    System.out.println("Wrong number.Error!");
}
     else{
        even(num);
        simple(num);
        in.close();}
    }

    static void even(int num) {
        if (num % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }

    static void simple(int num) {
        boolean isComposite = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {

                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("Your number is compositive ");
        } else {
            System.out.println("Your number is prime ");
        }
    }
}