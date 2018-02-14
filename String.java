import java.util.*;



public class Main {

    
public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        
System.out.print("Please enter a String: ");
        
String word = input.next();
        
if (isValid(word)) {
            
System.out.println("Valid String");
        
} else {
            
System.out.println("Invalid String");
        
}
     
    
}

    
public static boolean isValid(String word) {
        
//return true if and only if password:
       
 //1. have at least eight characters.
        
//2. consists of only letters and digits.
       
 //3. must contain at least two digits.
        
if (word.length() < 8 || word.toLowerCase.equals(word)){
            
return false;
        
} else  if{
            
char c;
            
int count = 1;
           
 for (int i = 0; i < word.length() - 1; i++) {
               
 c = word.charAt(i);
                
if (!Character.isLetterOrDigit(c)) {
                   
 return false;
                
} else if (Character.isDigit(c)) {
                    
count++;
                    
if (count < 2)   {
                       
 return false;
                   
 }
               
 }
          
  }
       
 }
       
 return true;
   
 }

}

