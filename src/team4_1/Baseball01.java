package team4_1;

public class Baseball01 {

	public static boolean checkOverlap(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static int[] randNumGenerator() {
		int[] genNums = new int[3];
		int tmp;
		for (int i = 0; i < genNums.length; i++) {
			do {
				tmp = (int) (Math.random() * 9) + 1;
			} while (checkOverlap(genNums, tmp));
			genNums[i] = tmp;
		}
		return genNums;
	}

}
