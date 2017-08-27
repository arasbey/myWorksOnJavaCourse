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
			System.out.println("HATALI G�R�S YAPILDI LUTFEN TEKRAR DENEY�N�Z");

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
			System.out.println("Sizin i�in t�m secenekleri buraya getiriyorum.");
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
			System.out.println("HATALI G�R�S LUTFEN TEKRAR DENEY�N");

			kullaniciGirisi();
		}

	}

	public void deneme() {

		System.out.println("JAVARAS");
	}

	public void notOrtalama() {

		System.out.println("Kac adet not gireceksiniz");
		Scanner al = new Scanner(System.in);
		int notSay�s� = al.nextInt();

		java.util.List<Integer> notliste = new ArrayList<>();

		for (int i = 0; i < notSay�s�; i++) {
			System.out.println("Not Giriniz");
			notliste.add(al.nextInt());

		}
		int toplam = 0;
		for (Integer t : notliste) {
			toplam = toplam + t;

		}

		System.out.println("Notlar�n Toplam� = " + toplam);
		System.out.println("Ortalamas� = " + toplam / notSay�s�);

	}

	public void notS�rala() {

		System.out.println("Kac adet not gireceksiniz");
		Scanner al = new Scanner(System.in);
		int notSay�s� = al.nextInt();

		java.util.List<Integer> notliste = new ArrayList<>();

		for (int i = 0; i < notSay�s�; i++) {
			System.out.println("Not Giriniz");
			notliste.add(al.nextInt());
		}

		notliste.sort(null);

		System.out.println("Girilen notlar�n en kucugu =" + notliste.get(0));
		System.out.println("Girilen notlar�n en buyugu =" + notliste.get(notSay�s� - 1));
	}

	public void ondanBuyukmu() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> say�lar = new ArrayList<>();

		System.out.println("Lutfen 5 adet say� girin");
		for (int j = 0; j < 5; j++) {
			say�lar.add(al.nextInt());

		}

		int sayac = 0;

		for (Integer t : say�lar) {
			if (t > 10) {
				sayac++;

			}

		}
		System.out.println(sayac + " tane 10 dan buyuk say� girildi");

	}

	public void ikikatiniAl() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> say�lar = new ArrayList<>();
		System.out.println("istediginiz say�lar� giriniz(Bitirmek icin 0 girin)");
		int giris = 1;
		while (giris != 0) {
			giris = al.nextInt();
			if (giris != 0) {
				say�lar.add(giris);
			}
		}

		for (Integer t : say�lar) {

			System.out.println(t * 2);
		}

	}

	public void randomYaslar�bul() {

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
		System.out.println(" tane 13 ile 15 aras�nda say� var");

	}

	public void ayr�ayr�Randombul() {

		java.util.List<Integer> s�n�f�nYaslar� = new ArrayList<>();
		Random rasgele = new Random();
		System.out.println("S�n�f yarat�l�yor..");
		System.out.println("30 kisilik s�n�f�n yaslari");

		for (int i = 0; i < 30; i++) {
			int uretilen = rasgele.nextInt(5);
			uretilen = uretilen + 10;
			s�n�f�nYaslar�.add(uretilen);
			System.out.print(" " + uretilen);
		}
		System.out.println("\n");
		int sayac13 = 0;
		int sayac14 = 0;

		for (Integer t : s�n�f�nYaslar�) {
			if (t == 13) {
				sayac13++;

			}
			if (t == 14) {
				sayac14++;

			}
		}
		System.out.println("Yas� 14 olanlar�n say�s� = " + sayac14);
		System.out.println("Yas� 13 olanlar�n say�s� = " + sayac13);

	}

	public void kareleriniAl() {

		Scanner al = new Scanner(System.in);
		System.out.println("Lutfen 5 adet say� giriniz");
		java.util.List<Integer> bestanesay� = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			System.out.println(i + ".say�");
			bestanesay�.add(al.nextInt());

		}
		for (Integer t : bestanesay�) {

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
		double notortalamas� = (ilkvize * 0.3) + (ikincivize * 0.3) + (finalnot * 0.4);
		System.out.println("Not ortalaman�z = " + notortalamas�);
		if (notortalamas� <= 50) {
			System.out.println("Not ortalaman�z kotu g�z�k�yor.");
		} else if (notortalamas� >= 50 && notortalamas� <= 80) {
			System.out.println("Not ortamalan�z normal goz�k�yor");
		} else if (notortalamas� >= 80) {
			System.out.println("Not ortalaman�z harika g�z�k�yor");

		}
	}

	public void birsay�Oncarp�m() {
		java.util.List<Integer> carp�lacaksay�lar = new ArrayList<>();
		Scanner al = new Scanner(System.in);
		System.out.println("1 adet say� giriniz");
		int sayi1 = al.nextInt();
		System.out.println("10 adet say� giriniz");
		for (int i = 0; i < 10; i++) {
			carp�lacaksay�lar.add(al.nextInt());

		}
		for (Integer t : carp�lacaksay�lar) {
			System.out.println(sayi1 * t);
		}

	}

	public void bestenBuyukmu() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> say�lar = new ArrayList<>();
		System.out.println("10 Tane say� giriniz");
		for (int i = 0; i < 10; i++) {

			say�lar.add(al.nextInt());

		}

		for (Integer t : say�lar) {
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
		System.out.println("Al�nacak toplam komisyon bedeli = " + toplamkomisyon);
	}

	public void cemberHesab�() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> capuzunluklar� = new ArrayList<>();
		System.out.println("5 adet cember yar�cap� giriniz");

		for (int i = 0; i < 5; i++) {
			capuzunluklar�.add(al.nextInt());

		}
		for (Integer t : capuzunluklar�) {
			System.out.println("Yar� cap� " + t + " olan bir cemberin alan� " + (t * t * Math.PI) + "'dir");

			System.out.println("Yar� cap� " + t + " olan bir cemberin cevresi " + (t * 2 * Math.PI) + "'dir");
		}
	}

	public void notBuyukkucuk() {
		Scanner al = new Scanner(System.in);
		java.util.List<Integer> notlistesi = new ArrayList<>();
		System.out.println("Kac tane not gireceksiniz");
		int notsay�s� = al.nextInt();
		System.out.println("Lutfen notlar� giriniz");
		for (int i = 0; i < notsay�s�; i++) {
			notlistesi.add(al.nextInt());

		}

		notlistesi.sort(null);
		System.out.println("Girdiginiz en y�ksek not = " + notlistesi.get(notsay�s� - 1));
		System.out.println("Girdiginiz en d�s�k not = " + notlistesi.get(0));

	}

	public void saatYap() {
		System.out.println("Saati basl�yor");
		Scanner al = new Scanner(System.in);

		for (int i = 0; i < 24; i++) {
			for (int j = 0; j < 60; j++) {
				for (int j2 = 0; j2 < 60; j2++) {
					System.out.println(+i + "." + j + "." + j2);

				}

			}

		}

	}

	public void notlar�Besliktabandayazma() {
		System.out.println("Kac adet not gireceksiniz");
		Scanner al = new Scanner(System.in);
		int notSay�s� = al.nextInt();

		java.util.List<Integer> notliste = new ArrayList<>();

		for (int i = 0; i < notSay�s�; i++) {
			System.out.println("Not Giriniz");
			notliste.add(al.nextInt());

		}
		for (Integer t : notliste) {
			if (t <= 45) {
				System.out.println("Girilen " + t + " notu zay�ft�r ve not kars�l�g� 1 dir");
			} else if (t > 45 && t <= 55) {
				System.out.println("Girilen " + t + " notu vasatt�r ve not kars�l�g� 2 dir");
			} else if (t > 55 && t <= 69) {
				System.out.println("Girilen " + t + " notu ortadir ve not kars�l�g� 3 dur");
			} else if (t > 69 && t <= 84) {
				System.out.println("Girilen " + t + " notu iyidir ve not kars�l�g� 4 t�r");

			} else if (t > 84) {
				System.out.println("Girilen " + t + " notu pekiyidir ve not kars�l�g� 5 tir");

			}
		}
	}

	public void ayNumaras�() {
		Scanner al = new Scanner(System.in);
		System.out.println("Bir ay numaras� giriniz");
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
			System.out.println("Girdiginiz ay may�st�r");
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
			System.out.println("Girdiginiz ay eyl�ld�r");
			break;
		case 10:
			System.out.println("Girdiginiz ay ekimdir");
			break;
		case 11:
			System.out.println("Girdiginiz ay kas�mdir");
			break;
		case 12:
			System.out.println("Girdiginiz ay aral�kt�r");
			break;

		default:
			break;
		}

	}

	public void haftan�nKac�nc�gunu() {
		Scanner al = new Scanner(System.in);
		String[] gunler = { "pazartesi", "sal�", "carsamba", "persembe", "cuma", "cumartesi", "pazar" };
		System.out.println("Bir g�n yaz�n�z(�r:pazartesi)");
		String gun = al.nextLine();
		for (int i = 0; i < gunler.length; i++) {
			if (gun.equals(gunler[i])) {
				System.out.println("Haftan�n " + (i + 1) + "inci g�n�");
			}

		}

	}

	public void kdvToplamhesab�() {
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

	public void sark�Suresi() {
		Scanner al = new Scanner(System.in);
		System.out.println("5 adet sark� s�resini dakika olarak giriniz");
		java.util.List<Integer> sark�dakika = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			System.out.println((+i + 1) + " inci sark� icin dakika giriniz");
			sark�dakika.add(al.nextInt());

		}
		double toplamdakika = 0;

		for (Integer t : sark�dakika) {
			toplamdakika += t;
		}

		System.out.println("Girilen sark�lar toplam " + toplamdakika / 60 + " saat eder");

	}

	public void islemYap() {
		Scanner al = new Scanner(System.in);

		System.out.println("------------ISLEM MENUSU---------------");
		System.out.println("+ -----> toplama");
		System.out.println("- -----> c�karma");
		System.out.println("* -----> carpma");
		System.out.println("/ -----> bolme");
		System.out.println("---------------------------------------");
		System.out.println("Lutfen yapmak istediginiz islemi secin");
		String islem = al.nextLine();

		System.out.println("Islem yapacag�n�z say�lar� giriniz");
		System.out.print("Say� 1 :\n");
		int sayi1 = al.nextInt();
		System.out.print("Say� 2 :\n");
		int sayi2 = al.nextInt();

		if (islem.equals("+")) {
			System.out.println(sayi1 + " ile " + sayi2 + " nin toplam� " + (sayi1 + sayi2) + "'dir");

		} else if (islem.equals("-")) {
			System.out.println(sayi1 + " ile " + sayi2 + " nin farki " + (sayi1 - sayi2) + "'dir");

		} else if (islem.equals("*")) {
			System.out.println(sayi1 + " ile " + sayi2 + " nin carp�m� " + (sayi1 * sayi2) + "'dir");

		} else if (islem.equals("/")) {
			System.out.println(sayi1 + " ile " + sayi2 + " nin bolumu " + (sayi1 / sayi2) + "'dir");

		}
	}

	public void say�y�Yaz�yacevir() {
		Scanner al = new Scanner(System.in);
		System.out.println("Yaz�ya cevirilecek sayiyi giriniz");
		int sayi = al.nextInt();

		int birler = (sayi % 10);
		int onlar = ((sayi / 10) % 10);
		int yuzler = ((sayi / 100) % 10);
		int binler = ((sayi / 1000) % 10);
		int onBinler = ((sayi / 10000) % 10);
		int yuzBinler = ((sayi / 100000) % 10);
		int milyon = ((sayi / 1000000) % 10);
		int milyar = ((sayi / 10000000) % 10);

		String[] birBas = { "", "Bir", "�ki", "��", "D�rt", "Be�", "Alt�", "Yedi", "Sekiz", "Dokuz" };
		String[] onBas = { "", "On", "Yirmi", "Otuz", "K�rk", "Elli", "Altm��", "Yetmi�", "Seksen", "Doksan" };
		String[] yuzBas = { "", "Y�z", "�kiy�z", "��y�z", "D�rty�z", "Be�y�z", "Alt�y�z", "Yediy�z", "Sekizy�z",
				"Dokuzy�z" };
		String[] binBas = { "", "Bin", "�kibin", "��bin", "D�rtbin", "Be�bin", "Alt�bin", "Yedibin", "Sekizbin",
				"Dokuzbin" };
		String[] milyonBas = { "", "BirMilyon", "�kiMilyon", "��Milyon", "D�rtMilyon", "Be�Milyon", "Alt�Milyon",
				"YediMilyon", "SekizMilyon", "DokuzMilyon" };
		String[] milyarBas = { "", "BirMilyar", "�kiMilyar", "UcMilyar", "DortMilyar", "BesMilyar", "Alt�Milyar",
				"YediMilyar", "SekizMilyar", "DokuzMilyar" };
		System.out.println(milyarBas[milyar] + "" + milyonBas[milyon] + " " + yuzBas[yuzBinler] + " " + onBas[onBinler]
				+ " " + binBas[binler] + " " + yuzBas[yuzler] + " " + onBas[onlar] + " " + birBas[birler]);
		System.out.println("");

	}

	public void tcKimlikdogrulama() {
		System.out.println("L�tfen kontrol icin Tc kimlik no giriniz:");
		Scanner al = new Scanner(System.in);

		String tcno = al.nextLine();

		System.out.println("Girilen " + tcno + " say�s� dogrulan�yor..");

		int uzunluk = tcno.length();

		if (uzunluk != 11) {
			System.out.println("Tc Kimlik hatal�d�r");
		} else {
			System.out.println("Uzunluk kontrolu basarili!");
		}
		boolean s�f�rm� = tcno.startsWith("0");
		if (s�f�rm� == true) {
			System.out.println("Tc Kimlik hatal�d�r");
		} else {
			System.out.println("�lk rakam kontrolu basarili!");
		}

		int hane[] = new int[11];
		int sonrakam = 0;
		for (int i = 0; i < 11; i++) {
			hane[i] = Integer.parseInt(String.valueOf(tcno.charAt(i)));
			sonrakam = hane[i];
		}
		// System.out.println(hane[2]);
		// System.out.println(sonrakam);
		int hatasayac� = 0;
		if (sonrakam % 2 != 0) {
			System.out.println("Tc kimlik hatal�d�r(son rakam� cift degil)");
			hatasayac�++;

		} else
			System.out.println("Son rakam konrtolu basarili!");

		if (((hane[0] + hane[2] + hane[4] + hane[6] + hane[8]) * 7 + (hane[1] + hane[3] + hane[5] + hane[7]) * 9)
				% 10 != hane[9]) {
			System.out.println("1.esitlik konrol� basarisiz.Hatal� TC Kimlik numaras�");
			hatasayac�++;
		} else {
			System.out.println("1.esitlik kontrol� basarili!");
		}

		if (((hane[0] + hane[2] + hane[4] + hane[6] + hane[8]) * 8) % 10 != hane[10]) {
			System.out.println("2.esitlik kontrol� basarisiz.Hatal� TC Kimlik numaras�");
			hatasayac�++;

		} else {
			System.out.println("2.esitlik kontrol� basarili!");
		}
		if (hatasayac� == 0) {
			System.out.println("Tebrikler TC Kimlik dogrulandi!");
		} else {
			System.out.println(
					hatasayac� + " tane hata bulunmaktadir,girdiginiz numara bir tc kimlik numarasi degildir.");
		}

	}

	public void ucgenCiz() {
		Scanner al = new Scanner(System.in);
		int kenarlar[] = new int[4];
		int hataoku = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("�cgenin " + i + ".kenarini giriniz");
			kenarlar[i] = al.nextInt();

		}

		if ((kenarlar[1] + kenarlar[2]) > kenarlar[0] && (kenarlar[1] - kenarlar[2]) < kenarlar[0]
				|| (kenarlar[0] + kenarlar[2]) > kenarlar[1] && (kenarlar[0] - kenarlar[2]) < kenarlar[2]
				|| (kenarlar[0] + kenarlar[1]) > kenarlar[2] && (kenarlar[0] - kenarlar[1]) < kenarlar[2]) {
			System.out.println("Bu ucgen cizim kurallar�na uyuyor");

		} else {
			System.out.println("Bu ucgen cizilemez");
			hataoku++;
		}

		if (kenarlar[0] == kenarlar[1] && kenarlar[0] == kenarlar[2] && kenarlar[1] == kenarlar[2]) {
			System.out.println("Bu bir eskanar �cgendir.");
		} else if (kenarlar[0] == kenarlar[1] || kenarlar[0] == kenarlar[2] && kenarlar[1] == kenarlar[2]) {
			System.out.println("Bu bir ikizkenar �cgendir.");
		} else if (kenarlar[0] != kenarlar[1] && kenarlar[0] != kenarlar[2] && kenarlar[1] != kenarlar[2]) {
			System.out.println("Bu bir cesitkenar �cgendir");

		} else {
			System.out.println("Bu ucgen cizilemez");
			hataoku++;

		}
		if (hataoku == 0) {

			System.out.println("Cizilen ucgenin cevresi" + (kenarlar[0] + kenarlar[1] + kenarlar[2]));
			System.out.println("Cizilen ucgenin alan� " + (kenarlar[0] * kenarlar[1] / 2));

		}

	}
}
