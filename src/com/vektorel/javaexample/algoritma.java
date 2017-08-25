package com.vektorel.javaexample;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class algoritma {

	public static void main(String[] args) {

		algoritma algoritmalar = new algoritma();

		algoritmalar.deneme();
		algoritmalar.notlarýBesliktabandayazma();

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

	private void saatYap() {
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

	private void notlarýBesliktabandayazma() {
		System.out.println("Kac adet not gireceksiniz");
		Scanner al = new Scanner(System.in);
		int notSayýsý = al.nextInt();

		java.util.List<Integer> notliste = new ArrayList<>();

		for (int i = 0; i < notSayýsý; i++) {
			System.out.println("Not Giriniz");
			notliste.add(al.nextInt());
			
		}
		for (Integer t : notliste) {
			if(t<=45){
				System.out.println("Girilen "+t+" notu zayýftýr ve not karsýlýgý 1 dir");
			}
				else if (t>45 && t<=55){
					System.out.println("Girilen "+t+" notu vasattýr ve not karsýlýgý 2 dir");
			}
				else if(t>55 && t<=69){
					System.out.println("Girilen "+t+" notu ortadir ve not karsýlýgý 3 dur");
				}
				else if(t>69 && t<=84){
					System.out.println("Girilen "+t+" notu iyidir ve not karsýlýgý 4 tür");

				}
				else if(t>84){
					System.out.println("Girilen "+t+" notu pekiyidir ve not karsýlýgý 5 tir");

				}
		}		
	}

}
