package suit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit1
{

	@Before
	public void before()
	{
		System.out.println("TestA begin!");
	}
	
	@Test
	public void test()
	{
		System.out.println("TestA doing!");
	}
	
	@After
	public void after()
	{
		System.out.println("TestA end!");
	}
} ;
