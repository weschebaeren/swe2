package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class erstesFensterController implements Initializable
{
	@FXML
    void kundeAnlegen(ActionEvent event) throws IOException
	{
		new KundeAnlegen();
    }

    @FXML
    void kundeAuswaehlen(ActionEvent event) throws IOException
    {
    	new KundeAuswaehlen();
    }

    @FXML
    void kundeVerwalten(ActionEvent event) throws IOException
    {
    	new kundeVerwalten();
    	
    }
   

    
    @Override
    public void initialize(URL url,ResourceBundle rb)
    {
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    void ArtikelAendern(ActionEvent event) throws IOException {
    	new ArtikelAendern();
    }

    @FXML
    void ArtikelAnlegen(ActionEvent event) throws IOException {
    	new ArtikelAnlegen();
    }

    @FXML
    void ArtikelLoeschen(ActionEvent event) throws IOException {
    	new ArtikelLoeschen();
    }


    @FXML
    void BuchungAnlegen(ActionEvent event) throws IOException {
    	new BuchungAnlegen();
    }

    @FXML
    void FuhrparkAendern(ActionEvent event) throws IOException {
    	new FuhrparkAendern();
    }

    @FXML
    void FuhrparkAnlegen(ActionEvent event) throws IOException {
    	new FuhrparkAnlegen();
    }

    @FXML
    void FuhrparkLoeschen(ActionEvent event) throws IOException {
    	new FuhrparkLoeschen();
    }

    @FXML
    void LieferantenAendern(ActionEvent event) throws IOException {
    	new LieferantenAendern();
    }

    @FXML
    void LieferantenAnlegen(ActionEvent event) throws IOException {
    	new LieferantenAnlegen();
    }

    @FXML
    void LieferantenLoeschen(ActionEvent event) throws IOException {
    	new LieferantenLoeschen();
    }

    @FXML
    void MitarbeiterAendern(ActionEvent event) throws IOException {
    	new MitarbeiterAendern();
    }

    @FXML
    void MitarbeiterAnlegen(ActionEvent event) throws IOException {
    	new MitarbeiterAnlegen();
    }

    @FXML
    void MitarbeiterLoeschen(ActionEvent event) throws IOException {
    	new MitarbeiterLoeschen();
    }

    

    @FXML
    private Button closeButton;
    
    @FXML
    void closeButtonAction(ActionEvent event) {
    	Stage stage = (Stage) closeButton.getScene().getWindow();
    	stage.close();
    	
    }

}
