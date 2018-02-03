
import java.util.*;
class Main {

  public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		   System.out.println("Enter a number!");
		int n = input.nextInt();
		   while(n<1 || n>1000) {
			    System.out.println("invalid number. Try again!");
			       n = input.nextInt();
		}
		int nt=0;
		int np=0;
		int ns=0;
		System.out.println("Enter pasta names " + n + " times!");
		int i=1;
		while(i<=n) {
		    String str = input.next();
		     str.toLowerCase().trim();
		       if(str.equals("spagetti"))
			 ns += 1;
		      else if(str.equals("penne"))
			 np += 1;
			     else if(str.equals("tagliatelle"))
			 nt += 1;

		 if (str.equals("spagetti" || str.equals("penne") || str.equals("tagliatelle")))
			 i++;
		 else
			System.out.println("Sorry, Type another.");
		}
		int max = Math.max(nt, Math.max(ns,np));
		     if(max == np)
			     System.out.println("Penne");
		     else if(max == ns)
			     System.out.println("Spagetti");
		     else if(max == nt)
			     System.out.println("Tagliatelle");
		input.close();
	}
  }
