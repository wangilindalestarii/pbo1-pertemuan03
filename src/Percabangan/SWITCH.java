package Percabangan;

public class SWITCH{
    public static void main(String [] args) {
        int nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs     :\"Terimakasih Pak\"");
                System.out.println("Dosen   :\"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs     :\"Kenapa ulun kada dapat A,pak?\"");
                System.out.println("Dosen   :\"!@#$%\"");
                break;
            case 'C':
                System.out.println("Mhs     :\"Ulun turun pul Pak ai, tugas pil jua\"");
                System.out.println("Dosen   :\"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs     :\"Hihihi..\"");
                break;
            default:
                System.out.println("Mhs     :\"Ulun turun pul Pak ai, tugas pil jua\"");
                System.out.println("Dosen   :\"Bujur jua kah?\"");
                System.out.println("Dosen   :\"*memeriksa berkas\"");
                System.out.println("Dosen   :\"*menceleng\"");
                System.out.println("Mhs     :\"Kabur..\"");
                break;
        }
    }
}