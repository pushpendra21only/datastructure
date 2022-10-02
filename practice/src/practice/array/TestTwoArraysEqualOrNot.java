package practice.array;


// example of linear search or sequential search
public class TestTwoArraysEqualOrNot {

	public static void main(String args[]) {

		Integer A[] = { 2, 4, 5 };
		Integer B[] = { 1, 2, 5 };

		for (int i = 0; i < A.length; i++) {

			boolean isElementExist = isElementExistInArray(A[i], B);

			if (!isElementExist) {
				System.out.println("Arrays are not same, this element not exist in Array B= " + A[i]);
				return;
			}

		}

	}

	static boolean isElementExistInArray(Integer key, Integer B[]) {
		for (int i = 0; i < B.length; i++) {
			if (key == B[i]) {
				return true;
			}
		}
		return false;
		/*
		 * if (count > 0) { return true; } else return false;
		 */
	}
}
