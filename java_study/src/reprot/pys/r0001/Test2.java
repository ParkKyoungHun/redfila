package reprot.pys.r0001;



public class Test2 
{
	int a = 0;
	int b = 0;
	int c = 0;
	
	public void printLoop()
	{
		for(int i = a; i <= b; i++)
		{
			if(i % c == 0)
			{
				System.out.println(i);
			}
			else
			{
				System.out.print(i + ",");
			}
		}
	}
	
	public void printReverse()
	{
		for(int i = a; i >= b; i--)
		{
			if(i % c == b + 1)
			{
				System.out.println(i);
			}
			else
			{
				System.out.print(i + ",");
			}
		}
	}
	
	public static void main(String[] args)
	{
		Test2 t2 = new Test2();
		t2.c = 7;
		/*
		t2.a = 1;
		t2.b = 50;
		t2.printLoop();
		*/
		
		System.out.println();
		
		t2.a = 50;
		t2.b = 11;
		//안되는데요
		t2.printReverse();
		
	}
}
