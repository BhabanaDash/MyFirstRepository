package com.cg.functiondemo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String>list=new ArrayList<String>();
		//list.add("ankit");
		//list.add("mayank");
		//list.add("irfan");
		//list.add("jai");
		//list.forEach((n))->System.out.println(n));
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(6);
		numbers.add(8);
		numbers.add(4);
		Consumer<Integer> method=(n) -> {System.out.println(n);};
		numbers.forEach(method);;
	

	}

}
