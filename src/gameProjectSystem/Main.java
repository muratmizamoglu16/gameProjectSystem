package gameProjectSystem;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1=new Customer("12332112321","Buse","Gülger",2001);
		Customer customer2=new Customer("12312312312","Murat","Mizamoðlu",2022);
		
		
		CustomerValidatorManager customerValidatorManager=new CustomerValidatorManager();
		customerValidatorManager.validator(customer1);
		customerValidatorManager.validator(customer2);
		
		Game game1=new Game("GTA V",80);
		Game game2=new Game("RDR2",150);
		
		Campaign campaign1=new Campaign("%50 indirim",50);
		Campaign campaign2=new Campaign("%75 indirim",75);
		Campaign campaign3=new Campaign("%33 indirim",33);
		
		
		GameSell gameSell=new GameSell();
		gameSell.sell(game1, customer1);
		
		CampaignManager campaignManager=new CampaignManager();

		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);
		campaignManager.update(campaign3);
		
		campaignManager.use(campaign1, customer2, game2);
		
		
	
	}

}
