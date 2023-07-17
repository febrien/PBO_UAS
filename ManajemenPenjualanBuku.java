/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
import java.util.Scanner;

// Kelas Buku
class Buku {
    private String judul;
    private String jenis;
    private double harga;
    
    // Konstruktor
   public Buku(String judul, String jenis, double harga) {
       this.judul = judul;
       this.jenis = jenis;
       this.harga = harga;
   }
   
   // Getter dan Setter
   public String getJudul() {
       return judul;    
   }
   
   public void setJudul(String judul) {
       this.judul = judul;
   }
   
   public String getJenis() {
       return jenis;
   }
   
   public void setJenis(String jenis) {
       this.jenis = jenis;
   }
   
   public double getHarga() {
       return harga;
   }
   
   public void setHarga(double harga) {
       this.harga = harga;
   }
}

// Kelas BukuFiksi extends Buku
class BukuFiksi extends Buku {
    public BukuFiksi(String judul, String jenis, double harga) {
        super(judul, jenis, harga);
    }
}

// Kelas BukuNonFiksi extends Buku
class BukuNonFiksi extends Buku {
    public BukuNonFiksi(String judul, String jenis, double harga) {
        super(judul, jenis,  harga);
    }
}

// Kelas Majalah extends Buku
class Majalah extends Buku {
    private int nomoredis;
    
    public Majalah(String judul, String jenis, double harga, int nomoredis) {
        super(judul, jenis, harga);
        this.nomoredis = nomoredis;
    }
    
    public int getNomoredis() {
        return nomoredis;
    }
    
    public void setNomoredis(int nomoor) {
        this.nomoredis = nomoredis;
    }
}

public class ManajemenPenjualanBuku {
    private int stokBukuFiksi;
    private int stokBukuNonFiksi;
    private int stokMajalah;
    private double keuangan;
    
    public ManajemenPenjualanBuku() {
        stokBukuFiksi = 0;
        stokBukuNonFiksi = 0;
        stokMajalah = 0;
        keuangan = 0.0;
    }
    
    public void jualBukuFiksi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan harga jual buku fiksi: ");
        double hargaJual = scanner.nextDouble();
        
        if (stokBukuFiksi > 0) {
            stokBukuFiksi--;
            keuangan += hargaJual;
            System.out.println("Buku Fiksi terjual dengan harga: " + hargaJual);
        } else {
            System.out.println("stok Buku Fiksi kosong. Tidak laku menjual Buku fiksi. ");
        }
    }
    
    public void jualBukuNonFiksi() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan harga jual buku non fiksi: ");
        double hargaJual = scanner.nextDouble();
        
        if  (stokBukuNonFiksi > 0) {
            stokBukuNonFiksi--;
            keuangan += hargaJual;
            System.out.println("Buku Non Fiksi terjual dengan harga: " + hargaJual);
        } else {
            System.out.println("Buku Non Fiksi kosong. Tidak laku menjual Buku Nono Fiksi.");
        }
    }
    
    public void jualBukuMajalah () {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan harga jual buku majalah: ");
        double hargaJual = scanner.nextDouble();
        
        if (stokMajalah > 0) {
            stokMajalah--;
            keuangan += hargaJual;
            System.out.println("Buku Majalah terjual dengan harga: " + hargaJual);
        } else {
            System.out.println("Buku Majalah kosong. Tidaklaku menjual Buku Majalah. ");
        }
    }
    
    public void beliBukuFiksi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan harga beli buku fiksi: ");
        double hargaBeli = scanner.nextDouble();
        
            stokBukuFiksi++;
            keuangan -= hargaBeli;
            System.out.println("Buku Fiksi terbeli dengan harga: " + hargaBeli);
        
    }
    
    public void beliBukuNonFiksi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan harga beli buku non fiksi: ");
        double hargaBeli = scanner.nextDouble();
        
            stokBukuFiksi++;
            keuangan -= hargaBeli;
            System.out.println("Buku Non Fiksi terbeli dengan harga: " + hargaBeli);
    }
    
    public void beliMajalah() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan harga beli Majalah: ");
        double hargaBeli = scanner.nextDouble();
        
            stokBukuFiksi++;
            keuangan -= hargaBeli;
            System.out.println("Majalah terbeli dengan harga: " + hargaBeli);
    }
    
    public void lihatStok() {
        System.out.println("Stok buku fiksi: " + stokBukuFiksi);
        System.out.println("Stok buku non fiksi: " + stokBukuNonFiksi);
        System.out.println("Stok Majalah: " + stokMajalah);
    }
    
    public void lihatLaporanKeuangan() {
        System.out.println("Keuangan: " + keuangan);
    }
    
    public static void main(String[] args) {
        ManajemenPenjualanBuku manajemen = new ManajemenPenjualanBuku();
        Scanner scanner = new Scanner(System.in);
        String pilihan;
        
        do {
            System.out.println("========== Menu ==========");
            System.out.println("1. Jual buku fiksi");
            System.out.println("2. Jual beli non fiksi");
            System.out.println("3. Jual majalah");
            System.out.println("4. Beli buku fiksi");
            System.out.println("5. Beli buku non fiksi");
            System.out.println("6. Beli majalah");
            System.out.println("7. lihat stok");
            System.out.println("8. Lihat laporan keuangan");
            System.out.println("9. Exit");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextLine();
            
            switch (pilihan) {
                case "1":
                    manajemen.jualBukuFiksi();
                    break;
                case "2":
                    manajemen.jualBukuNonFiksi();
                    break;
                case "3":
                    manajemen.jualBukuMajalah();
                    break;
                case "4":
                    manajemen.beliBukuFiksi();
                    break;
                case "5":
                    manajemen.beliBukuNonFiksi();
                    break;
                case "6":
                    manajemen.beliMajalah();
                    break;
                case "7":
                    manajemen.lihatStok();
                    break;
                case "8":
                    manajemen.lihatLaporanKeuangan();
                    break;
                case "9":
                    System.out.println("Projek selesai.");
                    break;
                default:
                    System.out.println("Tidak sesuai pilihan.");
                    break;
            }
            
            System.out.println();
        } while (!pilihan.equals("9"));
    }
    
}
    
