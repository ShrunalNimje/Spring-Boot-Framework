package my.mood.Spring_Boot_Framework;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	CurrencyServiceConfiguation currency;

	@RequestMapping("/mymoodOne")
	public CurrencyServiceConfiguation retrieveAllCurrenyServices() {
		return currency;
	}
}
