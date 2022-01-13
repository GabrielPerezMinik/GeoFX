package interfaceAPi.UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import interfaceAPi.ModeloIpData;
import interfaceAPi.model.SecurityModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable{

	ModeloIpData model;
	SecurityModel modelSeguridad;
	
	 @FXML
	    private CheckBox crawlerCheck;

	    @FXML
	    private Label ipsafeLabel;

	    @FXML
	    private Label potencialThreatLabel;

	    @FXML
	    private CheckBox proxyCheck;

	    @FXML
	    private GridPane securityGrid;

	    @FXML
	    private Label threatLabel;

	    @FXML
	    private CheckBox torCheck;
	    
	    
	    public SecurityController(SecurityModel modeloSeguridad) {
	    	modelSeguridad=modeloSeguridad;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Security.fxml"));
			loader.setController(this);
			
			try {
				loader.load();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	
	    }
	    

		public void initialize(URL location, ResourceBundle resources) {
			crawlerCheck.selectedProperty().bind(modelSeguridad.crawlProperty());
			threatLabel.textProperty().bind(modelSeguridad.threatProperty());
			potencialThreatLabel.textProperty().bind(modelSeguridad.potencialThreatProperty());
			
			
			
		}
		
		public GridPane getView() {
			return securityGrid;
		}
		
	
}
