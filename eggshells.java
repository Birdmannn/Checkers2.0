package eggshells;
import java.util.Scanner;

public class eggshells {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int nEggs;
		int dozen;
		int gross;
		int remain;
		
		System.out.print("Input the number of eggs you have: ");
		
		
		nEggs = scan.nextInt();
		gross = nEggs / 144;
		dozen = (nEggs - (144 * gross)) / 12;
		remain = nEggs % 12;
		
		System.out.print("\nYour number of eggs is " + gross + " gross, " + dozen + " dozen, and " + remain);
	}

}
