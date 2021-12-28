package interfaceAPi.ipapi;



	public class Security{
	    public boolean isIs_proxy() {
			return is_proxy;
		}
		public void setIs_proxy(boolean is_proxy) {
			this.is_proxy = is_proxy;
		}
		public Object getProxy_type() {
			return proxy_type;
		}
		public void setProxy_type(Object proxy_type) {
			this.proxy_type = proxy_type;
		}
		public boolean isIs_crawler() {
			return is_crawler;
		}
		public void setIs_crawler(boolean is_crawler) {
			this.is_crawler = is_crawler;
		}
		public Object getCrawler_name() {
			return crawler_name;
		}
		public void setCrawler_name(Object crawler_name) {
			this.crawler_name = crawler_name;
		}
		public Object getCrawler_type() {
			return crawler_type;
		}
		public void setCrawler_type(Object crawler_type) {
			this.crawler_type = crawler_type;
		}
		public boolean isIs_tor() {
			return is_tor;
		}
		public void setIs_tor(boolean is_tor) {
			this.is_tor = is_tor;
		}
		public String getThreat_level() {
			return threat_level;
		}
		public void setThreat_level(String threat_level) {
			this.threat_level = threat_level;
		}
		public Object getThreat_types() {
			return threat_types;
		}
		public void setThreat_types(Object threat_types) {
			this.threat_types = threat_types;
		}
		public boolean is_proxy;
	    public Object proxy_type;
	    public boolean is_crawler;
	    public Object crawler_name;
	    public Object crawler_type;
	    public boolean is_tor;
	    public String threat_level;
	    public Object threat_types;
	}
	

