package week4;
import java.util.ArrayList;
import java.util.Scanner;

public class DirectoryTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] directoryArray = null;
        ArrayList<Directory> directories = new ArrayList<>();
        boolean conti = true;
        System.out.println("Input {first_name<tab>last_name<tab>zip_code}:(quit to end)");
        while (conti) {
            directoryArray = in.nextLine().split("\\s+");
            if (directoryArray.length >= 3){
                Directory directory = new Directory();
                directory.setFistName(directoryArray[0]);
                directory.setLastName(directoryArray[1]);
                directory.setZipCode(Integer.parseInt(directoryArray[2]));
                directories.add(directory);
            }else {
                conti = false;
            }
        }
        for (Directory dir : directories) {
            System.out.println(dir.getFistName()+ "\t" + dir.getLastName() + "\t" + dir.getZipCode());
        }
    }
}
