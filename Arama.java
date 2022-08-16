/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arama;

import java.util.Scanner;

/**
 *
 * @author Tarık BALCI
 */
public class Arama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		String [] dizi = {"mehmet","feyza","berna","kemal","funda","huseyin","baris","selcuk","tarik","mehmet"};
		System.out.println("Dizinin boyutu : " + dizi.length);
		
		String aranan;
		System.out.println("Aradiginiz kelime : ");
		aranan = scan.nextLine();
		int tekrar=0;
		boolean sonuc = false;
		
		for(int i = 0; i<dizi.length; i++)
		{
		    if(aranan.equals(dizi[i]))
		    {
		         sonuc=true;
		         
                        tekrar=tekrar+1;
		         
                        
		    }
		}
                 if(tekrar==0)
                     System.out.println(aranan+" kelimesi dizide yok" );
		if(sonuc)
		    System.out.println(aranan+" kelimesi dizide var" );
                System.out.println("Dizide Tekrar Edilme Sayısı : " + tekrar);
		    
	}
    
    
}

