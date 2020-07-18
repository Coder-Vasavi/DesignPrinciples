import java.util.Scanner;
class A
{
	int a;
	int b;
	A(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int addition()
	{
		return a+b;
	}
}
class B
{
	int a;
	int b;
	B(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int subtraction()
	{
			return a-b;
	}
}
class C
{
	int a;
	int b;
	C(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int multiplication()
	{
		return a*b;
	}
}
class D
{
	int a;
	int b;
	D(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public double divide()
	{
		return a/(double)b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operation you would like to perform");
		System.out.println("Enter either of them + - * /");
		String s=sc.nextLine();
		System.out.println("Enter a and b values");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		switch(s)
		{
		case "+" :
			A a=new A(a1,b1);
			System.out.println(a.addition());
			break;
		case "-" :
			B b=new B(a1,b1);
			System.out.println(b.subtraction());
			break;
		case "*" :
			C c=new C(a1,b1);
			System.out.println(c.multiplication());
			break;
		case "/" :
			D d=new D(a1,b1);
			System.out.println(d.divide());
			break;
		default :
			System.out.println("Please Enter a Valid opertor");
			break;
		}
		

	}

}
