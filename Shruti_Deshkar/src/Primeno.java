import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number=");
		num=s.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		
		}
		if(count==0)
	
			System.out.println("It is Prime no");

		else
			System.out.println("It is  not Prime no");
			


	}

}
