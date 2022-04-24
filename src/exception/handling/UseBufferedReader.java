package exception.handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;

public class UseBufferedReader {
    public static void main(String[] args) throws IOException {
       String path = "/Users/matiur/develop/aint/SeleniumAprill2022/Project04/files/file1.txt";
       FileReader fr = null;
       BufferedReader br = null;
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            System.out.println("File path is wrong...");
        }
        try {
            br = new BufferedReader(fr);
            String line = "";
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception ex){
             ex.printStackTrace();
        }finally {
            if(fr != null){
                fr.close();
            }
            if(br != null){
                br.close();
            }
       }
    }
}
