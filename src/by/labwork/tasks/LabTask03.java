package by.labwork.tasks;

import java.util.Scanner;

public class LabTask03 {

	public static void main(String[] args) {
		int a;
		int b;
		int h;

		System.out.println("Enter a number A");
		a = inputIntMethod();
		System.out.println();

		System.out.println("Enter a number B");
		b = inputIntMethod();
		System.out.println();

		System.out.println("Enter a number H");
		h = inputIntMethod();
		System.out.println();

		function(a, b, h);
	}

/////////////////////////////////////////////////////////////////////
	public static int inputIntMethod() {

		int x;

		Scanner sc = new Scanner(System.in);

		System.out.print(">");
		x = sc.nextInt();

		return x;
	}

/////////////////////////////////////////////////////////////////////
	public static void function(int a, int b, int h) {
		double fx;

		System.out.println("__________________________________");
		System.out.printf("|\t%3s\t|\t%3s\t|\n", "x", "f(x)");
		System.out.println("__________________________________");

		for (double i = a; i <= b; i = i + h) {
			fx = Math.tan(i);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", i, fx);
		}
		System.out.println("__________________________________");

	}
}