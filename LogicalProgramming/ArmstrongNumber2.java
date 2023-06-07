package com.jsp.LogicalProgramming;

public class ArmstrongNumber2 {
public static void main (String []args) {
int n=153;
int temp=n; int sum=0;
while (n>0) {
	int lastdigit= n%10;
	int arm= (lastdigit* lastdigit* lastdigit);
	sum= sum+arm;
	n=n/10;
}
if (sum==temp)	{
	System.out.println("it is a armstrong number");
}else {System.out.println("it is not");}
	
	
	
	
	
	
	
	
	
}

}
