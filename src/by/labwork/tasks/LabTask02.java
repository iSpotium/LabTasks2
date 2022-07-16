package by.labwork.tasks;

import java.util.Random;

import java.util.Scanner;

public class LabTask02 {

	public static void main(String[] args) {
		int n;
		int sum = 0;

		System.out.println("Enter a number");
		n = inputIntMethod();

		int[] arr = new int[n];

		initialization(arr);

		System.out.println();
		System.out.println("Numbers > 15");

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 15) {
				temp++;
				System.out.printf("[%2d]", arr[i]);
			}

		}

		System.out.println();
		System.out.println("Numbers < 2");

		int temp2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 2) {
				temp2++;
				System.out.printf("[%2d]", arr[i]);
			}
		}

		System.out.println();

		int value = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 4) {
				value++;
			}
		}

		System.out.println("Numbers when divided by 5 leave a remainder of 4");

		int[] arr2 = new int[value];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 4) {
				arr2[j++] = arr[i];
			}
		}

		for (int j = 0; j < arr2.length; j++) {
			System.out.printf("[%2d]", arr2[j]);
			sum = sum + arr2[j];
		}
		sum = outputIntMethod(sum);
	}

///////////////////////////////////////////////////////////////////
	public static int inputIntMethod() {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("n>");
		n = sc.nextInt();

		return n;
	}

////////////////////////////////////////////////////////////////////
	public static int outputIntMethod(int sum) {
		System.out.println();
		System.out.println("Summa = " + sum);

		return sum;
	}

////////////////////////////////////////////////////////////////////
	public static void initialization(int[] arr) {

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.printf("[%1d]", arr[i]);
		}
		return;
	}
}