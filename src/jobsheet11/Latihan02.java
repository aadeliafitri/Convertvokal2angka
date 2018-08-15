/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;
import java.util.Scanner;
public class Latihan02 {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    public static void main(String[] args) {
        String identitas = "Adelia Fitri Kristanti / XRPL2 / 02";
        
        tampilJudul(identitas);
        String kalimat = tampilInput();
        String convert = vocal2Angka(kalimat);
        tampilPerKata(kalimat, convert);
        tampilHasil(convert);
    }
    private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
    }
    private static String vocal2Angka(String kalimat) {
        char[][] arConvert = 
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i=0;i<arConvert.length;i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        
        return kalimat;
    }
     private static void tampilPerKata(String kalimat, String convert) {
         String[] arrKal = kalimat.split(" ");
         String[] arrCon = kalimat.split(" ");
         
         for(int i=0;i<arrKal.length;i++)
             System.out.println(arrKal[i]+" => "+arrCon[i]);
     }
     private static void tampilHasil(String convert) {
         System.out.println("Kalimat Alay Angka : " + convert);
     }
}
