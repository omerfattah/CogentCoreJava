package com.cogent.EmployeeManagementSystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.cogent.EmployeeManagementSystem.model.Employee;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = null;
		try {
			employee = new Employee("ome01", "omer", "md", 123.00f);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			employee.setEmpSalary(5000.0f);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			FileOutputStream fos = new FileOutputStream("abc.txt");
//			fos.write("abc".getBytes());
//			fos.close();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
	}

}

//		
//		try {
////			System.out.println(10/0);
//			String s = null;
//			System.out.println(s.concat("Omer"));
//			System.out.println(10 / 0);
////			s is holding that means s is not referring to object
////			To call concat method we need object, since object is not there and 
////			we are trying to call concat method then it will throw NPE
//		} catch (ArithmeticException e) {
//
//		} catch (NullPointerException e) {
//
//		} 
//		catch (RuntimeException e) {
//
//		} 
//				
//		catch (Exception e) {
//			System.out.println("caught NPE");
//			System.out.println(e.getClass().getName());
//		}
//			catch (Throwable e) {
//
//			} 
//			
//		
////			catch (Object e) {
////
////			} 
//		
