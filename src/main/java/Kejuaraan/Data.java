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
