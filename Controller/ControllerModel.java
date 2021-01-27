package Controller;

import data.kendaraan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.pemesanan;

public class ControllerModel {
   pemesanan pesanan = new pemesanan();
    public void insert(kendaraan checkout){
    pesanan.insert(checkout);
    }
    public void Delete( String nama ,String plat){
        pesanan.ambil(nama, plat);
    }
    public void Update(String update , String baru){
        pesanan.update(update,baru);
    }
    public  ArrayList<kendaraan> view(){
        return pesanan.lihat();
      
    }
//    public DefaultTableModel tabelmodel(){
//       return pesanan.tabelmodel();
//        
//    }
 
}
