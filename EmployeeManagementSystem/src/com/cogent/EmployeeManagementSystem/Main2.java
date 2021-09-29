package com.cogent.EmployeeManagementSystem;

public class Main2 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abcdefghijklmnopqrstuvwxyz");
		System.out.println(sb);
		StringBuffer sb1 =new StringBuffer("fghijklmnopqrst");
		sb.delete(0,5);
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb.compareTo(sb1));
		int h=sb.compareTo(sb1);
		System.out.println(h);
		//DC is by default it is capable to hold
		//16 chars
		
	}
}






















//	}
//		// TODO Auto-generated method stub
//
//		// ip: 192.168.1.1
//
//		String ip = "192.168.1.1";
//		// A B C D
//		// do we need to split this IP address on the basis of .?
//		// o to 255
//
//		String[] ipAddress = ip.split("\\.");
//		// \\.
//		// \\==> \.
//		// \. is escape sequence
//		try {
//			for (String string : ipAddress) {
//				System.out.println(string);
//
//				System.out.println(Integer.parseInt(string));
//
//				int a = Integer.parseInt(string);
//				if (a >= 0 && a <= 255) {
//
//				} else
//					System.out.println(0);
//			}
//
//			int classCell = Integer.parseInt("abc");
//
//			if (classCell > 0 && classCell <= 127) {
//				System.out.println("it belongs to class A");
//			} else if (classCell >= 128 && classCell <= 191) {
//				System.out.println("it belongs to class B");
//			} else if (classCell >= 192 && classCell <= 223) {
//				System.out.println("it belongs to class C");
//			} else
//				System.out.println("its not avalid class");
//		} catch (NumberFormatException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} // return terminates the execution;
//	}
//}
//
////		String s="omer md";
////		String s2="md";
////		String s3= new String("Cogent University");
////		//CN ref= RT allocation
////		
////		String s4="omer md";
////		String s5= "md";
////		
////		System.out.println(s4.concat(" "+s5));
////		//concatenation is the only one solution where we can get new object
////		System.out.println(s4);
////		//because string objects are immutable
////		System.out.println(s4.contains(s5));
////		System.out.println(s4.replace('e', 'E'));
////		System.out.println(s3.toLowerCase());
////		System.out.println(s3.toUpperCase());
////		System.out.println(s.substring(3));
////		System.out.println(s3.valueOf(true));
////		



















//======================================================================================

//String s = "cogent university";
//
//System.out.println(s.length());
//
////length method : string class
////length property : array
//
//System.out.println(s.isEmpty());
////	System.out.println(s.isBlank()); // we will get an error as we are using 1.8 version
//
//
//int a=10,b=10;
//System.out.println(a==b);
//String result = s.substring(7);
//
//System.out.println(result);
//String result2 = s.substring(0,6);
//
//System.out.println(result2);
//
//System.out.println(s.equals("cogent university"));
//System.out.println(s=="cogent university");
//System.out.println(s==new String("cogent university"));
//
//
//System.out.println("omer".codePointAt(0));
//System.out.println("OMER".codePointAt(0));
//System.out.println("omer".compareTo("OMER"));
//System.out.println("omer".compareTo("omeq"));
//System.out.println("omer".compareTo("omes"));
//System.out.println("omer".compareTo("cogent"));
//



//=======================================================================

//sb.append("yesmatches");
////10
//
//System.out.println(sb.capacity());
//System.out.println(sb.length());
//
//sb.append("right");
////5
//
//System.out.println(sb.capacity());
//System.out.println(sb.length());
//
//sb.append(" ");
//
//System.out.println(sb.capacity());
//System.out.println(sb.length());
//
//sb.append("a");
//
//System.out.println(sb.capacity());
//System.out.println(sb.length());
