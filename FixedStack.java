package p1;

public class FixedStack implements Stack {
    protected int top;
    protected Customer [] cust;
     public FixedStack() {
		top=-1;
		cust=new Customer[SIZE];
	}
    
	@Override
	public void push(Customer c) {
	if(top < SIZE-1)
	{
		cust[++top]=c;
	}
	else
		System.out.println("Stack overflow");
	}

	@Override
	public Customer pop() {
	   if(top > -1) {
		return cust[top--];
	   }
	   else
		   System.out.println("Stack Underflow");
	   return null;
	}

}
