package com.jsp.LogicalProgramming;

public class Sum {
public static int sumOfNaturalNumbers(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
	}
		return sum;
}	
	
	public static void main(String[]args) {
		System.out.println(sumOfNaturalNumbers(6));
		
	}
	
	
}


