package p1;

import java.util.Scanner;

public class TesterStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FixedStack fix=null;//new FixedStack();
		GrowableStack grow=null;//new GrowableStack();
		boolean flag=true;
		Customer cust=null;
		int check=0;
		
        while(flag)
		{
			System.out.println("Enter the choice: \r\n 1.Choose Fixed Stack \r\n 2.Choose Growable Stack \r\n 3. Push data\r\n"
					+ "4. Pop Data \r\n 5.Exit" );
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				if(check==0)
				{
					 fix=new FixedStack();
					check++;
					//fix=f;
				}
				else
					System.out.println("Already chosed the stack");
				break;
			case 2:
				if(check==0)
				{
					 grow=new GrowableStack();
					check=check+2;
				//	grow=g;
				}
				else
					System.out.println("Already chosed the stack");
				break;
			case 3:
				if(check==0)
				System.out.println("select stack from options");
				else {
				System.out.println("Enter customer details:id,name,address");
				 cust=new Customer(sc.nextInt(),sc.next(),sc.next());
				if(check==1 )
				fix.push(cust);
				else 
					grow.push(cust);
				}
				break;
			case 4:
				if(check==0)
					System.out.println("Select stack to get popped");
				else
				{
					if(check==1 && cust!=null)
					
						System.out.println(fix.pop());
					else
						System.out.println(grow.pop());
				}
				break;
			case 5:
				flag=false;
				break;
			default:
				System.out.println("Entered wrong choice");
				break;
			}
		}
		sc.close();

	}

}
