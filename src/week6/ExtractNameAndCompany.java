package week6;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ExtractNameAndCompany {
    public static void main(String[] args) {
        File f = new File("./attendance.txt");
        Map<String, ArrayList<String>> attendance = new TreeMap<>();
        try(
                FileInputStream fis = new FileInputStream(f);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr);

        ){
            String lin = null;
            String name = null;
            String companyName = null;
            while ( (lin = reader.readLine()) != null) {
                Email email = new Email(lin);
                name = email.parseEmailName();
                companyName = email.parseCompanyName();
                if (attendance.containsKey(companyName)) {
                    ArrayList<String> nameList = attendance.get(companyName);
                    nameList.add(name);
                    Collections.sort(nameList);
                } else {
                    ArrayList<String> nameList = new ArrayList<>();
                    nameList.add(name);
                    attendance.put(companyName, nameList);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //output companyName____name
        for (Map.Entry<String, ArrayList<String>> entry : attendance.entrySet()) {
            ArrayList<String> nameList = entry.getValue();
            for (String name : nameList) {
                System.out.println(entry.getKey() + "\t" + name);
            }
        }

       //histogram
        StringBuilder histogram = new StringBuilder();
        for (Map.Entry<String, ArrayList<String>> entry : attendance.entrySet()) {
            String companyName = entry.getKey();
            StringBuilder attendanceNumber = new StringBuilder();
            for (String name : entry.getValue()) {
                attendanceNumber.append("*");
            }
            histogram.append(companyName + " | " + attendanceNumber + "\n");
        }

        System.out.println(histogram);

        //Whether bill.gates
        int i = 1;
        for (ArrayList<String> namelist : attendance.values()) {
            if (namelist.contains("bill.gates")) {
                System.out.println("bill.gates attended.");
                break;
            }
            if (i >= attendance.size()) {
                System.out.println("bill.gates not attended");
            }
            i++;
        }

        //write to file
        File f2 = new File("./nameListAttendance.txt");
//        try {
//            f2.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try(
                FileOutputStream fos = new FileOutputStream(f2);
                OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                PrintWriter writer = new PrintWriter(osw);
        ){
            for (Map.Entry<String, ArrayList<String>> entry : attendance.entrySet()) {
                String companyName = entry.getKey();
                for (String name : entry.getValue()) {
                    String lineToWrite = companyName + "\t" + name;
                    writer.println(lineToWrite);
                    writer.flush();
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
