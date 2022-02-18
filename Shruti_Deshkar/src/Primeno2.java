
public class Primeno2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,count=0;
		String primenums=" ";
		for(int i=1; i<=50; i++)
		{
			count=0;
			for(num=i; num>=1; num--)
			{
				if(i%num==0)
				{
					count = count + 1;
				}
			}
			if(count ==2){
				{
					primenums=primenums + i + " ";
					
				}
			}
			System.out.println("Prime number 1 to 50");
			System.out.println(primenums);
			
		}

	}

}
