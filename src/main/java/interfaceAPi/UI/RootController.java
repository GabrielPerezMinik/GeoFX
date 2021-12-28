package interfaceAPi.UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import interfaceAPi.LocationModel;
import interfaceAPi.ModeloIpData;
import interfaceAPi.ipapi.DatosIp;
import interfaceAPi.ipapi.IpapiService;
import interfaceAPi.ipify.IpifyService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class RootController implements Initializable {
	
	
	//modelIpapi
	
	ModeloIpData modelo=new ModeloIpData();
	IpapiService servicioIpapi=new IpapiService();
	IpifyService servicioIpify=new IpifyService();
	LocationModel modeloLocation=new LocationModel();
	//
	
	LocationController location1=new LocationController(modeloLocation);
	ConnectionController connection=new ConnectionController(modelo);
	
	 @FXML
	    private Tab SecurityTab;

	    @FXML
	    private Tab connectionTab;

	    @FXML
	    private Button enviarButton;
  
	    @FXML
	    private TextField ipText;

	    @FXML
	    private Tab locationTab;

	    @FXML
	    private BorderPane rootPane;
	    
	    
	    public RootController () throws IOException{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/root.fxml"));
			loader.setController(this);
			loader.load();
			}
	    

		public void initialize(URL location, ResourceBundle resources) {
			locationTab.setContent(location1.getView());
			connectionTab.setContent(connection.getView());
			try {
				modelo.setIpData(servicioIpapi.getIpapi(servicioIpify.getIp()));
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
		 @FXML
		    void onCheckIpAction(ActionEvent event) throws IOException {
			modelo.setIpData(servicioIpapi.getIpapi("8.8.8.8"));
			 modeloLocation.setCiudad(modelo.getIpData().getCity()); 
			 modeloLocation.setCodigoLlamada(modelo.getIpData().getRegion_code());
			 modeloLocation.setLatitud(String.valueOf(modelo.getIpData().getLatitude()));
			 
		    }


		 public BorderPane getView() {
				return rootPane;
			}

		 
		 
		 
}
