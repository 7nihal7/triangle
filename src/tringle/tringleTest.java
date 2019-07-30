package tringle;

import junit.framework.TestCase;

public class tringleTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testArea() {
		float a;
		//fail("Not yet implemented");
		tringle t=new tringle();
		t.setBase(4);
		t.setHeight(5);
		a=t.area();
		assertEquals(10.0f,a);
		
	}
	

}
