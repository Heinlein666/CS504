package week3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileScan {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the file path:");
        String path = in.nextLine().trim();
        File file = new File(path);
        try(
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(isr);
        ){
           StringBuffer context = new StringBuffer();
           String line = null;
           int numberOfRows = 0;
           int numberOfWords = 0;
           while ((line = reader.readLine()) != null) {
               numberOfRows++;
               String[] lineArray = line.trim().split(" ");
               for (String word : lineArray) {
                   if (!word.equals("") && !word.equals(" ")){
                       numberOfWords++;
                   }
               }
               context.append(line).append("\n");
            }
            System.out.println("The file path:" + path);
            System.out.println("The number of rows:" + numberOfRows);
            System.out.println("The number of words:" + numberOfWords);
            System.out.println("Context:\n" + context);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
