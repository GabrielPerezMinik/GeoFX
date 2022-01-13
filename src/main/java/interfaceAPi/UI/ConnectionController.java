package interfaceAPi.UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import interfaceAPi.model.ConnectionModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {
	
	ConnectionModel modeloConet;
	
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
    
    public ConnectionController (ConnectionModel conet) throws IOException{
       modeloConet=conet;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Connection.fxml"));
		loader.setController(this);
		loader.load();
		}

	public GridPane getView() {
		return vista;
	}

	public void initialize(URL location, ResourceBundle resources) {
		asnLabel.textProperty().bind(modeloConet.asnProperty());
		hostnameLabel.textProperty().bind(modeloConet.hostnameProperty());
		ipLabel.textProperty().bind(modeloConet.ipProperty());
		ispLabel.textProperty().bind(modeloConet.ispProperty());
		typeInformation.textProperty().bind(modeloConet.typeProperty());
		
	}


}
