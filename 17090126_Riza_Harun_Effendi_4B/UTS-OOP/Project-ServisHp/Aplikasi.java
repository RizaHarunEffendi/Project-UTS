import entity.*;
import service.*;
import java.util.*;

public class Aplikasi {

    private static ServiceHp service;
    private static Scanner scanner;

    public static void main(String[] args) {
        service = new ServiceHp();

        int opsi = 5;
        do {
            cetakMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            } catch(Exception e) {
                System.err.println("Cek Kembali Inputannya");
                opsi = 0;
            }
            prosesMenu(opsi);
        } while(opsi != 5);
    }

    private static void prosesMenu(int opsi) {
        switch(opsi) {
            case 1:
                formTambahData();
                break;
            case 2:
                formUbahData();
                break;
            case 3:
                formHapusData();
                break;
            case 4:
                service.cetakData();
                break;
            case 5:
                System.out.println("Terima Kasih Telah Menggunakan");
                System.out.println("Aplikasi Kami.");
        }
    }

    private static void formHapusData() {
        System.out.println("\n---Form Hapus Data---");
        scanner = new Scanner(System.in);
        System.out.print("No Urut : ");
        String no = scanner.nextLine();
        service.hapusData(no);
    }

    private static void formUbahData() {
        String no, nama, alamat, merk_hp, krs, biaya;
        System.out.println("\n---Form Ubah Data---");
        scanner = new Scanner(System.in);
        System.out.print("No Urut : ");
        no = scanner.nextLine();
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Alamat : ");
        alamat = scanner.nextLine();
        System.out.print("Merk Hp : ");
        merk_hp = scanner.nextLine();
        System.out.print("Kerusakan : ");
        krs = scanner.nextLine();
        System.out.print("Biaya : ");
        biaya = scanner.nextLine();
        service.ubahData(new Hp(no, nama, alamat,
                merk_hp, krs, biaya));
    }

    private static void formTambahData() {
        String no, nama, alamat, merk_hp, krs,biaya;
        System.out.println("\n---Form Tambah Data---");
        scanner = new Scanner(System.in);
        System.out.print("No Urut : ");
        no = scanner.nextLine();
        System.out.print("Nama : ");
        nama = scanner.nextLine();
        System.out.print("Alamat : ");
        alamat = scanner.nextLine();
        System.out.print("Merk Hp : ");
        merk_hp = scanner.nextLine();
        System.out.print("Kerusakan : ");
        krs = scanner.nextLine();
        System.out.print("Biaya : ");
        biaya = scanner.nextLine();
        service.tambahData(new Hp(no,nama,alamat,
                merk_hp,krs,biaya));
    }

    private static void cetakMenu() {
        System.out.println("---- Aplikasi Servis HP ----");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("-------------------------------");
        System.out.print  (" Masukan Pilihan => ");
    }

}