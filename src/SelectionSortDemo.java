import java.util.Scanner;

public class SelectionSortDemo {

	public static void main(String[] args) {
		PartiallyFilledArray pfa = new PartiallyFilledArray(10);
		System.out.println("Enter numbers to be sorted "
				+ "(For stop, enter a negative number):");
		Scanner keyboard = new Scanner(System.in);
		int a = 0;
		while(check(a)) {
			double point = keyboard.nextDouble();
			if (point < 0)
				break;
			pfa.add(point);
			a++;
		}
		pfa.selectionSort();
		
		System.out.println("Sorted array values:");
		while(check(a)) {
			System.out.println(pfa.getElement(a))
			a--;
		}
		keyboard.close();
	}
	
	public static boolean check(int a) {
		boolean result = true;
		if (a > 9 || a < 0)
			result = false;
		return result;
	}

}
