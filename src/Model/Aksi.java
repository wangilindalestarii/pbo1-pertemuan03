package Model;

import java.util.Scanner;

public class Aksi {
    public static void main(String[] args) {
        Mahasiswa fulan = new Mahasiswa();
        fulan.npm   = "19875623";
        fulan.nama  = "fulan bin pulan";
        fulan.jumlahSKS = 100;
        fulan.ipk   = 3.11;
        fulan.tampilkanInfo();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm   = "19875623";
        mahasiswa.nama  = "fulan bin pulan";
        mahasiswa.tampilkanInfo();

        Scanner inputan = new Scanner(System.in);
        fulan.nama = inputan.nextLine();
    }
}
