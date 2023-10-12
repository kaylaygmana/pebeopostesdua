# Kayla Virrly
# 2209116011
Post test 2 praktikum peograman berorientasi objek dengan KONI sebagai tema.

## Daftar Isi

- [Tentang](#tentang)
- [Main.java](#Main.java)
- [Data.java](#Data.java)
- [Penjelasan_program](#penjelasan_program)
  - [Penjelasan_Main.java](Main.java)
  - [Penjelasan_Data.java](#Data.java)
- [Penjelasan_Output]

## Tentang
Project ini berfokus pada CRUD data kejuaraan sehingga user dapat membuat baru data kejuaraan, menampilkan mengubah hingga menghapus data kejuaraan.

## Main.java
  package com.mycompany.main
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
Kelas ini memiliki metode yang dapat memanipulasi data atau kelas inilah yang menentukan program berjalan dikarenakan metode CRUD berada paa kelas ini.

`tambahDataKejuaraan`: Pilih menu `1. Tambah Data Kejuaraan` dan ikuti petunjuk untuk memasukkan nama kejuaraan, lokasi, dan cabang olahraga. Untuk menambah data kejuaraan. 

`tampilDataKejuaraan`: Pilih menu `2. Lihat Data Kejuaraan` untuk melihat daftar data kejuaraan yang telah dimasukkan.

`updateDataKejuaraan`: Pilih menu `3. Update Data Kejuaraan` untuk memperbarui data kejuaraan yang sudah ada. Ikuti petunjuk untuk memasukkan nomor data yang ingin diupdate dan data baru.

`hapusDataKejuaraan`: Pilih menu `4. Hapus Data Kejuaraan` untuk menghapus data kejuaraan yang sudah ada. Ikuti petunjuk untuk memasukkan nomor data yang ingin dihapus.

## Data.java
Kelas `Data` merupakan bagian dari proyek ini dan digunakan untuk merepresentasikan data kejuaraan olahraga. Kelas ini memiliki tiga atribut utama yang menyimpan informasi tentang kejuaraan olahraga: `namaKejuaraan`, `lokasi`, dan `cabangOlahraga`.

# Atribut Kelas

- `namaKejuaraan`: Menyimpan nama kejuaraan olahraga.
- `lokasi`: Menyimpan lokasi atau tempat di mana kejuaraan olahraga berlangsung.
- `cabangOlahraga`: Menyimpan jenis cabang olahraga yang dipertandingkan dalam kejuaraan.

# Konstruktor

Kelas `Data` memiliki konstruktor yang digunakan untuk membuat objek `Data`. Konstruktor ini menerima tiga parameter yang akan digunakan untuk menginisialisasi atribut-atribut di atas.

### Penjelasan program
## Menu utama
![menu_utama](https://github.com/kaylaygmana/pebeopostesdua/assets/126877526/5a21d196-f73b-4762-a601-687cdcf66132)
Tampilan awal saat user menggunakan program. User diminta untuk input menu yang ingin dioperasikan melalui kode menu.

## Tambah Data
![tambah kejuaraan](https://github.com/kaylaygmana/pebeopostesdua/assets/126877526/58e87a31-44da-400f-b607-5e06c88b3d9b)
Tampilan apabila user meminilih menu 1 untuk menambah data. User akan diminta untuk menginput nama kejuaraan, lokasi dan cabor.

## Lihat Data
![tampil kejuaraan](https://github.com/kaylaygmana/pebeopostesdua/assets/126877526/fd61a71b-34c0-41d0-aa65-0c3e29acae21)
Tampilan apabila user memilih menu 2 untuk menampilkan data. Pada gambar diatas user telah memasukkan 3 data kejuaraan.

## Update Data
![update kejuaran](https://github.com/kaylaygmana/pebeopostesdua/assets/126877526/e5e75137-1b44-4077-9c47-97fbefc04713)
Tampilan apabila user memilih menu 3 untuk memperbaharui data. User akan diminta untuk menginputkan kode urutan data yang ingin di update lalu diminta untuk memasukkan nama kejuaraan baru, lokasi baru dan cabang olahraga baru.
![tampil hasil update](https://github.com/kaylaygmana/pebeopostesdua/assets/126877526/1156232b-41f6-4079-bb2a-4de4b749ce5d)
Tampilan setelah data terupdate.

## Hapus Data
![hapus kejuaraan](https://github.com/kaylaygmana/pebeopostesdua/assets/126877526/a0fcef88-bc09-4b4d-9eb8-4b1f9ea07974)

Tampilan apabila user memilih menu 3 untuk menghapus data kejuaraan. User akan diminta input kode urutan data yang ingin dihapus

![hasil hapus kejuaraan](https://github.com/kaylaygmana/pebeopostesdua/assets/126877526/b956b0da-dec9-4e49-8e91-aee512a7c6fa)

Tampilan data setelah proses hapus data.


