package Model;

import java.util.ArrayList;

public class Mahasiswa {
    public String npm;
    public String nama;
    public int jumlahSKS;
    public double ipk;

    public void mengambilKRS(){}
    public void cetakKRS(){}
    public void updateIdentitas(){}

    public void tampilkanInfo() {
        System.out.println("======================================");
        System.out.println("NPM :" + npm);
        System.out.println("Nama :" + nama);
        System.out.println("Jumlah SKS :" + jumlahSKS);
        System.out.println("IPK :" + ipk);
    }

    public boolean create(){
        String insertSQL = "INSERT INTO mahasiswa VALUES ("+npm+","+nama+","+jumlahSKS+","+ipk+")";
        System.out.println(insertSQL);
        boolean berhasil = true;
        if (berhasil) {
            return true;
        }else {
            return false;
        }
    }
    public ArrayList<Mahasiswa> read(){
        return null;
    }
    public Boolean update(){
        return false;
    }

    public boolean delete(){
        return false;
    }
}
