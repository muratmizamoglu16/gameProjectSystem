package gameProjectSystem;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyası başlamıştır.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyası sona ermiştir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyası güncellenmiştir.");
	}

	@Override
	public void use(Campaign campaign, Customer Customer,Game game) {
		
		double result=game.getPrice()/(100/campaign.getDiscountRate());
		System.out.println(campaign.getName()+" kampanyasından sonra, "+game.getName()+" oyununun fiyatı: "+result);
	}
	

}
