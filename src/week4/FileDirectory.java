package week4;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDirectory {
    public static void main(String[] args) {
        System.out.println("Enter directories path：");
        Scanner in = new Scanner(System.in);
        File f = new File(in.nextLine().trim());

        ArrayList<Directory> directories = new ArrayList<>();
        try(
                FileInputStream fis = new FileInputStream(f);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr);
        ){
            String lin = null;
            while((lin = reader.readLine()) != null) {
                String[] lineArray = lin.split("\\s+");
                    Directory dir = new Directory();
                    dir.setFistName(lineArray[0]);
                    dir.setLastName(lineArray[1]);
                    dir.setZipCode(Integer.parseInt(lineArray[2]));
                    directories.add(dir);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Directory dir : directories) {
            System.out.println(dir.getFistName()+ "\t" + dir.getLastName() + "\t" + dir.getZipCode());
        }
    }
}
