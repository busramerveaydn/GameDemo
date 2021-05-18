package gameDemo.Concrete;

import gameDemo.Abstract.BaseGamerManager;
import gameDemo.Abstract.GamerCheckServices;
import gameDemo.Entities.Gamer;

public class GamerManager extends BaseGamerManager{
	
	GamerCheckServices gamerCheckServices;
	BaseGamerManager baseGamerManager;
	
	public GamerManager(GamerCheckServices gamerCheckServices) {
		super();
		this.gamerCheckServices = gamerCheckServices;
	} 
	
	public void save(Gamer gamer) {
		
		if (gamerCheckServices.CheckIfRealGmaer(gamer)) {
			
			baseGamerManager.addGamer(gamer);
			
		} else {
			
			System.out.println("Not a valid person!");
			
		}
	}
}
