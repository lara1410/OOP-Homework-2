package OOP Homework 1;
import java.util.*;
public class Main {

  public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = input.nextInt();
		System.out.println("The numeric root of " + num + " is " + root(num));
		input.close();
	}
	static public int tiv (int x) {
		if(x == 0)
			return 0;
		return x % 10 + tiv(x/10);
	}
	static public int root(int x) {
		int gumar = tiv(x);
		while(gumar > 10) {
			gumar = tiv(gumar);
		}
		return gumar;
	}

}
