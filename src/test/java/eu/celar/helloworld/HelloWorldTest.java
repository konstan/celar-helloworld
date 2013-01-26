package eu.celar.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest extends HelloWorld {

	@Test
	public final void testGetGreetings() {
		assertEquals("Hello World!", getGreetings());
	}

}
