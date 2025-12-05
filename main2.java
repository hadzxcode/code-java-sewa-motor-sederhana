/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SewaMotor;
import java.util.Scanner;
/**
 *
 * @author jhdalqdsii
 */
public class main2 {
    public static void sewa(String motor, int waktu){
      String[] namaMotor = {"beat", "vario", "supra", "crf", "cbr"};
        int[] hargaPerJam = {20, 30, 20, 35, 30}; 
        
        
        String motorPilihan = "";
        int hargaMotor = 0; 
        
        boolean motorDitemukan = false;
        
        while (!motorDitemukan) {
            System.out.print("\nPilih motor yang ingin disewa (contoh: vario): ");
            motorPilihan = motor;
            
            
            for (int i = 0; i < namaMotor.length; i++) {
                if (motorPilihan.equals(namaMotor[i])) {
                    hargaMotor = hargaPerJam[i]; 
                    motorDitemukan = true; 
                    break; 
                }
            }
            
            if (!motorDitemukan) {
                System.out.println("Motor '" + motorPilihan + "' tidak ditemukan. Silakan pilih lagi.");
            }
        }
        
        System.out.println("\nAnda memilih motor **" + motorPilihan + "** dengan harga **" + hargaMotor + "k / jam**.");

     
        System.out.print("Masukkan lama waktu sewa (dalam jam): ");
        int lamaSewaJam = waktu;
        
        
        double totalHarga = lamaSewaJam * hargaMotor * 1000.0; 
        double diskon = 0;
        
        
        if (lamaSewaJam >= 48) {
            diskon = totalHarga * 0.10; 
            totalHarga = totalHarga - diskon;
            System.out.println("Selamat! Anda menyewa selama " + lamaSewaJam + " jam (>= 48 jam). Anda mendapatkan **Diskon 10%**!");
        } else {
            System.out.println("Waktu sewa Anda " + lamaSewaJam + " jam. Diskon tidak berlaku.");
        }
        
        
        System.out.println("------------------------------------");
        System.out.println("Rincian Biaya Sewa:");
        System.out.println("  Harga Sewa per Jam  : Rp " + (int)(hargaMotor * 1000.0));
        System.out.println("  Lama Sewa           : " + lamaSewaJam + " jam");
        System.out.println("  Diskon yang Didapat : Rp " + (int)diskon);
        System.out.println("------------------------------------");
        System.out.println("Total yang Harus Dibayar : **Rp " + (int)totalHarga);
        System.out.println("------------------------------------");
        
          
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        LIST MOTOR YANG TERSEDIA
        
        String[] namaMotor = {"beat", "vario", "supra", "crf", "cbr"};
        int[] hargaPerJam = {20, 30, 20, 35, 30}; 
        
        System.out.println("=== Daftar Motor yang Tersedia ===");
        for (int i = 0; i < namaMotor.length; i++) {
            System.out.println("- " + namaMotor[i] + " = " + hargaPerJam[i] + "k / jam");
        }
        System.out.println("==================================");
        
        
//       INPUT NAMA MOTOR DAN WAKTU SEWA 
        System.out.print("Nama Motor, contoh(beat) : ");
        String inputNamaMotor = input.nextLine();
        System.out.print("lama Sewa, contoh(2) : ");
        int inputLamaWaktuSewa = input.nextInt();
        
        
        sewa(inputNamaMotor, inputLamaWaktuSewa);
    }
}
