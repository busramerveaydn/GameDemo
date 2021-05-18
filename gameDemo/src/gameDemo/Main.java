package gameDemo;

import gameDemo.Abstract.BaseCampaingManager;
import gameDemo.Abstract.BaseGameManager;
import gameDemo.Abstract.BaseGamerManager;
import gameDemo.Adaptor.MernisServiceAdaptor;
import gameDemo.Concrete.GamerManager;
import gameDemo.Entities.Campaing;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer(1, "Büþra Merve","Aydýn",1197,"11111111111");
		
		Game game = new Game(1, "Game 1", 12);
		
		Campaing campaing = new Campaing("19 Mayýs Ýndirimi", 10);
		
		BaseGamerManager baseGamerManager = new GamerManager(new MernisServiceAdaptor());
		
		BaseGameManager baseGameManager = new BaseGameManager();
		
		BaseCampaingManager baseCampaingManager = new BaseCampaingManager();
		
		baseGamerManager.addGamer(gamer);
		
		System.out.println("-------------------------------------");
		
		baseGamerManager.updateGamer(gamer);
		
		System.out.println("-------------------------------------");
		
		baseGamerManager.deleteGamer(gamer);
		
		System.out.println("-------------------------------------");
		
		baseGameManager.addGame(game, gamer);
		
		System.out.println("-------------------------------------");
		
		baseCampaingManager.addCampaing(campaing);
		
		System.out.println("-------------------------------------");
		
		campaing.setDiscount(15);
		
		baseCampaingManager.updateCampaing(campaing);
		
		System.out.println("-------------------------------------");
		
		baseCampaingManager.deleteCampaing(campaing);
	}

}
