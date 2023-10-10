

---
Nama: "Kayla Virrly \U0001F41E"
NIM: 2209116011

---

## Source Code
### Main.java
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
            }
        } while (pilihan != 0);

        System.out.println("Program selesai.");
    }

    public static void tambahDataKejuaraan(final ArrayList<Data> daftarKejuaraan, final Scanner keyboard) {
        System.out.print("Nama Kejuaraan: ");
        final String nama = keyboard.next();
        System.out.print("Lokasi: ");
        final String lokasi = keyboard.next();
        System.out.print("Cabang Olahraga: ");
        final String cabang = keyboard.next();

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
            final String namaBaru = keyboard.next();
            System.out.print("Lokasi baru: ");
            final String lokasiBaru = keyboard.next();
            System.out.print("Cabang Olahraga baru: ");
            final String cabangBaru = keyboard.next();

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

### Data.java
package Kejuaraan;

public final class Data{
    private String namaKejuaraan;
    private String lokasi;
    private String cabangOlahraga;

    public Data(String namaKejuaraan, String lokasi, String cabangOlahraga) {
        this.namaKejuaraan = namaKejuaraan;
        this.lokasi = lokasi;
        this.cabangOlahraga = cabangOlahraga;
    }

    public final String getNamaKejuaraan() {
        return namaKejuaraan;
    }

    public final void setNamaKejuaraan(String namaKejuaraan) {
        this.namaKejuaraan = namaKejuaraan;
    }

    public final String getLokasi() {
        return lokasi;
    }

    public final void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public final String getCabangOlahraga() {
        return cabangOlahraga;
    }

    public final void setCabangOlahraga(String cabangOlahraga) {
        this.cabangOlahraga = cabangOlahraga;
    }
}


### Environment
 - OS: [e.g. Arch Linux]
 - Other details that you think may affect.

### Additional context
Add any other context about the problem here.
