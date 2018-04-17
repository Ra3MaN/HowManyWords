
import java.util.Scanner;

/**A simple program that will calculate how many words you need to 
 * prepared in order to talk for the time that you have been allocated.
 * 
 * @param number_of_minutes. */

public class howLongToSpeak {

	public static void main(String[] args) {
		Scanner chk = new Scanner(System.in);
		int minutes = 0;
		int wpm = 	80;
		int total ;
		
		System.out.println("How long do you need to speak?(min): ");
		minutes  = chk.nextInt();
		
		total = minutes * wpm;
		
		System.out.println("You need to prepare a " + total + "-" + (total +(minutes * 30))+ "word speech");
		System.out.println("this will depend on the speed that you talk.");
		chk.close();
	}
}
