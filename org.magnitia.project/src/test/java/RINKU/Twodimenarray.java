package RINKU;

public class Twodimenarray {

	public static void main(String[] args) {
		  
		int a[][] = new int [3] [2];
		a[0][0]=100;
		a[0][1]=200;
				
		a[1][0]=300;
		a[1][1]=400;
				
		a[2][0]=500;
		a[2][1]=600;
		
		int [][]a1 = { {10,20}, {30,40}, {50,60} } ;
		
		System.out.println(a.length); // row count 
		System.out.println(a1[0].length); //column count
		System.out.println(a1[2][1]);
		
		for ( int i =0; i<=2;i++)
			for (int j=0; j<=1; j++)
			{
				System.out.println(a[i][j]);
			}
		
		for (int arr[]:a1)
		{
			for (int x:arr)
			{
				System.out.println(x);
			}
			
			System.out.println();
		}
			
		
						
				

	}

}
