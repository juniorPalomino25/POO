package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
		
		public int Fibonacci(int n){
			int fib=0;
			if(n==0||n==1) {
				return n;
			} else {
				
			  return  Fibonacci(n-1) + Fibonacci(n-2);
				}
			}
			
		
		public void mostrarSerie(int n) {
		
			for(int i=0;i<n;i++) {
			System.out.print(Fibonacci(i)+" ");
			}
		
		
		}
	}
	

