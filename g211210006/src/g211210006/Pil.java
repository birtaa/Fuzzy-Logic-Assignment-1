package g211210006;

import java.io.File;
import java.net.URISyntaxException;

import net.sourceforge.jFuzzyLogic.FIS;

public class Pil {
	private FIS fis;
	private double voltaj;
	private double sicaklik;
	
	public Pil(double voltaj,double sicaklik) throws URISyntaxException {
		this.voltaj=voltaj;
		this.sicaklik=sicaklik;
		
		File dosya = new File(getClass().getResource("PilModel.fcl").toURI());
		fis = FIS.load(dosya.getPath());
		fis.setVariable("voltaj", voltaj);
		fis.setVariable("sicaklik", sicaklik);
		fis.evaluate();
	}
	@Override
	public String toString() {
	    return "Voltaj: " + this.voltaj + ", Sicaklik: " + this.sicaklik + "Pil yuzdesi: %" + fis.getVariable("bataryaSeviyesi").getValue();
	}
}
