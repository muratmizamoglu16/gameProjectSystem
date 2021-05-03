package gameProjectSystem;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyas� ba�lam��t�r.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyas� sona ermi�tir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyas� g�ncellenmi�tir.");
	}

	@Override
	public void use(Campaign campaign, Customer Customer,Game game) {
		
		double result=game.getPrice()/(100/campaign.getDiscountRate());
		System.out.println(campaign.getName()+" kampanyas�ndan sonra, "+game.getName()+" oyununun fiyat�: "+result);
	}
	

}
