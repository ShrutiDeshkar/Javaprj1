import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float english,domain,computer,aptitude;
		double total,average,percentage;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the marks of English Subject=");
		english=s.nextFloat();
		
		System.out.println("Enter the marks of Domain Subject=");
		domain=s.nextFloat();
		
		System.out.println("Enter the marks of Computer Subject=");
		computer=s.nextFloat();
		
		System.out.println("Enter the marks of Aptitude Subject=");
		aptitude=s.nextFloat();
		
		total=english+domain+computer+aptitude;
		average=(total/4.0);
		percentage=(total/400.0)*100;
		
		System.out.println("Total Marks="+total);
		System.out.println("Average Marks="+average);
		System.out.println("Percentage Marks="+percentage);
		
		

	}

}
