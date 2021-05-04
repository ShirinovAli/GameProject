package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void addWithCampaign(Gamer gamer, Game game, Campaign campaign);

	void addWithoutCampaign(Gamer gamer, Game game);
}
