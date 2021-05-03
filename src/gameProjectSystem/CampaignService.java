package gameProjectSystem;

public interface CampaignService {

	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	void use(Campaign campaign,Customer Customer,Game game);
}
