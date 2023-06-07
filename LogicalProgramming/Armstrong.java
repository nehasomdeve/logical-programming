package com.jsp.LogicalProgramming;

public class Armstrong {
public static boolean isArmstrongNumber(int n) {
	int z=n; int count=0; int sum=0;
	while(z>0) {
	z= z/10;
	count++;}
	z=n;
	while(z>0) {
		int pro=1;
		int lastdigit=z%10;
	for(int i=1; i<=count; i++) {
		pro=pro*lastdigit;
		
		}
	sum=sum+pro;
	z=z/10;}
	if(n==sum) { return true;} else {return false;}
	}
public static void main (String []args) {
System.out.println(isArmstrongNumber(153));	
	
}		
}

	




