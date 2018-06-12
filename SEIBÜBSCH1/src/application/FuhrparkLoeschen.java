package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FuhrparkLoeschen extends Stage{
	 Stage stage;
	    public FuhrparkLoeschen() throws IOException
	    {
	        stage = this;
	        Parent root = FXMLLoader.load(getClass().getResource("Fahrzeug_loeschen.fxml"));
	        
	        Scene scene = new Scene(root);
	        
	        stage.setScene(scene);
	        stage.show();
	    }	
}

