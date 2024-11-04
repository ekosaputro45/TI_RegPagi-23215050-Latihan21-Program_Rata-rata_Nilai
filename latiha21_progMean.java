
package pertemuan6;

import java.util.Scanner;

public class latiha21_progMean {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        
        // Inisialisasi variabel untuk menyimpan total nilai
        double totalNilai = 0;
        
        // Loop untuk meminta nilai tiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = scanner.nextDouble();
            totalNilai += nilai;
        }
        
        // Menghitung rata-rata nilai
        double rataRata = totalNilai / jumlahMahasiswa;
        
        // Menampilkan hasil
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by: Nama Anda");  // Ganti dengan nama Anda
        
        scanner.close();
    }

}
