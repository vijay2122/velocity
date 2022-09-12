package githubprogramms1;

public class Sample1 
{
public static void main(String[] args)
{
m1();
System.out.println("---------");
Sample2.m2();

Sample1 s1= new Sample1();
s1.m3();
Sample2 sample2=new Sample2();
sample2.m4();
}
public static void m1()
{
	System.out.println("runnig on static method on same class");
	
	}
public  void m3() 
{
	System.out.println("Runnig on nonstatic method on same class");
	System.out.println("------");
}
}