package org.demo.mbb;

import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class MappedByteBufferDemo {

    public static void main(String[] args) {
        CharBuffer charBuffer = null;
        ClassLoader classLoader = MappedByteBufferDemo.class.getClassLoader();

        Path pathToRead = Paths.get(classLoader.getResource("MappedByteBufferDemo.java").getPath());

        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(
                pathToRead, EnumSet.of(StandardOpenOption.READ))) {

            MappedByteBuffer mappedByteBuffer = fileChannel
                    .map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());

            if (mappedByteBuffer != null) {
                charBuffer = Charset.forName("UTF-8").decode(mappedByteBuffer);
                System.out.println(charBuffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
