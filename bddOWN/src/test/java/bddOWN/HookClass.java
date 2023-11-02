package bddOWN;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	@Before
	public void setup() {
		OhrmBase.setUpDriver();
	}
	
//	@After
//	public void teardown() {
//		OhrmBase.tearDown();
//	}
}
