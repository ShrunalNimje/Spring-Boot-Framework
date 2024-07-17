package my.mood.Spring_Boot_Framework;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfiguation {

	public String url;
	public String username;
	public int key;
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setusername(String username) {
		this.username = username;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getUsername() {
		return username;
	}
	
	public int getKey() {
		return key;
	}
	
}
