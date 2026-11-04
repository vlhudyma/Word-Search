package dk.sea.wordsearch;

import dk.sea.wordsearch.bll.DataProcessor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.util.ArrayList;

public class HelloController {
    private DataProcessor wordProcessor;

    @FXML
    private ListView<String> wordsListView;

    @FXML
    private Label totalWords;


    public HelloController() throws IOException {
        this.wordProcessor = new DataProcessor();
    }

    public void initialize(){
        wordProcessor.getAllWords();
        wordsListView.getItems().setAll(wordProcessor.getAllWords());
        totalWords.setText(String.valueOf(wordProcessor.wordsCounter()));
    }


    public void onBtnClickedSearch(ActionEvent actionEvent) {

    }
}
