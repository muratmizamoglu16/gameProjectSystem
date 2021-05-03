package gameProjectSystem;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyasý baþlamýþtýr.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyasý sona ermiþtir.");
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Sitemizde "+campaign.getName()+" kampanyasý güncellenmiþtir.");
	}

	@Override
	public void use(Campaign campaign, Customer Customer,Game game) {
		
		double result=game.getPrice()/(100/campaign.getDiscountRate());
		System.out.println(campaign.getName()+" kampanyasýndan sonra, "+game.getName()+" oyununun fiyatý: "+result);
	}
	

}
