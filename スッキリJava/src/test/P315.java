package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class P315 {
    public static void main(String[] args) throws IOException{
        URL url = new URL("http://dokojava.jp");
        InputStream is  = url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        int i = isr.read();

        while( i != -1){
            System.out.print((char)i);
            i = isr.read();
        }
        isr.close();
    }
}
