
public class DifferentEquals {
	private final static int NUMELEM = 10;
	public static void main(String[] args) {
		int[] c = new int[NUMELEM];
		int[] d = new int[NUMELEM];
		for (int i = 0; i < NUMELEM; i++) {
			c[i] = i;
			d[i] = i;
		}
		if (c.equals(d)) {
			System.out.println("c and d are equal by ==.");
		}
		else {
			System.out.println("c and d are not equal by ==.");
		}
		
		System.out.println("== only tests memory addresses.");
		
		if (equalArrays(c, d)) {
			System.out.println("c and d are equal by the equalArrays method ==.");
		}
		else {
			System.out.println("c and d are not equal by the equalArrays method==.");
		}
		System.out.println("And equalArrays method is usually a more usuful test");

	}

	public static boolean equalArrays(int[] a, int[] b) {
		for (int i  = 0; i < a.length; i ++) {
			if (a[i] == b[i]);
			else return false;
		}
		return true;
	}
}
