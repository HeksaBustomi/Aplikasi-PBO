package model;
import data.kendaraan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class pemesanan implements Pelayanan{
    private ArrayList<kendaraan> kendaraan; 
    public pemesanan(){
        kendaraan = new ArrayList<kendaraan>();
    }
    public void insert(kendaraan checkout){
    kendaraan.add(checkout);
    }  
    @Override
    public void ambil(String nama, String platnomor){ 
                   for(int i=0;i<kendaraan.size();i++)
                   {
                       if(kendaraan.get(i).getBeli().getNama().equals(nama)&& kendaraan.get(i).getNomor_kendaraan().equals(platnomor))
                        {
                            kendaraan.remove(i);
                            break;
                        }                     
                    } 
    }  
   @Override
    public void update(String update,String baru){
             for(int i=0;i<kendaraan.size();i++){
                 if(update.equals(kendaraan.get(i).getBeli().getNama())){
                   kendaraan.get(i).getBeli().setNama(baru);   
                 }else if(update.equals(kendaraan.get(i).getBeli().getAlamat())){
               kendaraan.get(i).getBeli().setAlamat(baru);
                 }
                 else if(update.equals(kendaraan.get(i).getMerk())){ 
                 kendaraan.get(i).setMerk(baru);
                }else if(update.equals(kendaraan.get(i).getNomor_kendaraan())){ 
                 kendaraan.get(i).setNomor_kendaraan(baru);
                }else  if(update.equals(kendaraan.get(i).getWarna())){
                kendaraan.get(i).setWarna(baru);
           }
        }
    }
    public  ArrayList<kendaraan> lihat(){
        return kendaraan;
    }
}