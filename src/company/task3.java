package company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You should enter string");
        String str=in.nextLine();


        System.out.println(numberOfWords(str)+" Words in sentence");
        upfirstletter(str);
    }

  public   static int numberOfWords(String str) {

        String [] s = str.split("[-#$%^&!?,.0-9\\s]+");
      Arrays.sort(s);
        System.out.println("Sorted sentence "+Arrays.toString(s));

        return s.length;

    }
    public static void upfirstletter(String str){

        Stream<String> upperWords = Stream.of(str.split("[\\P{L}]+")).map(w ->w.substring(0,1).toUpperCase()+w.substring(1,w.length()));
        upperWords.forEach(System.out::println);
    }

}