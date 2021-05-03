package gameProjectSystem;

public class CustomerValidatorManager implements CustomerValidatorService{

	@Override
	public void validator(Customer customer) {
		
		if(!customer.getName().isEmpty() && customer.getBirthYear()>1900 && customer.getBirthYear()<2021) {
			
			System.out.println("Kay�t ba�ar�yla olu�turuldu.");
		}
		else {
			System.out.println("�zg�n�z kay�t ge�ersiz.");
		}
	}

}
