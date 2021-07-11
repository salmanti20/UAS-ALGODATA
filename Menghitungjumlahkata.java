/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.util.Scanner;
 
class StringHitung {
    private static final int JUMLAH_KARAKTER = 256;
    private static int[] total_per_karakter = new int[JUMLAH_KARAKTER];
 
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
 
        System.out.print("\nMasukan kalimat atau string : ");
        String kata = s.nextLine();
        kata = kata.toLowerCase();
 
        // inisialisasikan setiap karakter berjumlah 0 buah
        for (int i=0; i<JUMLAH_KARAKTER; i++) {
            total_per_karakter[i] = 0;
        }
  int jumlahKata = 0;
        int i = 0;
        while (i < kata.length()) {
            // abaikan spasi pada awal string dan spasi lebih dari satu
            while (i < kata.length() && kata.charAt(i) == ' ') i++; 
 
            if (i < kata.length() && kata.charAt(i) != ' ') {
                jumlahKata++;
                while (i < kata.length() && kata.charAt(i) != ' ') i++;
            }
        }
 
        System.out.println("\nJumlah Kata : " + jumlahKata + " buah");
    }
}