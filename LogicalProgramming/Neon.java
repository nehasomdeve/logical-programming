package com.jsp.LogicalProgramming;

public class Neon {
public static String isNeonNumber(int n) {
	int sqr=n*n; int sum=0;
	while(sqr>0) {
	int lastdigit=sqr%10;
	sum=sum+lastdigit;
	sqr=sqr/10;}
	if(sum==n) {
		return "given no. is neon number";
	}else {
		return "given no. is not neon number";
	}
}
public static void main (String []args) {
	System.out.println(isNeonNumber(9));
}
	
}


