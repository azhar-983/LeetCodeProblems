package com.lc.corejava;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesDemo {

    public static void main(String[] args) throws IOException {
        File f = new File("MOCK_DATA.txt");
        //readByFileReader(f);
        //readByFiles();
        //readByLines();
        copyUsingJavaStreams(f);
        copyUsingChannels();
    }

    private static void copyUsingChannels() throws IOException {
        try(FileChannel ifc = new FileInputStream("Test.txt").getChannel();
            FileChannel ofc = new FileOutputStream("abc.txt").getChannel();)
        {
            ByteBuffer bb = ByteBuffer.allocateDirect(4*1024);
            while(ifc.read(bb) !=-1){
                bb.flip();
                ofc.write(bb);
                bb.clear();
            }
        }
    }

    private static void copyUsingJavaStreams(File f) throws IOException {

        try(InputStream is = new FileInputStream("MOCK_DATA.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            FileWriter fw = new FileWriter("Test1.txt",true);
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            Stream<String> lineStream = br.lines();
        ){
            lineStream.forEach(pw::println);
        }
    }

    private static void readByFiles() throws IOException {
        byte[] names = Files.readAllBytes(Paths.get("MOCK_DATA.txt"));
        String nameStr = new String(names);

        Files.write(Path.of("Test.txt"),names);
        //System.out.println(nameStr);
    }

    private static void readByLines() throws IOException {
        List<String> names = Files.readAllLines(Paths.get("MOCK_DATA.txt"));
        System.out.println(names);

    }

    private static void readByFileReader(File f) throws IOException {
        if (f.exists()) {
            FileReader fr = new FileReader("MOCK_DATA.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.readLine() != null)
                System.out.println(br.readLine());
        }
    }


}
