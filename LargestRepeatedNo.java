import java.util.Scanner;
public class LargestRepeatedNo{
		static int max = 0; 
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int num[] = new int[6];
		System.out.println("enter 6 numbers :");
		for(int i = 0; i < 6; i ++){
		        num[i] = in.nextInt();
		          }
		      maximum(num);
		      count(num);
                                 } 
		public static void maximum(int a[]){
		// static int max = 0;
                                  for(int i = 0; i < 6; i ++){
		if(a[i] > max)
			max = a[i] ;
		               }
		System.out.println("enter the max value :" + max);  
		}	
		public static void count(int b[]){
		    int c = 0;
		for(int i = 0; i < 6; i++){
			if(b[i] == max)
			c ++ ;
			}
		System.out.println("most repeated max value:" + c);	
                 		      }
               }
 