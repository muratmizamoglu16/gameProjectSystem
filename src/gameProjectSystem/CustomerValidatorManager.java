package gameProjectSystem;

public class CustomerValidatorManager implements CustomerValidatorService{

	@Override
	public void validator(Customer customer) {
		
		if(!customer.getName().isEmpty() && customer.getBirthYear()>1900 && customer.getBirthYear()<2021) {
			
			System.out.println("Kayýt baþarýyla oluþturuldu.");
		}
		else {
			System.out.println("Üzgünüz kayýt geçersiz.");
		}
	}

}
