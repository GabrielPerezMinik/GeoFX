package interfaceAPi.UI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import interfaceAPi.ModeloIpData;
import interfaceAPi.ipapi.IpapiService;
import interfaceAPi.ipapi.Language;
import interfaceAPi.ipify.IpifyService;
import interfaceAPi.model.ConnectionModel;
import interfaceAPi.model.LocationModel;
import interfaceAPi.model.SecurityModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class RootController implements Initializable {
	
	
	//modelIpapi
	
	ModeloIpData modelo=new ModeloIpData();
	IpapiService servicioIpapi=new IpapiService();
	IpifyService servicioIpify=new IpifyService();
	LocationModel modeloLocation=new LocationModel();
	ConnectionModel modeloConet=new ConnectionModel();
	SecurityModel modelSecurity=new SecurityModel();
	//securityModel
	
	LocationController location1=new LocationController(modeloLocation);
	ConnectionController connection=new ConnectionController(modeloConet);
	SecurityController security=new SecurityController(modelSecurity);
	
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
			SecurityTab.setContent(security.getView());
			try {
				modelo.setIpData(servicioIpapi.getIpapi(servicioIpify.getIpifyjson().getIp()));
				 actualizarModelo();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		

		private void actualizarModelo() {
			modeloLocation.setCiudad(modelo.getIpData().getCity()+" ("+modelo.getIpData().getRegion_name()+")"); 
			 modeloLocation.setCodigoLlamada("+"+modelo.getIpData().getLocation().getCalling_code());
			 modeloLocation.setImagen(new Image("/ImagenesBanderas/64x42/"+modelo.getIpData().country_code+".png"));
			 modeloLocation.setLatitud(String.valueOf(modelo.getIpData().getLatitude()));
			 modeloLocation.setLongitud(String.valueOf(modelo.getIpData().getLongitude()));
/*Revisar*/	// modeloLocation.setLenguaje(modelo.getIpData().getLenguaje().getName()); 
			 System.out.println(modelo.getIpData().getLenguaje());
			 //modeloLocation.setLenguaje(String.valueOf(modelo.getIpData().getLocation().getLanguages().get(1)+" ("+modelo.getIpData().getContinent_code()+")"));  //.getName()+" ("+modelo.getIpData().getLenguaje().getCode()+")"));
			 modeloLocation.setMoneda(String.valueOf(modelo.getIpData().getCurrency().getName()+ " ("+modelo.getIpData().getCurrency().getSymbol_native()+")"));
			 modeloLocation.setTiempo(String.valueOf(modelo.getIpData().getTime_zone().getCode()));
			 modeloLocation.setZipPostal(modelo.getIpData().getZip());
			 modeloLocation.setIpLocation(modelo.getIpData().getCountry_name()+" ("+modelo.getIpData().getCountry_code()+")");
			 
			 modeloConet.setAsn(String.valueOf(modelo.getIpData().getConnection().getAsn()));
			 modeloConet.setIsp(String.valueOf(modelo.getIpData().getConnection().getIsp()));
			 modeloConet.setHostname(modelo.getIpData().getHostname());
			 modeloConet.setIp(modelo.getIpData().getIp());
			 modeloConet.setType(modelo.getIpData().getType());
			 
			 modelSecurity.setCrawl(modelo.getIpData().getSecurity().is_crawler);
			 modelSecurity.setTor(modelo.getIpData().getSecurity().is_tor);
			 modelSecurity.setThreat(modelo.getIpData().getSecurity().threat_level);
			 modelSecurity.setPotencialThreat(String.valueOf(modelo.getIpData().getSecurity().getThreat_types()));
			 
			 ipText.setText(modelo.getIpData().getIp());
		}
	
		 @FXML
		    void onCheckIpAction(ActionEvent event) throws IOException {
			 modelo.setIpData(servicioIpapi.getIpapi(ipText.getText()));
			 actualizarModelo();
			 
		    }


		 public BorderPane getView() {
				return rootPane;
			}

		 
		 
		 
}
