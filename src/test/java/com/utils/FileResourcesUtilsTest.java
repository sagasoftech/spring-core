package com.utils;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FileResourcesUtilsTest {

	@DisplayName("Test loading a XML config file")
	@Test
	void testGetFileFromResourceAsStream() {
		assertNotNull(FileResourcesUtils.getFileFromResourceAsStream("Beans.xml"));
	}

}
