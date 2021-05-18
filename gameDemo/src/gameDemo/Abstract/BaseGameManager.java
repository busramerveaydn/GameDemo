package gameDemo.Abstract;

import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;

public  class BaseGameManager implements GameServices{

	@Override
	public void addGame(Game game, Gamer gamer) {
		
		System.out.println(game.getGameNameString() + " adlý oyunu " + gamer.getFirstNameString() + " " + gamer.getLastNameString() + " kullanýcý tarafýndan sisteme eklendi ve oyun ücreti: " + game.getGameUnitPrice() + " TL");
		
	}

}
