//import java.util.Scanner; 
public class PrimitiveData{
public static void main(String[] arg)
{
 byte bytevalue = 20;
 int intvalue = 30;
 short shortvalue = 40;
 long longtotal = (50000L + 10L *(bytevalue + shortvalue + intvalue));
 System.out.println("longtotal" + longtotal);
 short shorttotal = (short)(10000 + 10 * (bytevalue + shortvalue + intvalue));
 System.out.println("shorttotal" + shorttotal);
}
}