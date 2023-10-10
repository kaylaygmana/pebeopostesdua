# Kayla Virrly
# 2209116011
Post test 2 praktikum peograman berorientasi objek dengan KONI sebagai studi kasus.

## Daftar Isi

- [Tentang](#tentang)
- [Main.java](#Main.java)
  - [Data.java](#Data.java)
  - [Penjelasan_program](#penjelasan_program)
- [Main.java](Main.java)
- [Data.java](#Data.java)

## Tentang
Project ini berfokus pada CRUD data kejuaraan sehingga user dapat membuat baru data kejuaraan, menampilkan mengubah hingga menghapus data kejuaraan.

## Main.java
  package com.mycompany.main\n
  import Kejuaraan.Data
  import java.util.ArrayList
  import java.util.Scanner

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


### Penjelasan program

## Main.java
Kelas ini memiliki metode yang dapat memanipulasi data.
1. - `tambahDataKejuaraan`: Untuk menambah data kejuaraan, pilih menu `1. Tambah Data Kejuaraan` dan ikuti petunjuk untuk memasukkan nama kejuaraan, lokasi, dan cabang olahraga.

2.- `tampilDataKejuaraan`: Pilih menu `2. Lihat Data Kejuaraan` untuk melihat daftar data kejuaraan yang telah dimasukkan.

3.- `updateDataKejuaraan`: Pilih menu `3. Update Data Kejuaraan` untuk memperbarui data kejuaraan yang sudah ada. Ikuti petunjuk untuk memasukkan nomor data yang ingin diupdate dan data baru.

4. - `hapusDataKejuaraan`: Pilih menu `4. Hapus Data Kejuaraan` untuk menghapus data kejuaraan yang sudah ada. Ikuti petunjuk untuk memasukkan nomor data yang ingin dihapus.

## Data.java
Kelas `Data` merupakan bagian dari proyek ini dan digunakan untuk merepresentasikan data kejuaraan olahraga. Kelas ini memiliki tiga atribut utama yang menyimpan informasi tentang kejuaraan olahraga: `namaKejuaraan`, `lokasi`, dan `cabangOlahraga`.

# Atribut Kelas

- `namaKejuaraan`: Menyimpan nama kejuaraan olahraga.
- `lokasi`: Menyimpan lokasi atau tempat di mana kejuaraan olahraga berlangsung.
- `cabangOlahraga`: Menyimpan jenis cabang olahraga yang dipertandingkan dalam kejuaraan.

# Konstruktor

Kelas `Data` memiliki konstruktor yang digunakan untuk membuat objek `Data`. Konstruktor ini menerima tiga parameter yang akan digunakan untuk menginisialisasi atribut-atribut di atas.
