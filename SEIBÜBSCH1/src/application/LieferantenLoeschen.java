package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LieferantenLoeschen extends Stage{
	 Stage stage;
	    public LieferantenLoeschen() throws IOException
	    {
	        stage = this;
	        Parent root = FXMLLoader.load(getClass().getResource("Lieferant_loeschen.fxml"));
	        
	        Scene scene = new Scene(root);
	        
	        stage.setScene(scene);
	        stage.show();
	    }	
}
