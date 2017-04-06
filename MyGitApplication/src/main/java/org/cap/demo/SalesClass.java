package org.cap.demo;

public class SalesClass {

	private int[] mydata={12,3,45,0,-9};
	
	public void display(){
		System.out.println("Sales Class Display Method");
		int sum=0;
		for(int i=0;i<mydata.length;i++){
			sum+=mydata[i];
			System.out.println(mydata[i]);
		}
		
		System.out.println("sum:" + sum);
	}
	
	
	public void discard(){
		System.out.println("Discard");
	}
	
}
