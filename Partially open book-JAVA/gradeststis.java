package partiallyopen;

import java.util.Scanner;
import java.util.Arrays;

public class gradeststis {
	public static int[] grades;

	public static void main(String[] args) {
		readGrades();


		print(grades);

		System.out.printf("The average is :%.2f\n", avg(grades));
		System.out.printf("The median  is :%.2f\n", median(grades));
		System.out.printf("The minimum is :%d\n", min(grades));
		System.out.printf("The maximum is :%d\n", max(grades));
		System.out.printf("The STandard deviation is:%.2f", stddev(grades));
	}

	public static void readGrades() {
	int numberOfStudents;
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the no of Student : ");
	numberOfStudents = in.nextInt();
	grades = new int[numberOfStudents];
	for (int i = 0; i < grades.length; i++) {
	System.out.print("Enter the grade of student " + (i + 1) + ": ");
	grades[i] = in.nextInt();
	}
	}

	public static double stddev(int[] array) {
	int n = array.length;
	int sumOfSquare = 0;
	double meanSquared = Math.pow(avg(array), 2);
	double standardDeviation;
	for (int i = 0; i < n; i++)
	{
	sumOfSquare += array[i] * array[i];
	}
	standardDeviation = Math.sqrt((1.0 / n) * sumOfSquare - meanSquared);
	return standardDeviation;
	}

	public static double median(int[] array) {
	Arrays.sort(array);
	int n = array.length;
	double median;
	if (n % 2 == 0) {
	median = (array[(n / 2) - 1] + array[n / 2]) / 2.0;
	}
	else 
	{
	median = array[((n + 1) / 2) - 1];
	}
	return median;
	}

	public static double avg(int[] array) {
	int sum = 0;
	double avg;
	for (int i = 0; i < array.length; i++) 
	{
	sum += array[i];
	}
	avg = (double)sum / array.length;
	return avg;
	}

	public static int min(int[] array) {
	int min = array[0];
	for (int i = 0; i < array.length; i++)
	{
	if (array[i] < min) 
	{
	min = array[i];
	}
	}
	return min;
	}

	public static int max(int[] array) {
	int max = array[0];
	for (int i = 0; i < array.length; i++)
	{
	if (array[i] > max)
	{
	max = array[i];
	}
	}
	return max;
	}

	public static void print(int[] array) 
	{
	System.out.print("The values are :[");
	for (int i = 0; i < array.length; i++) 
	{
	if (i == 0) 
	{
	System.out.print(array[i]);
	}
	else
	{
	System.out.print(", " + array[i]);
	}
	}
	System.out.println("]");
	}
}
