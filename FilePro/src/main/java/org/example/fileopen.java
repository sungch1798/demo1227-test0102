package org.example;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class fileopen {
    public void fileread() throws IOException {
        Path file1 = Paths.get("c:/temp/a.txt");
try {


        List<String>allc =Files.readAllLines(file1);
            allc = Files.readAllLines(file1);
        for (String line : allc){
            System.out.println("test this---->"+line);
        }
}
catch (IOException e){
    throw new RuntimeException(e);
}


    }


public void  frts(){
        Path file1=Paths.get("C:/temp/a.txt");
        try {
            BufferedReader br =Files.newBufferedReader(file1);
            String line=null;
            while ((line = br.readLine()) != null){
                System.out.println("br輸出: "+line);
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
}

}
