package hbcu.stay.ready.utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

@SuppressWarnings("all")
public class FileReader {
    public static String readFile(String fileName) {
        try {
            return IOUtils.toString(FileReader.class.getClassLoader().getResourceAsStream(fileName));
        } catch (IOException e) {
            throw new Error(e);
        }
    }
}
