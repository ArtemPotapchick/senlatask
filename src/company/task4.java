package company;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Input text:");
        String text = st.nextLine();
        System.out.println("Input word:");
        String word = st.nextLine();
        System.out.println("Answer = "+ counterWord(text,word));
}
    public static int counterWord(String text, String word){
        text=text.toLowerCase();
        word=word.toLowerCase();
        String []words=text.split("[-#$%^&!?,.0-9\\s]+");
        int counter=0;

        for(int i=0;i<words.length;i++){
            if(word.equals(words[i]))counter++;
        }
        return counter;
    }
}