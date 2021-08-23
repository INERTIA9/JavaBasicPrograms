package com.javafellowship;
import java.util.Scanner;
public class HeadvsTails {
public static void main(String[] args) {
System.out.println("WELCOM TO HEADSvsTAILS PERCENTAGE USE CASE");
Scanner sc =  new Scanner(System.in);
System.out.println("Enter the number of flips");
int n=sc.nextInt();
double x =0;
for (int i=1; i<n;i++){
{ 
	double result=Math.random();
	if(result<0.5) {
		x++;
	}
	}
System.out.println("Percentage of tail="+x/n);
System.out.println("Percentage of heads="+(n-x)/n);
}		
}
}

	
	
	




