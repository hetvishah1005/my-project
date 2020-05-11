import java.util.Scanner;
public class ShowGrade{
 	public static void main(String[] arg){
         System.out.println(" the grade is ");
	 Scanner in = new Scanner(System.in);
 	 double num = in.nextDouble();
         System.out.println(" grade = " + num);
         grade(num);		
}
   public static void grade(double a){
		if(a >= 80 && a<= 100)
                   System.out.println(" a ");	
		else if(a >= 60 && a<= 79)
                   System.out.println(" b ");
		else if(a >= 50 && a<=59)
                   System.out.println(" c ");
                else 
                   System.out.println(" fail ");

}
}