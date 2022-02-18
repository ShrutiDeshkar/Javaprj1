import java.util.Scanner;

public class Ifelseloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number=");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		if(marks>=90)
			System.out.println("Excellent");
			else if(marks<90 && marks>=80)
				System.out.println("Very good");
			else if(marks<80 && marks>=70)
				System.out.println("Good");
			else if(marks<70 && marks>=60)
				System.out.println("Satisfactory");
			else if(marks<60 && marks>=50)
				System.out.println("Work hard");
			else if(marks<50 && marks>=40)
				System.out.println("Just pass");
			else if (marks<40)
				System.out.println("Failed");
			else
				System.out.println("invalid");


	}

}
