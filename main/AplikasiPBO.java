package main;
import data.*;
import Controller.ControllerModel;
import GUI.DaftarGui;
import GUI.MainGui;
import GUI.ViewGui;
import java.util.Scanner;

public class AplikasiPBO {
   static ControllerModel pesan = new ControllerModel();
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       MainGui gui = new MainGui();
 
        
//        int pilih=0;
//         do{
//             try{
//
//             System.out.println("\n1. Daftar ");
//             System.out.println("2. Ambil ");
//             System.out.println("3. Lihat Antrian");
//             System.out.println("4. Update Data ");
//             System.out.println("5. Keluar ");
//             System.out.print("pilih : ");
//             pilih = input.nextInt();
//             switch(pilih)
//             {
//                 case 1 : Daftar();
//                 break;
//                 case 2 : Ambil();
//                 break;
//                 case 3 :view();
//                 break;
//                 case 4 :updateData();
//                 break;
//             }
//             }catch (Exception x){
//                 System.out.println("Inputan salah" );   
//                
//             }
//            }while(pilih<5);
//          
//        }
//    
//
//    static void Daftar(){
//        String jenis;
//        System.out.println("1. roda 2");
//        System.out.println("2. roda 4");
//        System.out.print("pilih : ");
//        int indexjenis = input.nextInt();
//        if(indexjenis==1){
//           jenis="Roda 2";
//        }else{
//            jenis ="Roda 4";
//        }
//        System.out.print("masukkan nama : ");
//        String nama = input.next();
//        System.out.print("masukkan alamat : ");
//        String alamat = input.next();
//        System.out.print("masukkan nomor plat : ");
//        String plat = input.next();
//        System.out.print("masukkan merk kendaraan : ");
//        String merk = input.next();
//        System.out.print("masukkan warna : ");
//        String warna = input.next();
//        customer beli = new customer("habib","driyorejo");
//        pesan.insert(new kendaraan("honda", "4444", "biru",beli));
//    }
//    static  void Ambil(){  
//          System.out.print("masukkan nama : ");
//          String nama =input.next();
//          System.out.print("masukkan nomor plat : ");
//          String platnomor = input.next();
//               pesan.Delete(nama,platnomor);
//      }      
//    static  void view(){
//        System.out.println("=========================================");
//         for ( kendaraan soal : pesan.view()) {
//        System.out.println("nama       : " + soal.getBeli().getNama());
//        System.out.println("alamat     : " + soal.getBeli().getAlamat());
//        System.out.println("plat nomor : " + soal.getNomor_kendaraan());
//        System.out.println("merk       : " + soal.getMerk());
//        System.out.println("warna      : " + soal.getWarna());
//        System.out.println("jenis      : " + soal.getJenis());
//         System.out.println("========================================");
//         }
//    }
//     static void updateData(){        
//             System.out.print("masukkan data yang lama : ");
//             String cari = input.next();
//             System.out.println("masukkan data baru : ");
//             String Databaru = input.next();
//             pesan.Update(cari,Databaru); 
//           }
  }
}



