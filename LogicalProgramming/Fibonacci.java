package com.jsp.LogicalProgramming;

public class Fibonacci {
public static void main (String []args) {
	int n=8;
	int x=0;
	int y=1;
	int z=0;
	while (z<=n) {
		System.out.println(z);
		z=x+y;
		x=y;
		y=z;
		
	}
	
	
}
}
