package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ArtikelAnlegen extends Stage{
	 Stage stage;
	    public ArtikelAnlegen() throws IOException
	    {
	        stage = this;
	        Parent root = FXMLLoader.load(getClass().getResource("Neuer_Artikel.fxml"));
	        
	        Scene scene = new Scene(root);
	        
	        stage.setScene(scene);
	        stage.show();
	    }	
}
