package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface ISalesService {
	void sales(Gamer gamer,Game game);
	void salesWithCampaign(Campaign campaign,Game game, Gamer gamer);
}
