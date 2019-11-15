package company;

import java.util.ArrayList;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Enter N not more 100");
        Scanner in = new Scanner(System.in);
        try {
            byte N = in.nextByte();
            if (N > 99 || N <= 0) System.out.println("Incorrect data");
            else {
                ArrayList<Integer> numbersPalindrome = numbersPalindrome(N);
                for (int i : numbersPalindrome) {
                    System.out.print(i + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("You entered incorrect data");
        }
        in.close();
    }
    public static ArrayList<Integer>numbersPalindrome(int n){
        ArrayList<Integer>answer=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(isPalindrome(String.valueOf(i)))answer.add(i);
        }
        return answer;
    }
    public static boolean isPalindrome(String str){
        if(str.equals(new StringBuilder(str).reverse().toString()))return true;
        else return false;
    }
}
