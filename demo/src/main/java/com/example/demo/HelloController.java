package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private VBox root;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("yettttttt");
        loadWindow("hello-view.fxml", "lmao ++");
    }
    private void loadWindow(String location, String title){
        try{
            Parent parent = FXMLLoader.load(getClass().getResource(location));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle(title);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch(IOException e){
            e.printStackTrace();

        }
    }
    // or pubc void initalize
    // {
    //Platform.runLater( ()->{
    // stage = stage root etc
    //});
    // }
    private void getStage(){
        Stage stage = (Stage) root.getScene().getWindow();
    }

//how do this controller work

}