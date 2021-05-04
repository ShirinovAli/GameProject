package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void addWithCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("The game was taken by a player named" + gamer.getFirstName() + " " + gamer.getLastName() + " with a" + campaign.getTitle());
	}

	@Override
	public void addWithoutCampaign(Gamer gamer, Game game) {
		System.out.println("The game was taken by a player named" + gamer.getFirstName() + " " + gamer.getLastName());
	}
	
}
