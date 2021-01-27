package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateGui {
    JFrame upt = new JFrame();
    JLabel cari,updatedata;
    JTextField txcari,txupdatedata;
    JButton back,confirm;
    
    public UpdateGui() {
        upt.setSize(240,430);
        upt.getContentPane().setBackground(Color.ORANGE);
        upt.setLayout(null);
        
        cari = new JLabel("Cari Data");
        cari.setBounds(10,10,100,20);
        cari.setFont(new Font("Times New Roman",Font.BOLD,20));
        upt.add(cari);
        
        txcari = new JTextField();
        txcari.setBounds(9,32,200,20);
        upt.add(txcari);
        
        updatedata = new JLabel("Update Data");
        updatedata.setBounds(10,60,150,20);
        updatedata.setFont(new Font("Times New Roman",Font.BOLD,20));
        upt.add(updatedata);
        
        txupdatedata = new JTextField();
        txupdatedata.setBounds(9,82,200,20);
        upt.add(txupdatedata);
        
        back = new JButton("<");
        back.setBounds(25,300,75,50);
        back.setFont(new Font("Times New Roman",Font.BOLD,30));
        back.setBackground(Color.pink);
        upt.add(back);
        
        confirm = new JButton(">");
        confirm.setBounds(130,300,75,50);
        confirm.setFont(new Font("Times New Roman",Font.BOLD,30));
        confirm.setBackground(Color.CYAN);
        upt.add(confirm);
        
        upt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        upt.setLocationRelativeTo(null);
        upt.setVisible(true);
        
        back.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
             upt.dispose();
        }
    });
        
        confirm.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
            try{
                String cari = txcari.getText();
                String update = txupdatedata.getText();
                allobj.ctrl.Update(cari, update);
             }catch(Exception exception) {
        JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal",JOptionPane. INFORMATION_MESSAGE);
            }
             upt.dispose();
        }
    });
        
    }
 }
    

