package interfaceAPi;

import java.util.concurrent.TimeUnit;


import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient<T> {

	
	private T service;
	
	public ApiClient(String baseUrl,Class<T> clas) {
		
		
		
		ConnectionPool pool=new ConnectionPool(1,5,TimeUnit.SECONDS);
		
		OkHttpClient client = new OkHttpClient.Builder()
                .connectionPool(pool)
                .build(); 
		Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
		service= retrofit.create(clas);
		
	}
	
	public T getService() {
		return service;
	}
	
}
