package g211210006;

import java.util.Locale;
import java.util.Scanner;
import java.net.URISyntaxException;
public class Test {

	public static void main(String[] args) throws URISyntaxException {
		
		Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US); // Locale ayarını İngilizce yapıyoruz.

		System.out.print("voltaj: ");
		double voltaj = in.nextDouble();
		System.out.print("sicaklik: ");
		double sicaklik = in.nextDouble();
		Pil pil = new Pil(voltaj,sicaklik);
		System.out.println(pil);
	}

}
