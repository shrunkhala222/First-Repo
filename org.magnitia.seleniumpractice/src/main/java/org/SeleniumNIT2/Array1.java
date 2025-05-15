package org.SeleniumNIT2;

public class Array1 {

	public static void main(String[] args) {
		 //approach1
		/*int a[]=new int [5]; // this is fixed array not possible to add values in the future
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50; */
		
		//approach2 in this approach we can add more values in the future
		
		int a1[] = {10,20,30,40,50};
		
		System.out.println(a1.length);
		System.out.println(a1[2]);
		
		for (int i=0; i<=4; i++)
		{
			System.out.println(a[i]);
		}
		
             //or 
		for (int i=0; i<a.length; i++)
	}

}
