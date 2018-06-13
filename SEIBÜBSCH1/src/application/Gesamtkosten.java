package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Gesamtkosten  extends Stage{
	 Stage stage;
	    public Gesamtkosten() throws IOException
	    {
	        stage = this;
	        Parent root = FXMLLoader.load(getClass().getResource("Gesamtkosten.fxml"));
	        
	        Scene scene = new Scene(root);
	        
	        stage.setScene(scene);
	        stage.show();
	    }	
}