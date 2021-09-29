package com.cogent.EmployeeManagementSystem;

public class Main3 {

	public static int division(int a, int b) {
		int c = 0;
		try {

			c = a / b; //it will create an object of arithmetic exception.
//			JVM will implicitly create the objects for all predefined runtime exceptions.
			return c;
		} catch (ArithmeticException e) {

		}

		finally {
			System.out.println("inside finally block");// finally block
		}
		// System.out.println("after catch block");// finally block code
		return -1;
	}

	public static void main(String[] args) {
		int result = division(10, 0);
		int result2 = division(10, 5);
		int result3 = division(10, 9);
		int result4 = division(10, 3);
		int result5 = division(10, 1);
		int result6 = division(10, 8);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		// TODO Auto-generated method stub
		/*
		 * Scanner sc=new Scanner(System.in); // in===> static ref cuz its used with
		 * className. System.out.println("Enter the data"); int c = 0,a=0,b=0; try {
		 * a=sc.nextInt(); b=sc.nextInt(); System.out.println(a); System.out.println(b);
		 * 
		 * c = a/b; } catch (ArithmeticException e) { // TODO Auto-generated catch block
		 * //e.printStackTrace(); System.out.println("exception occured");
		 * System.out.println("enter value of b again" ); b=sc.nextInt(); c=a/b;
		 * 
		 * //you will give 3 attempts to provide a non zero value for b. } //finally {
		 * System.out.println("inside the finally block");
		 * 
		 * //} System.out.println("division is"+c);
		 */
	}

}
