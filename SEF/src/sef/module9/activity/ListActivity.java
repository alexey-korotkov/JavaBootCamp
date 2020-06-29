package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();
		list.add(0,"Ann");
		list.add(1,"Bob");
		list.add(2,"Chris");


		//2 - Call print method to print the list passed as its parameter.
		
	}
	
	void print(List list)
	{
		Iterator i =new Iterator(){
			
		
		while(i.hasNext()){
			system.out.println(i.next());
		}
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
	
	}
}
