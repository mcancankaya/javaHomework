package Main;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer= new Gamer(1, "Mahmut Can", "�ankaya","10304800770",LocalDate.of(1999, 8, 25));
		
		Game game = new Game(1,"CS:GO","fps Oyunu",200);
		
		Campaign campaign= new Campaign(1,"Yaz Kampanyas�","Yaza �zel T�m oyunlarda %10 indirim",10);
		
		
		GamerManager gamerManager= new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sales(gamer, game);
		salesManager.salesWithCampaign(campaign, game, gamer);
		
		

	}

}
