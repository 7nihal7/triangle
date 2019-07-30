package tringle;

import junit.framework.TestCase;

public class perimetertest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPerimeter() {
		//fail("Not yet implemented");
	
		float p;
		tringle T= new tringle();
		T.setBase(5);
		T.setHeight(5);
		p=T.perimeter();
		assertEquals(15.0f,p);
		
	}
	

}
