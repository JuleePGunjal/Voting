package p1;

public class GrowableStack extends FixedStack{

	@Override
	public void push(Customer c)
	{
		if(top == -1)
		{
			
		
			Customer [] temp=new Customer[cust.length*2];
			for(int i=0;i<cust.length;i++) //if we give temp.length the array out of bound error occures
			{
				temp[i]=cust[i];
			}
			cust=temp;
		}

		cust[++top]=c;
	
	
	}
	
}
