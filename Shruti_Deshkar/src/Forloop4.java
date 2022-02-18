import java.util.Scanner;

public class Forloop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)//row
		{
			for(int j=i;j>=1;j--) //column
			{
				System.out.print(j+ " ");
			}
			System.out.println(" ");

	}

	}

}
