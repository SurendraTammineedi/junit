package com.mycompany.junit;

public class MyMath {
	
	//{1,2,3}=sum =6
	
	public int calculateSum(int[] numbers) {
		int sum=0;
		for(int number:numbers) {
			sum+=number;
		}
		return sum;
	}

}
