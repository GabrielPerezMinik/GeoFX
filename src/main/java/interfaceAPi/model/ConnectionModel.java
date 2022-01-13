package interfaceAPi.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class ConnectionModel {   
    
    StringProperty asn=new SimpleStringProperty();
	StringProperty hostname=new SimpleStringProperty();
	StringProperty isp=new SimpleStringProperty();
	StringProperty ip=new SimpleStringProperty();
	StringProperty type=new SimpleStringProperty();
	
	public final StringProperty asnProperty() {
		return this.asn;
	}
	
	public final String getAsn() {
		return this.asnProperty().get();
	}
	
	public final void setAsn(final String asn) {
		this.asnProperty().set(asn);
	}
	
	public final StringProperty hostnameProperty() {
		return this.hostname;
	}
	
	public final String getHostname() {
		return this.hostnameProperty().get();
	}
	
	public final void setHostname(final String hostname) {
		this.hostnameProperty().set(hostname);
	}
	
	public final StringProperty ispProperty() {
		return this.isp;
	}
	
	public final String getIsp() {
		return this.ispProperty().get();
	}
	
	public final void setIsp(final String isp) {
		this.ispProperty().set(isp);
	}
	
	public final StringProperty ipProperty() {
		return this.ip;
	}
	
	public final String getIp() {
		return this.ipProperty().get();
	}
	
	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}
	
	public final StringProperty typeProperty() {
		return this.type;
	}
	
	public final String getType() {
		return this.typeProperty().get();
	}
	
	public final void setType(final String type) {
		this.typeProperty().set(type);
	}
	
	
	
}
