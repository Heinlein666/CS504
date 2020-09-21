package termAssigement;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {

        Map<String, Integer> wordsFrequency = new HashMap<>();
        File f = new File("./test.txt");
        try(
                FileInputStream fis = new FileInputStream(f);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader reader = new BufferedReader(isr);
        ){
            String line = null;
            while ((line = reader.readLine()) != null) {
                //remove punctuation
                String[] wordsArray = line.replaceAll("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×]", " ").trim().toLowerCase().split("\\s+");
                for (String word : wordsArray) {
                    if (wordsFrequency.containsKey(word)) {
                        wordsFrequency.put(word, wordsFrequency.get(word) + 1);

                    }else {
                        wordsFrequency.put(word, 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> entry : wordsFrequency.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
