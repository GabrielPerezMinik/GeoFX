package interfaceAPi.ipify;


import retrofit2.Call;
import retrofit2.http.GET;

interface IpifyInterface {

	@GET
	public Call<String>getIp();
	
}
