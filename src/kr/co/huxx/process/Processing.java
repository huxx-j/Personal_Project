package kr.co.huxx.process;

import kr.co.huxx.vo.VO;

import java.io.*;

public class Processing {

    public String  image_processing(String filename) {
        String path = System.getProperty("java.io.tmpdir\\" + filename);
        System.out.println(path);
        FileInputStream fileInputStream;
        int c=0;
        try {
            fileInputStream = new FileInputStream(path);

            while ((c = fileInputStream.read()) != -1) {
                System.out.println(c+"\r\n");
//            FileReader fileReader = new FileReader(path);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            while (bufferedReader.in.read());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String d = String.valueOf(c);
        return d;
    }
}
