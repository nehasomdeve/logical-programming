package com.jsp.LogicalProgramming;

public class Count {
public static int digitCount(int n) {
	int count=0;
	while (n>0) {
	n=n/10;
	count++;
		}
	return count;
	}
public static void main (String[]args) {
	System.out.println(digitCount(1024));
}
}
