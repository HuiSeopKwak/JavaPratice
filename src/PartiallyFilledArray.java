// Class for a partially filled array of doubles.
// The class enforces the following invariant: 
// All elements are at the beginning of the array 
// in locations 0, 1, 2, and so forth up to a highest index with no gaps.
public class PartiallyFilledArray {
	private int maxNumberElements;	// Same as a.length
	private double[] a;
	private int numberUsed; 	// Number of indices currently in use
	
	// Sets the maximum number of allowable elements to 10.
	PartiallyFilledArray(){
		maxNumberElements = 10;
		a = new double[maxNumberElements];
		numberUsed = 0;
	}
	
	// precondition arraySize > 0
	PartiallyFilledArray(int arraySize){
		if(arraySize <= 0) {
			System.out.println("Error Array size zero or negative.");
			System.exit(0);
		}
		maxNumberElements = arraySize;
		a = new double[maxNumberElements];
		numberUsed = 0;
	}
	
	PartiallyFilledArray(PartiallyFilledArray original){
		if(original == null) {
			System.out.println("Fatal error: aborting system.");
			System.exit(0);
		}
		maxNumberElements = 
				original.maxNumberElements;
		numberUsed = original.numberUsed;
		a = new double[maxNumberElements];
		for(int i = 0; i < numberUsed; i++) {
			a[i] = original.a[i];
		}
	}
	
	// adds newElement to the first unused array position.
	public void add(double newElement) {
		a[numberUsed] = newElement;
		numberUsed++;
	}
	
	public double getElement(int index) {
		if(index < 0 || index >= numberUsed) {
			System.out.println("Error:Illegal or unused index.");
			System.exit(0);
		}
		return a[index];
	}
	
	// index must be an index in use or the first unused index.
	public void resetElement(int index, double newValue) {
		if(index < 0 || index >= maxNumberElements) {
			System.out.println("Error:Illegal Index.");
		}else if(index > numberUsed) {
			System.out.println("Error: Changing an index that is too large.");
			System.exit(0);
		}else {
			a[index] = newValue;
		}
	}
	
	public void deleteLast() {
		if(empty()) {
			System.out.println("Error:Deleting from an empty array.");
			System.exit(0);
		}else{
			// decrement numUsed since we delete the last one.
			numberUsed--;
		}
	}
	
	// deletes the element in position index
	public void delete(int index) {
		if(index < 0 || index >= numberUsed) {
			System.out.println("Error:Illegal or unused index.");
			System.exit(0);
		}
		
		for(int i = index;i<numberUsed;i++) {
			// moves down all elements with indices 
			// higher than the deleted element.
			a[i] = a[i+1];
		}
		numberUsed--;
	}
	
	public boolean empty() {
		return (numberUsed == 0);
	}
	
	public boolean full() {
		return (numberUsed == maxNumberElements);
	}
	
	public int getMaxCapacity() {
		return maxNumberElements;
	}
	
	public int getNumberOfElements() {
		return numberUsed;
	}

	public void selectionSort() { // in PartiallyFilledArray
		int i;
		System.out.println("Array values before sorting: ");
		for(i = 0;i < a.length;i++)
			System.out.println(a[i] + " ");
		System.out.println();
		
		// Perform selection sort on a
		System.out.println("Sorted array values: ");
		for(i = 0;i < a.length;i++)
			System.out.println(a[i] + " ");
		System.out.println();
	}
}