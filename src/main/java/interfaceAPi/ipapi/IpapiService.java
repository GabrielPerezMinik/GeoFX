package interfaceAPi.ipapi;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;

import interfaceAPi.ApiClient;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IpapiService extends ApiClient<IpapiInterface>{

	private static final String BASE_URL="https://ipapi.com/";
	
	public Gson gson=new Gson();
	
	
	public IpapiService() {
		
		super(BASE_URL,IpapiInterface.class);
	
		
	}
	
	public DatosIp getIpapi(String ip) throws IOException {
		
		Response<DatosIp>reponseRoot=getService().getDatos(ip).execute();
		
		return reponseRoot.body();
		
	}
	
	//public acceptResponse
	
}
