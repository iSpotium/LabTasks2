package by.labwork.tasks;

import java.util.Scanner;

public class LabTask01 {

	public static void main(String[] args) {
		double x;
		double y;

		System.out.println("Enter a number X");
		x = inputIntMethod();
		System.out.println();

		System.out.println("Enter a number Y");
		y = inputIntMethod();
		System.out.println();

		double numsum;
		double densum;
		double sum;

		numsum = numeratorsum(x, y);
		
		densum = denominatorsum(x, y);
		
		sum = summa(x, y, numsum, densum);
		System.out.println("sum = " + sum);

	}

//////////////////////////////////////////////////////////////////////
	public static int inputIntMethod() {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("n>");
		n = sc.nextInt();

		return n;
	}

//////////////////////////////////////////////////////////////////////////
	public static double numeratorsum(double x, double y) {
		double sum;

		sum = Math.pow(Math.sin(x + y), 2) + 1;

		return sum;
	}

/////////////////////////////////////////////////////////////////////////
	public static double denominatorsum(double x, double y) {

		double partmodul;
		double den;

		partmodul = x - (2 * x) / (1 + (Math.pow(x, 2) * Math.pow(y, 2)));
		den = 2 + Math.abs(partmodul);

		return den;
	}

/////////////////////////////////////////////////////////////////////////
	public static double summa(double x, double y, double numsum, double densum) {
		double sum;

		sum = numsum / densum + x;

		return sum;
	}
}
