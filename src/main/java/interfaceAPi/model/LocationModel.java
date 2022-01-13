package interfaceAPi.model;


import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class LocationModel {

	StringProperty ciudad=new SimpleStringProperty();
	StringProperty  ipLocationLLamada=new SimpleStringProperty();
	StringProperty codigoLlamada  =new SimpleStringProperty();
	StringProperty ipLocation=new SimpleStringProperty();
	StringProperty latitud=new SimpleStringProperty();
	StringProperty lenguaje=new SimpleStringProperty();
	StringProperty longitud=new SimpleStringProperty();
	StringProperty moneda=new SimpleStringProperty();
	StringProperty tiempo=new SimpleStringProperty();
	StringProperty zipPostal=new SimpleStringProperty();
	ObjectProperty<Image> imagen=new SimpleObjectProperty<Image>();
	
	
	public final StringProperty ciudadProperty() {
		return this.ciudad;
	}
	
	public final String getCiudad() {
		return this.ciudadProperty().get();
	}
	
	public final void setCiudad(final String ciudad) {
		this.ciudadProperty().set(ciudad);
	}
	
	public final StringProperty ipLocationLLamadaProperty() {
		return this.ipLocationLLamada;
	}
	
	public final String getIpLocationLLamada() {
		return this.ipLocationLLamadaProperty().get();
	}
	
	public final void setIpLocationLLamada(final String ipLocationLLamada) {
		this.ipLocationLLamadaProperty().set(ipLocationLLamada);
	}
	
	public final StringProperty codigoLlamadaProperty() {
		return this.codigoLlamada;
	}
	
	public final String getCodigoLlamada() {
		return this.codigoLlamadaProperty().get();
	}
	
	public final void setCodigoLlamada(final String codigoLlamada) {
		this.codigoLlamadaProperty().set(codigoLlamada);
	}
	
	public final StringProperty ipLocationProperty() {
		return this.ipLocation;
	}
	
	public final String getIpLocation() {
		return this.ipLocationProperty().get();
	}
	
	public final void setIpLocation(final String ipLocation) {
		this.ipLocationProperty().set(ipLocation);
	}
	
	public final StringProperty latitudProperty() {
		return this.latitud;
	}
	
	public final String getLatitud() {
		return this.latitudProperty().get();
	}
	
	public final void setLatitud(final String latitud) {
		this.latitudProperty().set(latitud);
	}
	
	public final StringProperty lenguajeProperty() {
		return this.lenguaje;
	}
	
	public final String getLenguaje() {
		return this.lenguajeProperty().get();
	}
	
	public final void setLenguaje(final String lenguaje) {
		this.lenguajeProperty().set(lenguaje);
	}
	
	public final StringProperty longitudProperty() {
		return this.longitud;
	}
	
	public final String getLongitud() {
		return this.longitudProperty().get();
	}
	
	public final void setLongitud(final String longitud) {
		this.longitudProperty().set(longitud);
	}
	
	public final StringProperty monedaProperty() {
		return this.moneda;
	}
	
	public final String getMoneda() {
		return this.monedaProperty().get();
	}
	
	public final void setMoneda(final String moneda) {
		this.monedaProperty().set(moneda);
	}
	
	public final StringProperty tiempoProperty() {
		return this.tiempo;
	}
	
	public final String getTiempo() {
		return this.tiempoProperty().get();
	}
	
	public final void setTiempo(final String tiempo) {
		this.tiempoProperty().set(tiempo);
	}
	
	public final StringProperty zipPostalProperty() {
		return this.zipPostal;
	}
	
	public final String getZipPostal() {
		return this.zipPostalProperty().get();
	}
	
	public final void setZipPostal(final String zipPostal) {
		this.zipPostalProperty().set(zipPostal);
	}
	
	public final ObjectProperty<Image> imagenProperty() {
		return this.imagen;
	}
	

	public final Image getImagen() {
		return this.imagenProperty().get();
	}
	

	public final void setImagen(final Image imagen) {
		this.imagenProperty().set(imagen);
	}	
	
}
