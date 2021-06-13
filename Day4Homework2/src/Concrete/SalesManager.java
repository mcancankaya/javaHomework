package Concrete;

import Abstract.ISalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements ISalesService {

	@Override
	public void sales(Gamer gamer, Game game) {
		System.out.println(game.getGameName()+" oyunu, "+gamer.getFirstName()+" tarafýndan satýldý.");
		
	}

	@Override
	public void salesWithCampaign(Campaign campaign, Game game, Gamer gamer) {
		System.out.println(game.getGameName()+" oyunu, "+gamer.getFirstName()+"tarafýndan, %"+campaign.getDiscount()+" indirim ile  satýldý.");
		
	}

}
