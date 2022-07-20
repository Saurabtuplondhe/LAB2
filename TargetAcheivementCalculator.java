import java.util.Scanner;

public class TargetAcheivementCalculator {
       private static int[] transactions;
       private static int dailyTarget;
       private static int nooftargets;
       public static void main(String [] args) {
    	   int sum;
    	   Scanner sc = new Scanner (System.in);
    	   System.out.println("Enter the size of transaction array");
    	   int s = sc.nextInt();
    	   transactions = new int[s];
    	   System.out.println("Enter the values of aray");
    	   for(int i=0;i<s;i++) {
    		   transactions[i]=sc.nextInt();
    	   }
    	   System.out.println("Enter the number of targets");
    	   nooftargets = sc.nextInt();
    	   for(int i=0;i<nooftargets;i++) {
    		   System.out.println("Enter the value of "+(i+1)+" target");
    		   dailyTarget = sc.nextInt();
    		   sum=0;
    		   for(int j=0;j<s;j++) {
    			   sum+=transactions[j];
    			   if(sum>=dailyTarget) {
    				   System.out.println("Target achieved at "+(j+1)+" transcation");
    				   break;
    			   }
    		   }
    		   if(sum<dailyTarget) {
    			   System.out.println("Target Not Achieved");
    		   }
    	   }
       }
}
