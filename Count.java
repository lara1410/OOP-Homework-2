import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please type a phrase.");
        String phrase= in.nextLine();

        String[] words = phrase.split(" ");

        System.out.println("The number of words is:"+ "  "+words.length);
        System.out.println("The number of sentences:"+"  "+ findNumberOfSentence());





}
public static int findNumberOfSentence(String input){
    int len=0;

        if(input.trim().length()==0){
                  len=0;

        } else {
          int count=0;
             for(int inc=0;inc<input.length();inc++){
               char ch=input.charAt(inc);
               if(ch=='.')
               count++;
               len=count;
}
          }
          return len;

    }
}
