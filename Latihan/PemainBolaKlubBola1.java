package Pratikum_PBO_3;

public class PemainBolaKlubBola1 {
    public static void main(String []args){
        PemainBola1 p1 = new PemainBola1("David","Jl.Umban Sari");
        KlubBola1 klub1 = new KlubBola1("MU",p1);

        System.out.println("Nama Klub : "+klub1.namaKlub);
        System.out.println("Nama Pemain : "+klub1.pemain.nama);
        System.out.println("Nama Pemain : "+klub1.pemain.alamat);

        KlubBola1 klub2 = new KlubBola1("Chelsea");
        klub2.setPemain("George", "Jl.Paus");
        System.out.println();
        System.out.println("Nama Klub : "+klub2.namaKlub);
        System.out.println("Nama Pemain : "+klub2.pemain.nama);
        System.out.println("Nama Pemain : "+klub2.pemain.alamat);
    }
}
