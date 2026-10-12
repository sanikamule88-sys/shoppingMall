package bank.com.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Services.ShoppingDetails;

@RestController
public class ShoppingController {

	ShoppingDetails s = new ShoppingDetails();

	@GetMapping("Electronic")
	public void Electronic() {
		s.Electronic();
	}
	@GetMapping("beauty")
	String Beautyproducts() 
	{
		 return s.BeautyProducts();
		
	}
	@GetMapping("grocery")
	String Groceries() 
	{
		 return s.Groceries();
		
	}
	@GetMapping("dailyneeds")
	
	String dailyneeds()
	{
		  return s.dailyneeds();
		
	}
}
