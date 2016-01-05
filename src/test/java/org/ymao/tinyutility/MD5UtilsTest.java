package org.ymao.tinyutility;

import org.junit.Test;

public class MD5UtilsTest {

	@Test
	public void testGetStringMD5() throws Exception {
		System.out.println(MD5Utils.getStringMD5("123456", "yao"));
	}
}
