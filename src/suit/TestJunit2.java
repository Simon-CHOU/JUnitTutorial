package suit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit2
{

	@Before
	public void before()
	{
		System.out.println("TestB begin!");
	}
	
	@Test
	public void test()
	{
		System.out.println("TestB doing!");
	}
	
	@After
	public void after()
	{
		System.out.println("TestB end!");
	}
} ;
