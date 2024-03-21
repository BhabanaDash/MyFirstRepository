package com.cg.functiondemo;

public class TestSubtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Subtraction sub=new Subtraction() {
			@Override
		//	public void subtract(int a, int b) {
				System.out.println(a-b);
		//	}
	//	};
		//sub.subtract(10, 2);
			
			// Using lambda expression
			// Whenever there is return statement curly brackets are mandatory
			Subtraction sub2=(a,b)->{
				return (a-b);
			};
			System.out.println(sub2.subtract(20, 12));
			
	//	Subtraction sub2=(a,b)->{
			//System.out.println(a-b);
			//};
			
			//sub2.subtract(20, 12);
			// curly brackets can be omitted if there is only single line of code
			// If there is single arguement then paranthesis can be omitted
			Subtraction sub=()->
			System.out.println("welcome");
		}

}
