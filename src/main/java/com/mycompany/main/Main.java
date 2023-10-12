package com.mycompany.main;
import Kejuaraan.Data;
import java.util.ArrayList;
import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        final ArrayList<Data> daftarKejuaraan = new ArrayList<>();
        final Scanner keyboard = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("MENU");
            System.out.println("1. Tambah Data Kejuaraan");
            System.out.println("2. Lihat Data Kejuaraan");
            System.out.println("3. Update Data Kejuaraan");
            System.out.println("4. Hapus Data Kejuaraan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = keyboard.nextInt();

            if (pilihan == 1) {
                tambahDataKejuaraan(daftarKejuaraan, keyboard);
            } else if (pilihan == 2) {
                tampilDataKejuaraan(daftarKejuaraan);
            } else if (pilihan == 3) {
                updateDataKejuaraan(daftarKejuaraan, keyboard);
            } else if (pilihan == 4) {
                hapusDataKejuaraan(daftarKejuaraan, keyboard);
            } else
                System.out.println("MENU TIDAK TERSEDIA!");
            
        } while (pilihan != 0);

        System.out.println("Program selesai.");
    }

    public static void tambahDataKejuaraan(final ArrayList<Data> daftarKejuaraan, final Scanner keyboard) {
        System.out.print("Nama Kejuaraan: ");
        final String nama = keyboard.nextLine();
        System.out.print("Lokasi: ");
        final String lokasi = keyboard.nextLine();
        System.out.print("Cabang Olahraga: ");
        final String cabang = keyboard.nextLine();

        final Data kejuaraan = new Data(nama, lokasi, cabang);
        daftarKejuaraan.add(kejuaraan);

        System.out.println("Data Kejuaraan berhasil ditambahkan!");
    }

    public static final void tampilDataKejuaraan(final ArrayList<Data> daftarKejuaraan) {
        System.out.println("DATA KEJUARAAN");
        for (int i = 0; i < daftarKejuaraan.size(); i++) {
            final Data k = daftarKejuaraan.get(i);
            System.out.println("[" + (i + 1) + "]");
            System.out.println("Nama Kejuaraan: " + k.getNamaKejuaraan());
            System.out.println("Lokasi: " + k.getLokasi());
            System.out.println("Cabang Olahraga: " + k.getCabangOlahraga());
            System.out.println();
        }
    }

    public static void updateDataKejuaraan(final ArrayList<Data> daftarKejuaraan, final Scanner keyboard) {
        System.out.println("MENU UPDATE DATA KEJUARAAN");
        tampilDataKejuaraan(daftarKejuaraan);
        System.out.print("Masukkan nomor data yang ingin diupdate: ");
        final int nomor = keyboard.nextInt();
        
        if (nomor >= 1 && nomor <= daftarKejuaraan.size()) {
            System.out.print("Nama Kejuaraan baru: ");
            final String namaBaru = keyboard.nextLine();
            System.out.print("Lokasi baru: ");
            final String lokasiBaru = keyboard.nextLine();
            System.out.print("Cabang Olahraga baru: ");
            final String cabangBaru = keyboard.nextLine();

            final Data kejuaraan = daftarKejuaraan.get(nomor - 1);
            kejuaraan.setNamaKejuaraan(namaBaru);
            kejuaraan.setLokasi(lokasiBaru);
            kejuaraan.setCabangOlahraga(cabangBaru);

            System.out.println("Data Kejuaraan berhasil diupdate!");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public static final void hapusDataKejuaraan(final ArrayList<Data> daftarKejuaraan, final Scanner keyboard) {
        System.out.println("MENU HAPUS DATA KEJUARAAN");
        tampilDataKejuaraan(daftarKejuaraan);
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        final int nomor = keyboard.nextInt();
        
        if (nomor >= 1 && nomor <= daftarKejuaraan.size()) {
            final Data kejuaraan = daftarKejuaraan.remove(nomor - 1);
            System.out.println("Data Kejuaraan berhasil dihapus: " + kejuaraan.getNamaKejuaraan());
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }
}
