package by.bogdanov.DemoTread.ex05;

import java.io.FileWriter;
import java.io.IOException;

public class Resource {

    private FileWriter fileWriter;

    public Resource(String filename) throws IOException {
        fileWriter = new FileWriter(filename,true);
    }

    public synchronized void writing(String name, int a){
        try{
            fileWriter.append(name + a);
            System.out.print(name + " " + a);
            Thread.sleep((long) (Math.random() * 50));
            fileWriter.append("==> " + a + " ");
            System.out.print(" ==> " + a + " ");

        }catch ( IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public void close(){
        try {
        fileWriter.close();}
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
