package calculator;

import java.util.Scanner;

public class calculator {
	
	
	public static int add(int num1, int num2) {
		return num1+num2;
		
	}

	public static int sub(int num1, int num2) {
		return num1-num2;
		
	}

	public static int multi(int num1, int num2) {
		return num1*num2;
		
	}

	public static double div(double num1, double num2) {
		if(num2==0){
			throw new IllegalArgumentException("number can not be divided");
		}
		return num1/num2;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:"+ " ");
		int input =sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the first number:"+ " ");
		int input1 =sc1.nextInt();
		
		System.out.println("The Addition is : "+ calculator.add(input, input1));
		System.out.println("The substration is : "+ calculator.sub(input, input1));
		System.out.println("The multiplication is : "+ calculator.multi(input, input1));
		System.out.println("The division is : "+ calculator.div(input, input1));

		

	}

}
