package Model;

public class Mahasiswa {
    public String npm;
    public String nama;
    public int jumlahSKS;
    public double ipk;

    public void mengambilKRS(){}
    public void cetakKRS(){}

    public void tampilkanInfo(){
        System.out.println("======================================");
        System.out.println("NPM :" +npm);
        System.out.println("Nama :" + nama);
        System.out.println("Jumlah SKS :" + jumlahSKS);
        System.out.println("IPK :" + ipk);
    }
}
