package RINKU;

public class Array1 {

	public static void main(String[] args) {
	  int a[] =  new int [5];
	           a[0]= 10;
	           a[1]= 20;
	    	   a[2]= 30;
	    	   a[3]= 40;
	    	   a[4]= 50;
	    	   
	    	   
	    	   int a1[] = {5,10,15,20,25};
	    	   
	    	   System.out.println(a.length);
	    	   System.out.println(a1.length);	   
	    	   System.out.println(a1[2]);
	    	   System.out.println(a[4]);
	    	   
	    	 for (int x:a)
	    		   
	    			   {
	    				   System.out.println(x);
	    			   
	    			   } 
	    	 
	    	 //or 
	    	 
	    	 for (int i=0; i<a1.length;i++)
	    		 
	    	 {
	    		 System.out.println(a1[i]);
	    	 }

	}

}
