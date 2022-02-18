import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=s.nextInt();
		/*while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		
		System.out.println("Factorial of num="+fact);*/
		do 
		{
			fact=fact*i;
			i++;
		}while(i<=num);
		
		System.out.println("Factorial of num="+fact);


	}

}
