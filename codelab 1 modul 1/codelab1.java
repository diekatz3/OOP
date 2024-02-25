import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class codelab1{
    public static void main (String[] args){
        Scanner Scanner = new Scanner (System.in);

        //input nama
        System.out.print("masukkan nama anda: ");
        String name = Scanner.nextLine();

        //input jenis kelamin
        System.out.print("masukan jenis kelamin (P/L)");
        char jeniskelamin = Scanner.next().charAt(0);
        String jeniskelaminstr = (jeniskelamin == 'p' || jeniskelamin == 'P') ? "perempuan": "laki-laki";

        //input tanggal lahir
        System.out.print("masukan tanggal lahir (yyyy-mm-dd)");
        String tanggallahirstr = Scanner.next();
        LocalDate tanggallahir = LocalDate.parse(tanggallahirstr);

        //operasi hitung umur
        LocalDate sekarang = LocalDate.now();
        Period selisih = Period.between(tanggallahir, sekarang);
        int tahun = selisih.getYears();
        int bulan = selisih.getMonths();

        //output
        System.out.println("nama: " + name);
        System.out.println("Jenis Kelamin: " + jeniskelaminstr);
        System.out.printf("umur: %d tahun %d bulan", tahun, bulan);
    }
}