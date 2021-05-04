package ConsoleUI;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Concrete.ValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1,"GTA 5", 1850);
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game1);
		gameManager.delete(game1);
		
		
		Gamer gamer = new Gamer(1,"Ali","Shirinov","1234567891011","10.08.1994");
		GamerManager gamerManager = new GamerManager(new ValidationManager());
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		Campaign campaign = new Campaign(1,"A new way to PC.", "Galaxy Book Pro 360", 20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		
		SaleManager saleManager = new SaleManager();
		saleManager.addWithCampaign(gamer, game1, campaign);
		
		saleManager.addWithoutCampaign(gamer, game1);
	}

}
