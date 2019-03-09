package misc;

public class PrimeNumbers {

	public static void main(String[] args) {
		{		
		       
		      for (int i = 1; i <= 100; i++) //1 to 100.        
		       { 		  	  
		          boolean flag = true; 	  
		          for(int j = 2; j<i-1; j++)
			  {
		             if(i%j==0)//this condition shows not prime so discard it.
			     {
		 		flag = false;
		 		break;
			     }
			  }
			  if (flag==true)
			  {

				  System.out.print(i + " ");
			  }	
		       }	
	}

}
}
