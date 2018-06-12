package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class kundeVerwalten extends Stage
{
    Stage stage;
    public kundeVerwalten() throws IOException
    {
        stage = this;
    //    Parent root = FXMLLoader.load(getClass().getResource("Verwalten.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("Verwalten.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
 }
