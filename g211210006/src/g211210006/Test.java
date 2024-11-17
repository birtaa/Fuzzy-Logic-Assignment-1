package g211210006;

import java.net.URISyntaxException;
import java.util.Scanner;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Rule;
public class Test {

	public static void main(String[] args) throws URISyntaxException {
		
		Scanner in = new Scanner(System.in);

		System.out.print("voltaj: ");
		double voltaj = in.nextDouble();
		System.out.print("sicaklik: ");
		double sicaklik = in.nextDouble();
		Pil pil = new Pil(voltaj,sicaklik);
		System.out.println(pil);
		
		JFuzzyChart.get().chart(pil.getModel());
		for(Rule r: pil.getModel().getFunctionBlock("PilModel").getFuzzyRuleBlock("kuralblok1").getRules()) {
			if(r.getDegreeOfSupport()>0)
				System.out.println(r);
		}
	}

}
