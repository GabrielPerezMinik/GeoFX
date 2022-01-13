package interfaceAPi.ipapi;

import java.io.IOException;
import com.google.gson.Gson;
import interfaceAPi.ApiClient;
import retrofit2.Response;


public class IpapiService extends ApiClient<IpapiInterface>{

	private static final String BASE_URL="https://ipapi.com/";
	
	//public Gson gson=new Gson();
	
	
	public IpapiService() {
		
		super(BASE_URL,IpapiInterface.class);
	
		
	}
	
	public DatosIp getIpapi(String ip) throws IOException {
		
		Response<DatosIp>reponseRoot=getService().getDatos(ip).execute();
		
		return reponseRoot.body();
		
	}
	
}
