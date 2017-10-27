package com.rudra.aks.hystrix.consumer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "krishna mohan";
		String str2 = "krishna  mohan";
		
		String[] res = str2.split("\\s+");
		
		String rep1 = str.replaceAll("\\s", "x");
		String rep2 = str2.replaceAll("\\s", "y");
		
		System.out.println("Rep1 " + rep1);
		System.out.println("Rep2 " + rep2);
		
		System.out.println(res[0] + "\n"+ res [1]);
	}

}
