package com.vektorel.javaexample;

import java.awt.List;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class algoritma {

	public static void main(String[] args) {
		algoritma algoritmalar = new algoritma();
		algoritma.kullaniciGirisi();
	}

	public static void kullaniciGirisi() {
		algoritma algo = new algoritma();
		java.util.List<String> kullaniciadilistesi = new ArrayList<String>();
		java.util.List<String> sifrelistesi = new ArrayList<String>();

		kullaniciadilistesi.add("admin");
		kullaniciadilistesi.add("user");
		sifrelistesi.add("admin");
		sifrelistesi.add("user");

		Scanner al = new Scanner(System.in);
		String sifre;
		String giris;
		int dogrulukkontrol = 0;
		System.out.println("------------ Hosgeldiniz -------------");
		System.out.println("Lutfen Kullanici adinizi giriniz.Yoksa,olusturmak icin yeni yazin");
		giris = al.nextLine();
		System.out.println("Lutfen sifrenizi giriniz.");

		sifre = al.nextLine();
		if (giris.equals("yeni") || giris.equals("admin") || giris.equals("user")) {
			dogrulukkontrol++;

		} else {
			System.out.println("HATALI GÝRÝS YAPILDI LUTFEN TEKRAR DENEYÝNÝZ");

			kullaniciGirisi();
		}

		if (giris.equals("yeni")) {
			System.out.println("Yeni kullanici adi giriniz");
			kullaniciadilistesi.add(al.nextLine());
			System.out.println("Sifrenizi olusturun");
			sifrelistesi.add(al.nextLine());
			System.out.println("Tebrikler yeni bir kullanici olusturdunuz!Simdi giris yapabilirsiniz.");
			System.out.println("Kullanici Adinizi giriniz");
			giris = al.nextLine();
		}

		if (giris.equals(kullaniciadilistesi.get(0)) && sifre.equals(sifrelistesi.get(0))) {
			System.out.println("Admin girisi basarili!");
			System.out.println("Sizin için tüm secenekleri buraya getiriyorum.");
			System.out.println("*******ADMIN MENUSU**********");
			

		} else if (giris.equals(kullaniciadilistesi.get(1)) && sifre.equals(sifrelistesi.get(1))) {
			System.out.println("User girisi basarili!");
			System.out.println("Sizin icin sadece ilk 10 algoritmayi getiriyorum");
			System.out.println("******USER MENUSU *********");

		} else if (giris.equals(kullaniciadilistesi.get(2)) && sifre.equals(sifrelistesi.get(2))) {
			System.out.println("Yeni user girisi basarili!");
			System.out.println("Sizin icin sadece ilk 3 algoritmayi getiriyorum");
			System.out.println("*****YENI USER MENUSU*******");
		}

		else {
			System.out.println("HATALI GÝRÝS LUTFEN TEKRAR DENEYÝN");

			kullaniciGirisi();
		}

	}

	public void deneme() {

		System.out.println("JAVARAS");
	}

	public void notOrtalama() {

		System.out.println("Kac adet not gireceksiniz");
		Scanner al = new Scanner(System.in);
		int notSayýsý = al.nextInt();

		java.util.List<Integer> notliste = new ArrayList<>();

		for (int i = 0; i < notSayýsý; i++) {
			System.out.println("Not Giriniz");
			notliste.add(al.nextInt());

		}
		int toplam = 0;
		for (Integer t : notliste) {
			toplam = toplam + t;

		}

		System.out.println("Notlarýn Toplamý = " + toplam);
		System.out.println("Ortalamasý = " + toplam / notSayýsý);

	}

	public void notSýrala() {

		System.out.println("Kac adet not gireceksiniz");
		Scanner al = new Scanner(System.in);
		int notSayýsý = al.nextInt();

		java.util.List<Integer> notliste = new ArrayList<>();

		for (int i = 0; i < notSayýsý; i++) {
			System.out.println("Not Giriniz");
			notliste.add(al.nextInt());
		}

		notliste.sort(null);

		System.out.println("Girilen notlarýn en kucugu =" + notliste.get(0));
		System.out.println("Girilen notlarýn en buyugu =" + notliste.get(notSayýsý - 1));
	}

	public void ondanBuyukmu() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> sayýlar = new ArrayList<>();

		System.out.println("Lutfen 5 adet sayý girin");
		for (int j = 0; j < 5; j++) {
			sayýlar.add(al.nextInt());

		}

		int sayac = 0;

		for (Integer t : sayýlar) {
			if (t > 10) {
				sayac++;

			}

		}
		System.out.println(sayac + " tane 10 dan buyuk sayý girildi");

	}

	public void ikikatiniAl() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> sayýlar = new ArrayList<>();
		System.out.println("istediginiz sayýlarý giriniz(Bitirmek icin 0 girin)");
		int giris = 1;
		while (giris != 0) {
			giris = al.nextInt();
			if (giris != 0) {
				sayýlar.add(giris);
			}
		}

		for (Integer t : sayýlar) {

			System.out.println(t * 2);
		}

	}

	public void randomYaslarýbul() {

		java.util.List<Integer> yaslistesi = new ArrayList<>();
		Random rasgele = new Random();

		for (int i = 0; i < 30; i++) {
			int uretilen = rasgele.nextInt(5);
			uretilen = uretilen + 10;
			yaslistesi.add(uretilen);

		}
		int sayac = 1;
		for (Integer t : yaslistesi) {
			if (t >= 13 && t <= 15) {
				sayac++;
			}
			System.out.println("" + t);
		}
		System.out.print(+sayac);
		System.out.println(" tane 13 ile 15 arasýnda sayý var");

	}

	public void ayrýayrýRandombul() {

		java.util.List<Integer> sýnýfýnYaslarý = new ArrayList<>();
		Random rasgele = new Random();
		System.out.println("Sýnýf yaratýlýyor..");
		System.out.println("30 kisilik sýnýfýn yaslari");

		for (int i = 0; i < 30; i++) {
			int uretilen = rasgele.nextInt(5);
			uretilen = uretilen + 10;
			sýnýfýnYaslarý.add(uretilen);
			System.out.print(" " + uretilen);
		}
		System.out.println("\n");
		int sayac13 = 0;
		int sayac14 = 0;

		for (Integer t : sýnýfýnYaslarý) {
			if (t == 13) {
				sayac13++;

			}
			if (t == 14) {
				sayac14++;

			}
		}
		System.out.println("Yasý 14 olanlarýn sayýsý = " + sayac14);
		System.out.println("Yasý 13 olanlarýn sayýsý = " + sayac13);

	}

	public void kareleriniAl() {

		Scanner al = new Scanner(System.in);
		System.out.println("Lutfen 5 adet sayý giriniz");
		java.util.List<Integer> bestanesayý = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			System.out.println(i + ".sayý");
			bestanesayý.add(al.nextInt());

		}
		for (Integer t : bestanesayý) {

			System.out.println(t * t);

		}
	}

	public void notYuzdeli() {
		Scanner al = new Scanner(System.in);
		System.out.println("1.Vize Giriniz");
		int ilkvize = al.nextInt();
		System.out.println("2.Vize Giriniz");
		int ikincivize = al.nextInt();
		System.out.println("Final Giriniz");
		int finalnot = al.nextInt();
		double notortalamasý = (ilkvize * 0.3) + (ikincivize * 0.3) + (finalnot * 0.4);
		System.out.println("Not ortalamanýz = " + notortalamasý);
		if (notortalamasý <= 50) {
			System.out.println("Not ortalamanýz kotu gözüküyor.");
		} else if (notortalamasý >= 50 && notortalamasý <= 80) {
			System.out.println("Not ortamalanýz normal gozüküyor");
		} else if (notortalamasý >= 80) {
			System.out.println("Not ortalamanýz harika gözüküyor");

		}
	}

	public void birsayýOncarpým() {
		java.util.List<Integer> carpýlacaksayýlar = new ArrayList<>();
		Scanner al = new Scanner(System.in);
		System.out.println("1 adet sayý giriniz");
		int sayi1 = al.nextInt();
		System.out.println("10 adet sayý giriniz");
		for (int i = 0; i < 10; i++) {
			carpýlacaksayýlar.add(al.nextInt());

		}
		for (Integer t : carpýlacaksayýlar) {
			System.out.println(sayi1 * t);
		}

	}

	public void bestenBuyukmu() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> sayýlar = new ArrayList<>();
		System.out.println("10 Tane sayý giriniz");
		for (int i = 0; i < 10; i++) {

			sayýlar.add(al.nextInt());

		}

		for (Integer t : sayýlar) {
			if (t <= 5) {
				System.out.println(t * 2);
			} else
				System.out.println(t / 2);
		}

	}

	public void malKomisyon() {

		Scanner al = new Scanner(System.in);
		java.util.List<Integer> mallistesi = new ArrayList<>();
		System.out.println("5 adet mal fiyati giriniz");
		for (int i = 0; i < 5; i++) {
			mallistesi.add(al.nextInt());

		}
		double toplamkomisyon = 0;
		for (Integer t : mallistesi) {
			if (t > 50) {
				toplamkomisyon += t / 50;

			} else
				toplamkomisyon += t * 3 / 100;
		}
		System.out.println("Alýnacak toplam komisyon bedeli = " + toplamkomisyon);
	}

	public void cemberHesabý() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> capuzunluklarý = new ArrayList<>();
		System.out.println("5 adet cember yarýcapý giriniz");

		for (int i = 0; i < 5; i++) {
			capuzunluklarý.add(al.nextInt());

		}
		for (Integer t : capuzunluklarý) {
			System.out.println("Yarý capý " + t + " olan bir cemberin alaný " + (t * t * Math.PI) + "'dir");

			System.out.println("Yarý capý " + t + " olan bir cemberin cevresi " + (t * 2 * Math.PI) + "'dir");
		}
	}

	public void notBuyukkucuk() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> notlistesi = new ArrayList<>();
		System.out.println("Kac tane not gireceksiniz");
		int notsayýsý = al.nextInt();
		System.out.println("Lutfen notlarý giriniz");
		for (int i = 0; i < notsayýsý; i++) {
			notlistesi.add(al.nextInt());

		}

		notlistesi.sort(null);
		System.out.println("Girdiginiz en yüksek not = " + notlistesi.get(notsayýsý - 1));
		System.out.println("Girdiginiz en düsük not = " + notlistesi.get(0));

	}

	public void saatYap() {
		System.out.println("Saati baslýyor");
		Scanner al = new Scanner(System.in);

		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					System.out.println(+i + "." + j + "." + j2);

				}

			}

		}

	}

	public void notlarýBesliktabandayazma() {
		System.out.println("Kac adet not gireceksiniz");
		Scanner al = new Scanner(System.in);
		int notSayýsý = al.nextInt();

		java.util.List<Integer> notliste = new ArrayList<>();

		for (int i = 0; i < notSayýsý; i++) {
			System.out.println("Not Giriniz");
			notliste.add(al.nextInt());

		}
		for (Integer t : notliste) {
			if (t <= 45) {
				System.out.println("Girilen " + t + " notu zayýftýr ve not karsýlýgý 1 dir");
			} else if (t > 45 && t <= 55) {
				System.out.println("Girilen " + t + " notu vasattýr ve not karsýlýgý 2 dir");
			} else if (t > 55 && t <= 69) {
				System.out.println("Girilen " + t + " notu ortadir ve not karsýlýgý 3 dur");
			} else if (t > 69 && t <= 84) {
				System.out.println("Girilen " + t + " notu iyidir ve not karsýlýgý 4 tür");

			} else if (t > 84) {
				System.out.println("Girilen " + t + " notu pekiyidir ve not karsýlýgý 5 tir");

			}
		}
	}

	public void ayNumarasý() {
		Scanner al = new Scanner(System.in);
		System.out.println("Bir ay numarasý giriniz");
		int numara = al.nextInt();
		switch (numara) {
		case 1:
			System.out.println("Girdiginiz ay ocaktir");
			break;
		case 2:
			System.out.println("Girdiginiz ay subattir");
			break;
		case 3:
			System.out.println("Girdiginiz ay marttir");
			break;
		case 4:
			System.out.println("Girdiginiz ay nisandir");
			break;
		case 5:
			System.out.println("Girdiginiz ay mayýstýr");
			break;
		case 6:
			System.out.println("Girdiginiz ay hazirandir");
			break;
		case 7:
			System.out.println("Girdiginiz ay temmuzdur");
			break;
		case 8:
			System.out.println("Girdiginiz ay agustostur");
			break;
		case 9:
			System.out.println("Girdiginiz ay eylüldür");
			break;
		case 10:
			System.out.println("Girdiginiz ay ekimdir");
			break;
		case 11:
			System.out.println("Girdiginiz ay kasýmdir");
			break;
		case 12:
			System.out.println("Girdiginiz ay aralýktýr");
			break;

		default:
			break;
		}

	}

	public void haftanýnKacýncýgunu() {
		Scanner al = new Scanner(System.in);
		String[] gunler = { "pazartesi", "salý", "carsamba", "persembe", "cuma", "cumartesi", "pazar" };
		System.out.println("Bir gün yazýnýz(ör:pazartesi)");
		String gun = al.nextLine();
		for (int i = 0; i < gunler.length; i++) {
			if (gun.equals(gunler[i])) {
				System.out.println("Haftanýn " + (i + 1) + "inci günü");
			}

		}

	}

	public void kdvToplamhesabý() {
		Scanner al = new Scanner(System.in);
		java.util.List<Double> hamfiyat = new ArrayList<>();
		java.util.List<Double> kdvler = new ArrayList<>();
		System.out.println("Mal adedi giriniz");
		int maladedi = al.nextInt();
		for (int i = 0; i < maladedi; i++) {
			System.out.println("Mal fiyati giriniz");
			hamfiyat.add(al.nextDouble());
			System.out.println("Mal kdv giriniz");
			kdvler.add(al.nextDouble());

		}
		double toplam = 0;
		for (int i = 0; i < maladedi; i++) {
			double netfiyat = hamfiyat.get(i) + (hamfiyat.get(i)) * (kdvler.get(i) / 100);
			System.out.println(+(i + 1) + " inci mal icin toplam mal degeri = " + netfiyat);

			toplam += netfiyat;

		}
		System.out.println("Toplam fiyat = " + toplam);

	}

	public void sarkýSuresi() {
		Scanner al = new Scanner(System.in);
		System.out.println("5 adet sarký süresini dakika olarak giriniz");
		java.util.List<Integer> sarkýdakika = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			System.out.println((+i + 1) + " inci sarký icin dakika giriniz");
			sarkýdakika.add(al.nextInt());

		}
		double toplamdakika = 0;

		for (Integer t : sarkýdakika) {
			toplamdakika += t;
		}

		System.out.println("Girilen sarkýlar toplam " + toplamdakika / 60 + " saat eder");

	}

	public void islemYap() {
		Scanner al = new Scanner(System.in);

		System.out.println("------------ISLEM MENUSU---------------");
		System.out.println("+ -----> toplama");
		System.out.println("- -----> cýkarma");
		System.out.println("* -----> carpma");
		System.out.println("/ -----> bolme");
		System.out.println("---------------------------------------");
		System.out.println("Lutfen yapmak istediginiz islemi secin");
		String islem = al.nextLine();

		System.out.println("Islem yapacagýnýz sayýlarý giriniz");
		System.out.print("Sayý 1 :\n");
		int sayi1 = al.nextInt();
		System.out.print("Sayý 2 :\n");
		int sayi2 = al.nextInt();

		if (islem.equals("+")) {
			System.out.println(sayi1 + " ile " + sayi2 + " nin toplamý " + (sayi1 + sayi2) + "'dir");

		} else if (islem.equals("-")) {
			System.out.println(sayi1 + " ile " + sayi2 + " nin farki " + (sayi1 - sayi2) + "'dir");

		} else if (islem.equals("*")) {
			System.out.println(sayi1 + " ile " + sayi2 + " nin carpýmý " + (sayi1 * sayi2) + "'dir");

		} else if (islem.equals("/")) {
			System.out.println(sayi1 + " ile " + sayi2 + " nin bolumu " + (sayi1 / sayi2) + "'dir");

		}
	}

	public void sayýyýYazýyacevir() {
		Scanner al = new Scanner(System.in);
		System.out.println("Yazýya cevirilecek sayiyi giriniz");
		int sayi = al.nextInt();

		int birler = (sayi % 10);
		int onlar = ((sayi / 10) % 10);
		int yuzler = ((sayi / 100) % 10);
		int binler = ((sayi / 1000) % 10);
		int onBinler = ((sayi / 10000) % 10);
		int yuzBinler = ((sayi / 100000) % 10);
		int milyon = ((sayi / 1000000) % 10);
		int milyar = ((sayi / 10000000) % 10);

		String[] birBas = { "", "Bir", "Ýki", "Üç", "Dört", "Beþ", "Altý", "Yedi", "Sekiz", "Dokuz" };
		String[] onBas = { "", "On", "Yirmi", "Otuz", "Kýrk", "Elli", "Altmýþ", "Yetmiþ", "Seksen", "Doksan" };
		String[] yuzBas = { "", "Yüz", "Ýkiyüz", "Üçyüz", "Dörtyüz", "Beþyüz", "Altýyüz", "Yediyüz", "Sekizyüz",
				"Dokuzyüz" };
		String[] binBas = { "", "Bin", "Ýkibin", "Üçbin", "Dörtbin", "Beþbin", "Altýbin", "Yedibin", "Sekizbin",
				"Dokuzbin" };
		String[] milyonBas = { "", "BirMilyon", "ÝkiMilyon", "ÜçMilyon", "DörtMilyon", "BeþMilyon", "AltýMilyon",
				"YediMilyon", "SekizMilyon", "DokuzMilyon" };
		String[] milyarBas = { "", "BirMilyar", "ÝkiMilyar", "UcMilyar", "DortMilyar", "BesMilyar", "AltýMilyar",
				"YediMilyar", "SekizMilyar", "DokuzMilyar" };
		System.out.println(milyarBas[milyar] + "" + milyonBas[milyon] + " " + yuzBas[yuzBinler] + " " + onBas[onBinler]
				+ " " + binBas[binler] + " " + yuzBas[yuzler] + " " + onBas[onlar] + " " + birBas[birler]);
		System.out.println("");

	}

	public void tcKimlikdogrulama() {
		System.out.println("Lütfen kontrol icin Tc kimlik no giriniz:");
		Scanner al = new Scanner(System.in);

		String tcno = al.nextLine();

		System.out.println("Girilen " + tcno + " sayýsý dogrulanýyor..");

		int uzunluk = tcno.length();

		if (uzunluk != 11) {
			System.out.println("Tc Kimlik hatalýdýr");
		} else {
			System.out.println("Uzunluk kontrolu basarili!");
		}
		boolean sýfýrmý = tcno.startsWith("0");
		if (sýfýrmý == true) {
			System.out.println("Tc Kimlik hatalýdýr");
		} else {
			System.out.println("Ýlk rakam kontrolu basarili!");
		}

		int hane[] = new int[11];
		int sonrakam = 0;
		for (int i = 0; i < 11; i++) {
			hane[i] = Integer.parseInt(String.valueOf(tcno.charAt(i)));
			sonrakam = hane[i];
		}
		// System.out.println(hane[2]);
		// System.out.println(sonrakam);
		int hatasayacý = 0;
		if (sonrakam % 2 != 0) {
			System.out.println("Tc kimlik hatalýdýr(son rakamý cift degil)");
			hatasayacý++;

		} else
			System.out.println("Son rakam konrtolu basarili!");

		if (((hane[0] + hane[2] + hane[4] + hane[6] + hane[8]) * 7 + (hane[1] + hane[3] + hane[5] + hane[7]) * 9)
				% 10 != hane[9]) {
			System.out.println("1.esitlik konrolü basarisiz.Hatalý TC Kimlik numarasý");
			hatasayacý++;
		} else {
			System.out.println("1.esitlik kontrolü basarili!");
		}

		if (((hane[0] + hane[2] + hane[4] + hane[6] + hane[8]) * 8) % 10 != hane[10]) {
			System.out.println("2.esitlik kontrolü basarisiz.Hatalý TC Kimlik numarasý");
			hatasayacý++;

		} else {
			System.out.println("2.esitlik kontrolü basarili!");
		}
		if (hatasayacý == 0) {
			System.out.println("Tebrikler TC Kimlik dogrulandi!");
		} else {
			System.out.println(
					hatasayacý + " tane hata bulunmaktadir,girdiginiz numara bir tc kimlik numarasi degildir.");
		}

	}

	public void ucgenCiz() {
		Scanner al = new Scanner(System.in);
		int kenarlar[] = new int[4];
		int hataoku = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Ücgenin " + i + ".kenarini giriniz");
			kenarlar[i] = al.nextInt();

		}

		if ((kenarlar[1] + kenarlar[2]) > kenarlar[0] && (kenarlar[1] - kenarlar[2]) < kenarlar[0]
				|| (kenarlar[0] + kenarlar[2]) > kenarlar[1] && (kenarlar[0] - kenarlar[2]) < kenarlar[2]
				|| (kenarlar[0] + kenarlar[1]) > kenarlar[2] && (kenarlar[0] - kenarlar[1]) < kenarlar[2]) {
			System.out.println("Bu ucgen cizim kurallarýna uyuyor");

		} else {
			System.out.println("Bu ucgen cizilemez");
			hataoku++;
		}

		if (kenarlar[0] == kenarlar[1] && kenarlar[0] == kenarlar[2] && kenarlar[1] == kenarlar[2]) {
			System.out.println("Bu bir eskanar ücgendir.");
		} else if (kenarlar[0] == kenarlar[1] || kenarlar[0] == kenarlar[2] && kenarlar[1] == kenarlar[2]) {
			System.out.println("Bu bir ikizkenar ücgendir.");
		} else if (kenarlar[0] != kenarlar[1] && kenarlar[0] != kenarlar[2] && kenarlar[1] != kenarlar[2]) {
			System.out.println("Bu bir cesitkenar ücgendir");

		} else {
			System.out.println("Bu ucgen cizilemez");
			hataoku++;

		}
		if (hataoku == 0) {

			System.out.println("Cizilen ucgenin cevresi" + (kenarlar[0] + kenarlar[1] + kenarlar[2]));
			System.out.println("Cizilen ucgenin alaný " + (kenarlar[0] * kenarlar[1] / 2));

		}

	}
}
