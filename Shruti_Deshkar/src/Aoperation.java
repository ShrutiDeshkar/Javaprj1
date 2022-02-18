import java.util.Scanner;

public class Aoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("Enter Your Choice: \n 1-ADDITION \n 2-SUBSTRACTION \n 3-MULTIPLICATION \n 4-DIVISION \n ");
			int x=s.nextInt();
			System.out.println("Enter The Value Of a=");
			int a=s.nextInt();
			System.out.println("Enter The Value Of b=");
			int b=s.nextInt();
			if(x>0)
			{
				switch(x) {
				case 1:
					System.out.println("Solve Addition=");
					int sum=a+b;
					System.out.println(sum);
					break;
				case 2:
					System.out.println("Solve Substraction=");
					int sub=a-b;
					System.out.println(sub);
					break;
				case 3:
					System.out.println("Solve Multiplication=");
					int mul=a*b;
					System.out.println(mul);
					break;
				case 4:
					System.out.println("Solve Division=");
					int div=a/b;
					System.out.println(div);
					break;
					default:
						System.out.println("Invalid operator");
					break;
					
			}
		}
			
		}
		while(true);


	}

}
