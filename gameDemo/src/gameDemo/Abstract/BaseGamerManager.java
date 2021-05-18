package gameDemo.Abstract;

import gameDemo.Entities.Gamer;

public  class BaseGamerManager implements GamerServices{

	@Override
	public void addGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstNameString() + " " + gamer.getLastNameString() + " adlý oyuncu sisteme eklendi.");
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstNameString() + " " + gamer.getLastNameString() + " adlý oyuncunun bilgileri güncellendi.");
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstNameString() + " " + gamer.getLastNameString() + " adlý oyuncu sistemden silindi.");
		
	}

}
