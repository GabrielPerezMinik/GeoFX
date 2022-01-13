package interfaceAPi.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SecurityModel {
	    
	    StringProperty potencialThreat=new SimpleStringProperty();
	    StringProperty threat=new SimpleStringProperty();
	    StringProperty ipSafe=new SimpleStringProperty();
	    BooleanProperty tor=new SimpleBooleanProperty();
	    BooleanProperty proxy=new SimpleBooleanProperty();
	    BooleanProperty crawl=new SimpleBooleanProperty();
		public final StringProperty potencialThreatProperty() {
			return this.potencialThreat;
		}
		
		public final String getPotencialThreat() {
			return this.potencialThreatProperty().get();
		}
		
		public final void setPotencialThreat(final String potencialThreat) {
			this.potencialThreatProperty().set(potencialThreat);
		}
		
		public final StringProperty threatProperty() {
			return this.threat;
		}
		
		public final String getThreat() {
			return this.threatProperty().get();
		}
		
		public final void setThreat(final String threat) {
			this.threatProperty().set(threat);
		}
		
		public final StringProperty ipSafeProperty() {
			return this.ipSafe;
		}
		
		public final String getIpSafe() {
			return this.ipSafeProperty().get();
		}
		
		public final void setIpSafe(final String ipSafe) {
			this.ipSafeProperty().set(ipSafe);
		}
		
		public final BooleanProperty torProperty() {
			return this.tor;
		}
		
		public final boolean isTor() {
			return this.torProperty().get();
		}
		
		public final void setTor(final boolean tor) {
			this.torProperty().set(tor);
		}
		
		public final BooleanProperty proxyProperty() {
			return this.proxy;
		}
		
		public final boolean isProxy() {
			return this.proxyProperty().get();
		}
		
		public final void setProxy(final boolean proxy) {
			this.proxyProperty().set(proxy);
		}
		
		public final BooleanProperty crawlProperty() {
			return this.crawl;
		}
		
		public final boolean isCrawl() {
			return this.crawlProperty().get();
		}
		
		public final void setCrawl(final boolean crawl) {
			this.crawlProperty().set(crawl);
		}
		
	    
	    
}
