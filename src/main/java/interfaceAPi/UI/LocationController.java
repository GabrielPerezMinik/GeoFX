package interfaceAPi.UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import interfaceAPi.LocationModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable{

	LocationModel model;
	
	 @FXML
	    private ImageView banderaImageView;

	    @FXML
	    private Label ciudadLabel;

	    @FXML
	    private Label codigoLlamadaLabel;

	    @FXML
	    private Label ipLocationLabel;

	    @FXML
	    private Label latitudLabel;

	    @FXML
	    private Label lenguajeLabel;

	    @FXML
	    private Label longitudLabel;

	    @FXML
	    private Label monedaLabel;

	    @FXML
	    private Label tiempoLabel;

	    @FXML
	    private Label zipPostalLabel;
	    
	    @FXML
	    private GridPane vista;
	    
	    public LocationController (LocationModel model) throws IOException{
	    	this.model=model;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/Location.fxml"));
			loader.setController(this);
			loader.load();
			}
	    
	    public void initialize(URL location, ResourceBundle resources) {
			ciudadLabel.textProperty().bind(model.ciudadProperty());
			System.out.println(model);
		}

	    public GridPane getView() {
	    	return vista;
	    }
	
}
