package interfaceAPi.ipify;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface IpifyInterface {

	@GET("https://api.ipify.org/")
	public Call<IpifyJson>getIp(@Query("format")String format);
	
}
