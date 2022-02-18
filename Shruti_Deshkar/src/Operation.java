import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		int num1,num2,result;
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the operator= +,-,*,/,%");
	    operator=s.next().charAt(0);
		System.out.println("Enter the num1=");
		num1=s.nextInt();
		System.out.println("Enter the num2=");
	   num2=s.nextInt();
		switch(operator)
		{
		case '+':
			result=num1+num2;
			System.out.println(num1+"+"+num2+"="+result);
			break;
		case '-':
			result=num1-num2;
			System.out.println(num1+"-"+num2+"="+result);
			break;
		case '*':
			result=num1*num2;
			System.out.println(num1+"*"+num2+"="+result);
			break;
		case '/':
			result=num1/num2;
			System.out.println(num1+"/"+num2+"="+result);
		    break;
		case '%':
			result=num1%num2;
			System.out.println(num1+"%"+num2+"="+result);
			break;
			default:
				System.out.println("invalid operator");
				break;
			
		}
		
		
		


	}

}
