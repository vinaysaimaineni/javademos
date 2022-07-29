package practiseproject29;

import java.util.Scanner;

 public class linearsearchalgoritham {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);

		System.out.println("Enter length of array : ");
		int length = num.nextInt();
		int[] input = new int[length];
		System.out.printf("Enter %d numbers %n", length);
		for (int i = 0; i < length; i++) {
			input[i] = num.nextInt();
		}
		System.out.println("Please enter target number");
		int target = num.nextInt();
		int index = linearSearch(input, target);
		if (index == -1) {
			System.out.printf(" %d is not found in array %n", target);
		} else {
			System.out.printf("%d is found in array at index %d %n", target, index);
		}
		num.close();
	}

	public static int linearSearch(int[] input, int target) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == target) {
				return i;
			}
		}
		return -1;
	}


	public static int linearing(int arr[], int x) {

		int arrlength = arr.length;
		for (int i = 0; i < arrlength - 1; i++) {

			if (arr[i] == x) {

				return i;

			}
		}

		return -1;

	}

}