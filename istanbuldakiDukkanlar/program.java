package istanbuldakiDukkanlar;

import java.util.Scanner;

public class program {
	Scanner klavyedenOKu=new Scanner(System.in);

	while(islem)
	{

		System.out.println("Hangi iþlemi yapmak istersiniz?");
		System.out.println("giysi için: 1");
		System.out.println("kuaför için: 2");
		System.out.println("çýkýþ için: 3");

		int islem = klavyedenOKu.nextInt();
		if (islem == 1) {
			giysi nesne1 = new giysi();
			nesne1.giysiCesidi = "bluz";

		}
		if (islem == 2) {
			kuaför nesne2 = new kuaför();
			nesne2.kullanilanBoyaMarkasi = "garnier";
			nesne2.kuaforSahibi = "songul";

		}
		if (islem == 3) {
			System.out.println("islem yok");
		}

	}
}}
