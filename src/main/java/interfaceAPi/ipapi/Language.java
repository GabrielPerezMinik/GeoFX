package interfaceAPi.ipapi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Language {

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNative1() {
		return native1;
	}

	public void setNative1(String native1) {
		this.native1 = native1;
	}

	public String code;
	public String name;
	@SerializedName(value = "native")
	@Expose
	public String native1;
}
