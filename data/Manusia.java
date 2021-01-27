package data;
public abstract class Manusia {
    protected String nama,alamat;

    public Manusia(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
}
