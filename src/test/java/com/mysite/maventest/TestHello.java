package com.mysite.maventest;
import org.junit.*;
import static junit.framework.Assert.*;

public class TestHello
{
	@Test
	public void testHello() {
		Hello h = new Hello();
		assertEquals(h.sayHello("zs"),"hello:zs");
	}
}