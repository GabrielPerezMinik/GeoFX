package interfaceAPi.ipify;


import java.io.IOException;

import interfaceAPi.ApiClient;
import retrofit2.Response;


public class IpifyService extends ApiClient<IpifyInterface> {

	
	

	private static final String BASE_URL="https://api.ipify.org/";
	
	
	
	public IpifyService() {
		super(BASE_URL,IpifyInterface.class);
		
	}
	
	public IpifyJson getIpifyjson() throws IOException {
		Response<IpifyJson>reponseRoot=getService().getIp("json").execute();
		return reponseRoot.body();
		
	}
	
}
