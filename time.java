
import java.util.*;

class Main {
  	public static void main(String[] args) {
		      Scanner input = new Scanner(System.in);
		      System.out.println("hour");
		      int jam = input.nextInt();;
		      System.out.println("minutes");
		      int rope = input.nextInt();;
		      System.out.println("seconds");
		      int vayr = input.nextInt();;
		      if(jam > 23 || jam < 0 || rope > 59 || rope < 0 || vayr > 59 || vayr < 0)
			    System.out.println("Invalid time!");
				  else {
					       if (jam != 23)
					             jam += 1;
					   else
						              jam = 0;
					                     if(rope == 59) {
				                             rope = 0;
                          			    if(vayr == 59) {
			     	                             vayr = 0;
				}
				              else
					                         rope += 1;
					}
				                  else
			                             vayr +=1;

			System.out.println(jam+":"+rope+":"+vayr);
		}
		input.close();
	}
			}
