package by.labwork.tasks;

import java.util.Scanner;

import java.util.Random;

public class LabTask04 {

	public static void main(String[] args) {
		int n;

		System.out.println("Enter a number");
		n = inputIntMethod();
		System.out.println();

		int[] arr = new int[n];

		initialization(arr);

		System.out.println();
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] == 0) || (arr[i] == 1)) {
				break;
			} else if ((arr[i] / arr[i] == 1) && (arr[i] % 2 != 0)) {
				System.out.printf("[%1d]", i);
			} else if (arr[i] == 2) {
				System.out.printf("[%1d]", i);
			}
		}
	}

//////////////////////////////////////////////////////////////////////
	public static int inputIntMethod() {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("n>");
		n = sc.nextInt();

		return n;
	}
///////////////////////////////////////////////////////////////////////
	public static void initialization(int[] arr) {

		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.printf("[%1d]", arr[i]);
		}
		return;
	}
}