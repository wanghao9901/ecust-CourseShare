import java.math.*;
public class  Math{
	public static <T> T add(T x,T y){ return x+y;}
	public static <T> T sub(T x,T y){ return x-y;}
	public static <T> T mul(T x,T y){ return x*y;}
	public static <T> T div(T x,T y){ return x/y;}

	public static void main(String[] args) 
	{
		 int i=Math.<Integer>add(Integer(1),Integer(2));
		 double j=Math.<Double>add(1.0,2.0);
		 i=Integer(1)+Integer(2);

	}
}
