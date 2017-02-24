package com.github.tamcl.util;

import java.io.File;
import java.io.InputStream;

/**
 * Created by I331709 on 2/22/2017.
 */
public class FileIO {

    private FileIO () {}
    public static String read (String file) {
        return FileIO.read(new File(file));
    }
    public static String read (File file) {

        return null;
    }
    public static void write (String file, String content) {
        FileIO.write(new File(file), content);
    }
    public static void write (File file, String content) {

    }
}
