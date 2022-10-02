package practice.array;

public class RecursiveArrayPrint {

	
	/**
	 * https://www.geeksforgeeks.org/linear-search/
	 * Recursive search start from the end of array.
	 * 
	 * if found return 1  else -1
	 *  example of linear search or sequential search
	 */
	public static void main(String[] args) {

		long[] array = { 9, 5, 8, 7, 6, 4 };

	}

	static int search(int size, long key, long array[]) {

		if (array[size - 1] == 0) {
			System.out.println("Element not found");
		} else if (array[size - 1] == key) {
			System.out.println("Element found at index = " + array[size - 1]);
			return size - 1;
		} else {
			return search(size - 1, key, array);
		}

		return -1;
	}

}
