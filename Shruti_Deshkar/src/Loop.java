import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		do
		{
		int z=s.nextInt();
		System.out.println("Enter The Choice= ");
		int x=s.nextInt();
		switch(x)
		{
		case 1:
		{
			int sum=0;
			for(int i=0;i<=z;i++)
			{
				sum+=i;
			}
			System.out.println("sum of digit="+sum);
			break;
			
		}
		case 2:
		{
			int fact=1;
			int i;
			for(i=1;i<=z;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial numberof is=  "+fact);
			break;
		}
		case 3:
		{
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=1;i<=z;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
         }
		break;
		}
		default:
			System.out.println("invalid ");
			break;
			
		}
	}while(true);


	}

}
