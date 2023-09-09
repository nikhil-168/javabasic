package com.javanik;

import java.util.Scanner;

public class NumbersProblems {
	public int getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range ");
		int n = sc.nextInt();
//		sc.close();
		return n;
	}

	public void findPerfectNumber(int n) {
		System.out.println("Perfect numbers between 1 and " + n + " are:");

		for (int i = 2; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= i/2 ; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");	
			}
		}
	}
	
	public void findArmstrongNumber(int n) {
		System.out.println("\n\nArmstrong numbers between 1 and " + n + " are:");
		for(int number=1; number<=n; number++) {
			int tempNum = number ; 
			int originalNumber = number , numDigits=0;
			
			while(tempNum!=0) {
				tempNum /= 10 ;				  // Removes the last Digit
				numDigits ++ ;		
			}
			
			tempNum = number ;
			int result = 0 ;
			
			while(tempNum!=0) {
				int digit = tempNum % 10 ;
				result += Math.pow(digit, numDigits);
				tempNum/= 10 ;
			}
			if (result == originalNumber) 
				System.out.print(originalNumber+ " ");  
			
		}		
	}
	
	public void findPrimeNumber(int n) {
		System.out.println("\n\nPrime numbers between 1 and " + n + " are:");
		for(int i=2; i<=n ; i++) {
			int count=0;
			for(int j=2; j<=i/2 ; j++) {
				if(i%j==0)
					count++;
			}
			if (count==0) 
				System.out.print(i+" ");
		}
	}
	
	public void findNeonNumber (int n) {
		int sum = 0 ;
		int Square = n*n ;
		while(Square!=0) {
			int digit = Square % 10 ;
			sum += digit ;
			Square/=10 ;			
		}
		if(sum==n) {
			System.out.println("\n"+ n +" " +"is a Neon number");
		}
		else {
			System.out.println("\n"+ n +" " +"is not a Neon number");
		}
	}
	
	public static void main(String[] args) {
		NumbersProblems np = new NumbersProblems();
//		np.getInput();
		int n = np.getInput();
		np.findPerfectNumber(n);
		np.findArmstrongNumber(n);
		np.findPrimeNumber(n);
		np.findNeonNumber(n);
	}
}


