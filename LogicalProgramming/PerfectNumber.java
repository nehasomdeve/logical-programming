package com.jsp.LogicalProgramming;

public class PerfectNumber {
public static String isPerfectNumber(int n) {
	int sum=0;
	for(int i=1; i<n; i++) {
		if(n%i==0) {
			sum=sum+i;
			}
	}
		if(sum==n) {
			return "given no. is perfect no.";
		}else return "given no.is not perfect no.";
	}
	public static void main(String []args) {
		System.out.println(isPerfectNumber(6));
	}
	}

