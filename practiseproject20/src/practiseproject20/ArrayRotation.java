package practiseproject20;

class RA {
	public void rotate(int[] number, int k) {
		if (k > number.length)
			k = k % number.length;
		int[] result = new int[number.length];
		for (int i = 0; i < k; i++) {
			result[i] = number[number.length - k + i];
		}
		int j = 0;
		for (int i = k; i < number.length; i++) {
			result[i] = number[j];
			j++;
		}
		System.arraycopy(result, 0, number, 0, number.length);
	}
}

public class ArrayRotation {
	public static void main(String[] args) {
		RA r = new RA();
		int arr[] = { 1, 9, 4, 5, 3, 7, 3, 0 };
		r.rotate(arr, 5);
		System.out.println("Array after rotation:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("  " + arr[i]);
		}
		
	}
}
