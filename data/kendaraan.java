package data;
public class kendaraan {
    private String merk;
    private String nomor_kendaraan;
    private String warna;
    private customer beli;
    public kendaraan(String merk, String nomor_kendaraan, String warna ,customer beli){
        this.merk = merk;
        this.nomor_kendaraan = nomor_kendaraan;
        this.warna = warna;
        this.beli=beli;
    }
    public kendaraan(){
        
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setNomor_kendaraan(String nomor_kendaraan) {
        this.nomor_kendaraan = nomor_kendaraan;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getMerk() {
        return merk;
    }
    public String getNomor_kendaraan() {
        return nomor_kendaraan;
    }
    public String getWarna() {
        return warna;
    }
    public customer getBeli() {
        return beli;
    }
    public void setBeli(customer beli) {
        this.beli = beli;
    } 
}
