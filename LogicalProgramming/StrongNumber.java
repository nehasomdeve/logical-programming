package com.jsp.LogicalProgramming;

public class StrongNumber {
public static boolean isStrongNumber(int n) {
	int temp=n; int sum=0;
	while(n>0) {
	int lastdigit=n%10;
	int fact=1;
	for(int i=1; i<= lastdigit;i++) {
		fact=fact*i;
	}
		sum=sum+fact;
		n=n/10;
		}if (sum==temp) {return true;
		      }else {
		    	  return false;
		      }
		}

public static void main(String[]args) {
	System.out.println(isStrongNumber(145));
}	
}

