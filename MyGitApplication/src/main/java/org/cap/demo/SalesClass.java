package org.cap.demo;

public class SalesClass {

	private int[] mydata={12,3,45,0,-9};
	
	public void display(){
		System.out.println("Sales Class Display Method");
		int sum=0;
		for(int num:mydata){
			sum+=num;
			System.out.println(num);
		}
		
		System.out.println("print Sum:" + sum);
	}
	
}
