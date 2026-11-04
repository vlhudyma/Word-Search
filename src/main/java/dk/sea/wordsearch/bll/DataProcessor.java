package dk.sea.wordsearch.bll;
import dk.sea.wordsearch.dal.DataHolder;
import java.io.IOException;
import java.util.ArrayList;


public class DataProcessor {
    private DataHolder wordsStorage;

    public DataProcessor() throws IOException{
        this.wordsStorage = new DataHolder();
    }

    public ArrayList<String> getAllWords(){
        return wordsStorage.getWordsList();
    }
    public int wordsCounter(){
        int totalWords = 0;
        for(String w: getAllWords()){
            totalWords ++;
        }
        return totalWords;
    }
}
