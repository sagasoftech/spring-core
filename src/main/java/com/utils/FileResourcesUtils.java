package com.utils;

import java.io.InputStream;
import java.net.URL;

public class FileResourcesUtils {


    // get a file from the resources folder
    // works everywhere, IDEA, unit test and JAR file.
    public static String getFileFromResourceAsStream(String fileName) {

    	String fileAbsPath = "";
        // The class loader that loaded the class
        ClassLoader classLoader = FileResourcesUtils.class.getClassLoader();
        fileAbsPath=classLoader.getResource(fileName).getPath();

        // the stream holding the file content
        if (fileAbsPath == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return fileAbsPath;
        }
    }
}
