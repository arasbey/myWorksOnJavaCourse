package com.vektorel.javaexample;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class algoritma {

	public static void main(String[] args) {

		algoritma algoritmalar = new algoritma();

		algoritmalar.deneme();
		algoritmalar.notlar�Besliktabandayazma();

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

	private void saatYap() {
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

	private void notlar�Besliktabandayazma() {
		System.out.println("Kac adet not gireceksiniz");
		Scanner al = new Scanner(System.in);
		int notSay�s� = al.nextInt();

		java.util.List<Integer> notliste = new ArrayList<>();

		for (int i = 0; i < notSay�s�; i++) {
			System.out.println("Not Giriniz");
			notliste.add(al.nextInt());
			
		}
		for (Integer t : notliste) {
			if(t<=45){
				System.out.println("Girilen "+t+" notu zay�ft�r ve not kars�l�g� 1 dir");
			}
				else if (t>45 && t<=55){
					System.out.println("Girilen "+t+" notu vasatt�r ve not kars�l�g� 2 dir");
			}
				else if(t>55 && t<=69){
					System.out.println("Girilen "+t+" notu ortadir ve not kars�l�g� 3 dur");
				}
				else if(t>69 && t<=84){
					System.out.println("Girilen "+t+" notu iyidir ve not kars�l�g� 4 t�r");

				}
				else if(t>84){
					System.out.println("Girilen "+t+" notu pekiyidir ve not kars�l�g� 5 tir");

				}
		}		
	}

}
