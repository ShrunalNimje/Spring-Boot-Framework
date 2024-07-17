package my.mood.Spring_Boot_Framework;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {
	
	@RequestMapping("/mymood")
	public List<Details> retrieveAllDetails() {
		return Arrays.asList(
				new Details("Shrunal", 20, "Nagpur - 17"),
				new Details("Ritik", 21, "Nagpur - 16"),
				new Details("Nimje", 45, "Nagpur - 10")				
				);
	}
}
