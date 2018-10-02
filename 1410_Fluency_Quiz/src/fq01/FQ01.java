package fq01;

/*********************************************************************
 * SuperFast* You are given 2 integer values: the average speed and the maximum
 * speed of a vehicle. The question is: is the vehicle super fast?
 * 
 * Return true if at least one of the following is true: avgSpeed is greater 100
 * mph or maxSpeed is greater 150 mph. Except if it is a plane. If the parameter
 * "isPlane" is true, both the avgSpeed and the maxSpeed need to be greater 300
 * in order to return true (to be considered super fast).
 * 
 * E.g. superFast(94, 150, false) -> false superFast(101, 140, false) -> true
 * superFast(83, 162, false) -> true superFast(111, 162, false) -> true
 * superFast(111, 301, true) -> false superFast(301, 320, true) -> true
 ***********************************************************************/

public class FQ01 {
	// TODO: complete the method superFast as described above
	public static boolean superFast(int avgSpeed, int maxSpeed, boolean isPlane) {
		if ((avgSpeed > 100 || maxSpeed > 150) && !isPlane) {
			return true;
		} else if (isPlane && (avgSpeed > 300 && maxSpeed > 300)) {
			return true;
		}
		return false;
	}

	// = = = test code - should not be changed = = = //
	public static void main(String[] args) {
		test(94, 150, false, false);
		test(100, 142, false, false);
		test(83, 151, false, true);
		test(101, 139, false, true);
		test(121, 157, false, true);
		test(101, 139, false, true);
		test(301, 299, true, false);
		test(111, 301, true, false);
		test(301, 331, true, true);
	}

	private static void test(int i, int j, boolean b, boolean expectedResult) {
		boolean result = superFast(i, j, b);

		System.out.printf("superFast(%d, %d, %b) -> %b .. %s%n", i, j, b, result,
				((result == expectedResult) ? "ok" : ("should be " + expectedResult)));
	}

}