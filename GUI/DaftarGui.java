package GUI;
import data.customer;
import data.kendaraan;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.pemesanan;

public class DaftarGui {
    JFrame insert = new JFrame();
    JLabel nama,plat,alamat,merk,warna;
    JTextField txnama,txplat,txalamat,txmerk,txwarna;
    JButton confirm,back;
    public DaftarGui() {
        insert.setSize(240,430);
        insert.getContentPane().setBackground(Color.ORANGE);
        insert.setLayout(null);
        insert.setVisible(true);
        
        nama = new JLabel("Nama");
        nama.setBounds(10,10,50,20);
        nama.setFont(new Font("Times New Roman",Font.BOLD,20));
        insert.add(nama);
        
        txnama=new JTextField();
        txnama.setBounds(9,32,200,20);
        insert.add(txnama);
        
        plat = new JLabel("Plat Nomor");
        plat.setBounds(10,60,100,20);
        plat.setFont(new Font("Times New Roman",Font.BOLD,20));
        insert.add(plat);
        
        txplat=new JTextField();
        txplat.setBounds(9,82,200,20);
        insert.add(txplat);
        
        alamat = new JLabel("Alamat");
        alamat.setBounds(10,110,100,20);
        alamat.setFont(new Font("Times New Roman",Font.BOLD,20));
        insert.add(alamat);
        
        txalamat=new JTextField();
        txalamat.setBounds(9,130,200,20);
        insert.add(txalamat);
        
        merk = new JLabel("Merk Kendaraan");
        merk.setBounds(10,160,200,20);
        merk.setFont(new Font("Times New Roman",Font.BOLD,20));
        insert.add(merk);
        
        txmerk=new JTextField();
        txmerk.setBounds(9,180,200,20);
        insert.add(txmerk);
        
        warna = new JLabel("Warna kendaraan");
        warna.setBounds(10,210,250,20);
        warna.setFont(new Font("Times New Roman",Font.BOLD,20));
        insert.add(warna);
        
        txwarna=new JTextField();
        txwarna.setBounds(9,230,200,20);
        insert.add(txwarna);
        
        back = new JButton("<");
        back.setBounds(25,300,75,50);
        back.setFont(new Font("Times New Roman",Font.BOLD,30));
        back.setBackground(Color.pink);
        insert.add(back);
        
        confirm = new JButton(">");
        confirm.setBounds(130,300,75,50);
        confirm.setFont(new Font("Times New Roman",Font.BOLD,30));
        confirm.setBackground(Color.CYAN);
        insert.add(confirm);
      
        
        insert.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        insert.setLocationRelativeTo(null);
        
       confirm.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
        try{
        String nama = txnama.getText();
        String plat = txplat.getText();
        String alamat = txalamat.getText();
        String merk = txmerk.getText();
        String warna = txwarna.getText();
        pemesanan pesan = new pemesanan();
        customer beli = new customer(nama,alamat);
        allobj.ctrl.insert(new kendaraan(merk , plat , warna, beli));
       
        insert.dispose();
        }catch(Exception exception) {
        JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal",JOptionPane. INFORMATION_MESSAGE);
        
            }
        }
    });
       
        back.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
             insert.dispose();
        }
    });
    }
    
    
}
