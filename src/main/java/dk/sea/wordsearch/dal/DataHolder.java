package dk.sea.wordsearch.dal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataHolder {
    private ArrayList<String> dataList = new ArrayList<>();

public DataHolder() throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader("dk/sea/wordsearch/dal/brit-a-z.txt"))){
        String line = "";
        while((line = reader.readLine()) != null)
        {
            dataList.add(line);
        }
        reader.close();
    }
    catch(FileNotFoundException fe)
    {
        System.out.println("Error occured");
    }
}


}
