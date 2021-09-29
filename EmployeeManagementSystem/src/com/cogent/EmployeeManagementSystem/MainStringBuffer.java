package com.cogent.EmployeeManagementSystem;

public class MainStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		//DC is by default it is capable to hold
		//16 chars
		
		sb.append("yesmatches");
		//10
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("right");
		//5
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" ");
		// 1 char
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("a");
		//1 char
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}

}
