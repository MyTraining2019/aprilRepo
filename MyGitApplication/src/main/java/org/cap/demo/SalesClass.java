package org.cap.demo;

public class SalesClass {

	private int[] mydata={12,3,45,0,-9};
	
	public void display(){
		System.out.println("Sales Class Display Method");
		
		for(int i=0;i<mydata.length;i++)
			System.out.println(mydata[i]);
	}
	
}
