package test1;

import org.junit.Before;
import org.junit.Test;

public class GoTest {
	
	@Before
	public void syout()
	{
		System.out.println("before");
	}
	
	@Test	
	public void test()
	{
		System.out.println("tests");
	}

}
