package OOP Homework 1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	System.out.println("Which one will you choose?");
	System.out.println("(1) Area");
	System.out.println("(2) Perimeter");
	System.out.println("(3) Draw");
	System.out.println("(4) Exit");
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	while(a != 4) {
		while (a > 4) {
			System.out.println("Invalid number. Try again!");
			a = input.nextInt();
		}
		if(a == 4)
			break;
	  System.out.println("Enter width!");
		int width= input.nextInt();
		System.out.println("Enter height!");
		int height = input.nextInt();
		if(a == 1)
			System.out.println("Area is " + height * width);
		else if(a == 2)
			System.out.println("Perimeter is " + 2*(height + width));
		else if(a == 3) {
			System.out.println("Enter a symbol!");
			String symbol = input.next();
			for(int i = 1; i <= height; i++) {
				for(int k = 1; k < width; k++) {
				System.out.print(symbol);
				}
				System.out.println(symbol);
			}
		}
	System.out.println("And now?");
	a = input.nextInt();
	}
	input.close();
}

}
