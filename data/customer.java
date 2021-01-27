
package data;

public class customer extends Manusia {

    public customer(String nama, String alamat) {
        super(nama, alamat);
    }

    
    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}

// 14 22 