package application;

import java.io.*;

public class Program {

    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path)) ) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}