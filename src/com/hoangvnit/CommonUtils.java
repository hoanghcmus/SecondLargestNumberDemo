package com.hoangvnit;

public class CommonUtils {
	public static void findOutAndPrintTheSecondLargestNunber(int[] arrayNumber) {
		if (arrayNumber.length == 0)
			return;

		printArrayNumber(arrayNumber);

		int largest = arrayNumber[0];
		int secondLargest = arrayNumber[0];

		int arrSize = arrayNumber.length;
		for (int i = 0; i < arrSize; i++) {

			if (arrayNumber[i] > largest) {
				secondLargest = largest;
				largest = arrayNumber[i];

			} else if (arrayNumber[i] > secondLargest && arrayNumber[i] < largest) {
				secondLargest = arrayNumber[i];
			}
			
			if (i == arrSize - 1) {
				if (secondLargest == arrayNumber[0])
					System.out.println("\nWe don't have the second largest. Because all number are equal\n");
				else
					System.out.println("\nSecond largest number is: " + secondLargest + "\n");
			}
		}
	}

	public static void printArrayNumber(int[] arrayNumber) {
		if (arrayNumber.length == 0)
			return;

		System.out.println("The given array is:");
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.print(arrayNumber[i] + "\t");
		}
	}
}
