package istanbuldakiDukkanlar;

import java.util.Scanner;

public class program {
	Scanner klavyedenOKu=new Scanner(System.in);

	while(islem)
	{

		System.out.println("Hangi i�lemi yapmak istersiniz?");
		System.out.println("giysi i�in: 1");
		System.out.println("kuaf�r i�in: 2");
		System.out.println("��k�� i�in: 3");

		int islem = klavyedenOKu.nextInt();
		if (islem == 1) {
			giysi nesne1 = new giysi();
			nesne1.giysiCesidi = "bluz";

		}
		if (islem == 2) {
			kuaf�r nesne2 = new kuaf�r();
			nesne2.kullanilanBoyaMarkasi = "garnier";
			nesne2.kuaforSahibi = "songul";

		}
		if (islem == 3) {
			System.out.println("islem yok");
		}

	}
}}
