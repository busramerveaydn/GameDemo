package gameDemo.Adaptor;

import java.util.Locale;

import gameDemo.Abstract.GamerCheckServices;
import gameDemo.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

// new Locale("tr") türkçe karakter
public class MernisServiceAdaptor implements GamerCheckServices{

	@Override
	public boolean CheckIfRealGmaer(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		try {
			result =  client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalIdString()),
					gamer.getFirstNameString().toLowerCase(new Locale("tr")), 
					gamer.getLastNameString().toUpperCase(),
					gamer.getBirthYear());
			return result;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return result;
		}
		
	}

}
