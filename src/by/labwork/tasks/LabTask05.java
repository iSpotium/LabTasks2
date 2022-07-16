package by.labwork.tasks;

import java.util.Random;
import java.util.Scanner;

public class LabTask05 {

	public static void main(String[] args) {
		int n;

		System.out.println("Enter a number");
		n = inputIntMethod();
		System.out.println();

		int[] arr = new int[n];

		initialization(arr);

		System.out.println();

		int temp = arr[0];
		int value = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] >= temp) {
				temp = arr[i];
				System.out.printf("[%1d]", arr[i]);
			}else if (arr[i] < temp) {
				value++;
			}
		}
		System.out.println();
		System.out.println(value + " Elements need to be thrown out to become a sequence");

	}
/////////////////////////////////////////////////////////////////////////////////////////
	public static void initialization(int[] arr) {

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.printf("[%1d]", arr[i]);
		}
		return;
	}
//////////////////////////////////////////////////////////////////////////////
	public static int inputIntMethod() {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("n>");
		n = sc.nextInt();

		return n;
	}
}