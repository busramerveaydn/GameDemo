package gameDemo.Concrete;

import gameDemo.Abstract.GamerCheckServices;
import gameDemo.Entities.Gamer;

public class GamerCheckmanager implements GamerCheckServices{

	@Override
	public boolean CheckIfRealGmaer(Gamer gamer) {
		
		return true;
	}

}
