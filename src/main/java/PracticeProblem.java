/*Title: Arrays 5.1
Name: Angie Seto
Date created: April 28, 2026
Date updated: April 29, 2026*/

public class PracticeProblem {

	public static void main(String args[]) {

		int[] testArray = new int[3];
		testArray[0] = 2;
		testArray[1] = 9;
		testArray[2] = 10; 
		System.out.println(testArray[2]);

	}
//q1
 		public static int[] createIntArray() {
			int[] arr = new int[5];

			for (int i = 0; i < 5; i++) {
				arr[i] = i + 1; //starts from 0, +1 every time, so it's 1-5
			}
			return arr;
		}

		//q2
		public static String[] createArray (String one, String two, String three, String four) {

			String[] arr = {one, two, three, four};
			return arr;
		}

	//q3 (4??)
	public static String getElement(int num, String[] arr) {
		return arr[num];
	}

	//q 4 -> 5
	public static double replaceElement(int num, double num1, double[] arr) {
		arr[num] = num1;
		return arr[num];
	}
}
