package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AmbilGui {
    
    JFrame rmv = new JFrame();
    JLabel nama,plat;
    JTextField txnama,txplat;
    JButton back,confirm;
    
    public AmbilGui() {
        rmv.setSize(240,430);
        rmv.getContentPane().setBackground(Color.ORANGE);
        rmv.setLayout(null);
        
        nama = new JLabel("Nama");
        nama.setBounds(10,10,50,20);
        nama.setFont(new Font("Times New Roman",Font.BOLD,20));
        rmv.add(nama);
        
        txnama = new JTextField();
        txnama.setBounds(9,32,200,20);
        rmv.add(txnama);
        
        plat = new JLabel("Plat Nomor");
        plat.setBounds(10,60,100,20);
        plat.setFont(new Font("Times New Roman",Font.BOLD,20));
        rmv.add(plat);
        
        txplat = new JTextField();
        txplat.setBounds(9,82,200,20);
        rmv.add(txplat);
        
        back = new JButton("<");
        back.setBounds(25,300,75,50);
        back.setFont(new Font("Times New Roman",Font.BOLD,30));
        back.setBackground(Color.pink);
        rmv.add(back);
        
        confirm = new JButton(">");
        confirm.setBounds(130,300,75,50);
        confirm.setFont(new Font("Times New Roman",Font.BOLD,30));
        confirm.setBackground(Color.CYAN);
        rmv.add(confirm);
        
        rmv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rmv.setLocationRelativeTo(null);
        rmv.setVisible(true);
        
        back.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
             rmv.dispose();
        }
    });
        
        confirm.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
            try{
                String nama = txnama.getText();
                String plat = txplat.getText();
                allobj.ctrl.Delete(nama, plat);
             }catch(Exception exception) {
        JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal",JOptionPane. INFORMATION_MESSAGE);
            }
             rmv.dispose();
        }
    });
        
    }
       
}

