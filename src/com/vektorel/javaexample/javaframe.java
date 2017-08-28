package com.vektorel.javaexample;

import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class javaframe {
	
	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null,"Hosgeldiniz devam etmek icin ok'a basin","Kullanici Algoritma Programý",-1,2);
		String isim=JOptionPane.showInputDialog(null,"Programa Hosgeldiniz,lütfen adinizi girin:");
		if(isim.equals("taner")){
			JOptionPane.showConfirmDialog(null,"Taner Hocam kullanici algoritma programýna hosgeldiniz.!","@@@@@@@",-1,2);
			
		}else
			
		JOptionPane.showConfirmDialog(null, "Sayin "+isim+" kullanici algoritma programina hosgeldiniz!\n  Devam etmek icin OK ' a basin!","!!!!!!!!!!!!!!!!!!!!!!",-1,2);
		
	}

	 
	
	
}
