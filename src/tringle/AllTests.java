package tringle;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(perimetertest.class);
		suite.addTestSuite(tringleTest.class);
		//$JUnit-END$
		return suite;
	}

}
