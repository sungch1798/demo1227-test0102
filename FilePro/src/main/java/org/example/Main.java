package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        fileopen fop = new fileopen();

        fop.frts();
        fop.fileread();
        String spath1="c:/temp/a.txt";
        String spath2="c:/temp/c.txt";
        Path path1= Paths.get(spath1);
        Path path2= Paths.get(spath2);
        try {
            if(Files.exists(path1)){
                System.out.println("檔案存在");
                Files.copy(path1,path2);
                System.out.println("複製完成");
            }

        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }
}