package interfaceAPi.UI;

import java.io.IOException;

import interfaceAPi.ModeloIpData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController {
	
	ModeloIpData model;
	
	@FXML
    private Label asnLabel;

    @FXML
    private Label hostnameLabel;

    @FXML
    private Label ipLabel;

    @FXML
    private Label ispLabel;

    @FXML
    private Label typeInformation;
    
    @FXML
    private GridPane vista;
    
    public ConnectionController (ModeloIpData model) throws IOException{
    	this.model=model;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Connection.fxml"));
		loader.setController(this);
		loader.load();
		}

	public GridPane getView() {
		return vista;
	}


}
