package gameProjectSystem;

public class GameSell implements GameMarketService{

	@Override
	public void sell(Game game, Customer customer) {
		
		System.out.println("Tebrikler "+customer.getName()+" , "+ game.getName()+ " oyunu baþarýyla envanterinize eklendi.");
		
	}

}
