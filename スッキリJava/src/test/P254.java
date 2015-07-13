package test;

import static java.nio.file.StandardCopyOption.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P254 {

    static String filename = "C:\\Users\\takumi\\Dropbox\\ファイル\\GitHub上のMavenプロジェクトのeclipseへのインポート方法.txt";

    public static void main(String[] args) throws IOException{
        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
        BufferedReader br = new BufferedReader(isr);
        System.out.println("全てのデータを読み込んで表示します。");

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        System.out.println("ファイルの末尾に到達しました。");
        br.close();

        Path p1 = Paths.get(filename);
        Path p2 = Paths.get("C:\\Users\\takumi\\Documents\\GitHub上のMavenプロジェクトのeclipseへのインポート方法.txt");

//        Files.deleteIfExists(p2);

        Files.copy(p1,p2,REPLACE_EXISTING);
    }
}
