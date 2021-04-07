import java.util.Scanner;

public class ArrayOfScore {
	
	private static final int NUMELEM = 5;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double[] score= new double[NUMELEM];
		int index;
		double max = 0;
		double distance;
		
		System.out.println("Enter " + score.length + " scores: ");
		for (int i = 0; i < score.length; i++) {
			score[i] = keyboard.nextDouble();
			if (i == 0) {
				max = score[i];
			}
			else {
				if (score[i - 1] < score[i])
					max = score[i];
			}
		}
		System.out.println("The highest score is " + max);
		System.out.println("The scores are: ");
		for (int i = 0; i < score.length; i++) {
			distance = max - score[i];
			System.out.println(score[i] + " differs from max by " + distance);
		}
		keyboard.close();
	}

}
