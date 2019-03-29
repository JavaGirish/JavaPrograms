import java.util.Scanner;
 
class PrimeNo
{
   public static void main(String args[])
   {
      int n; 
     
      System.out.println("Enter an integer to check if its prime");
      Scanner in = new Scanner(System.in);
     
      n = in.nextInt();
     
      for(int a=1;a<n/2;a++)
      {
    	  if(n%a==0)
    	  {
    		  break;
    	  }
      }
   }
}