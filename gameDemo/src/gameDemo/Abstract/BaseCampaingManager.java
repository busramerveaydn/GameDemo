package gameDemo.Abstract;

import gameDemo.Entities.Campaing;

public  class BaseCampaingManager implements CampaingServices{

	@Override
	public void addCampaing(Campaing campaing) {
		
		System.out.println(campaing.getCampainNameString() + " isimli kapmanya sisteme eklendi ve indirim oanrý %" + campaing.getDiscount());
		
	}

	@Override
	public void updateCampaing(Campaing campaing) {
		
		System.out.println(campaing.getCampainNameString() + " isimli kampanya güncellendi. Yeni indirim oraný %" + campaing.getDiscount());
		
	}

	@Override
	public void deleteCampaing(Campaing campaing) {
		
		System.out.println(campaing.getCampainNameString() + " isimli kampanya sistemden silindi.");
		
	}

}
