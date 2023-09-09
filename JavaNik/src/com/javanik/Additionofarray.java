package com.javanik;

import java.util.Scanner;

public class Additionofarray {
	
	int [][] input(){
		int a[][] = new int [3][2];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements : ");
		
		for(int i=0 ; i<a.length; i++) {
			for(int j=0; j< a[i].length; j++) { 
				a[i][j] = sc.nextInt();			
			}
		}
		return a;
	}	
	
	int [][] input1(){
		int b[][] = new int [3][2];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements : ");
		for(int i=0 ; i<b.length; i++) {
			for(int j=0; j< b[i].length; j++) { 
				b[i][j] = sc.nextInt();
				
			}
		}
		return b;
	}
	
	void result (int a [][] , int b[][]){
		int result [][] = new int [3][2];
		System.out.println("\nAddition of two matrices is: ");
		for(int i=0 ; i<b.length; i++) {
			for(int j=0; j< b[i].length; j++) { 
				result [i][j] = a[i][j] + b[i][j];
				System.out.print(result [i][j]+ "\t");
			}
			System.out.println();
		}	
	}

	public static void main(String[] args) {
		Additionofarray ob = new Additionofarray();
		int a [][]= ob.input();
		int b [][]= ob.input1();
		ob.result(a,b);	
	}
}
