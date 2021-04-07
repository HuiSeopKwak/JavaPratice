import java.util.Scanner;

public class GolfScoreV2 {

	public static final int MAX_NUMBER_SCORES = 10;
	
	// shows the differences between each of a list of golf scores 
	// and their average
	public static void main(String[] args) {
		PartiallyFilledArray score = 
				new PartiallyFilledArray(MAX_NUMBER_SCORES);
		System.out.println("This program reads golf scores and shows");
		System.out.println("how much each differs from the average.");
		
		System.out.println("Enter golf scores: ");
		fillArray(score);
		showDifference(score);
	}
	
	// reads values into the PartiallyFilledArray a.
	public static void fillArray(PartiallyFilledArray a) {
		System.out.println("Enter up to " + a.getMaxCapacity() 
			+ " nonnegative numbers, one per line.");
		System.out.println("Mark the end of the list with a negative number");
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			double point = keyboard.nextDouble();
			if (point < 0)
				break;
			a.add(point);
		}
		keyboard.close();
	}
	
	public static void showDifference(PartiallyFilledArray a) {
		double average = computeAverage(a);
		int count = a.getNumberOfElements();
		System.out.println("Average of the " + a.getNumberOfElements() 
		+ " scores = " + average);
		
		System.out.println("The scores are:");
		for (int i = 0; i < count; i++) {
			double num = a.getElement(i) - average;
			System.out.println(a.getElement(i) + " differs from average by "
					+ num);
		}
		
		// fill out this code.
		
	}
	
	public static double computeAverage(PartiallyFilledArray a) {
		double avg = 0;
		int count = a.getNumberOfElements();
		double total = 0;
		for (int i = 0; i < count; i++)	{
			total += a.getElement(i);
		}
		avg = total / count;
		// fill out this code.
		
		return avg;
	}
}
