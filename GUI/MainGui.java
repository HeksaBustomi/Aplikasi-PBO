package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.pemesanan;

public class MainGui {
    JFrame home = new JFrame();
    pemesanan pesan = new pemesanan();
    JButton Daftar,Ambil,Update,reload;
    JLabel Judul,subjudul;
    JTextArea txarea=new JTextArea(); 
    JTable tabel = new JTable();
    JScrollPane scroll = new JScrollPane(tabel);

    public MainGui() {
          home.setSize(720,680);
          home.setLayout(null);
          home.getContentPane().setBackground(Color.ORANGE);
          
          Judul = new JLabel("STEAM MOBIL & MOTOR");
          Judul.setBounds(170,20,400,30);
          Judul.setFont(new Font("Times New Roman",Font.BOLD,30));
          home.add(Judul);
          
          subjudul = new JLabel("ANTRIAN");
          subjudul.setBounds(120,130,300,30);
          subjudul.setFont(new Font("Times New Roman",Font.BOLD,25));
          home.add(subjudul);
          
          reload = new JButton("Refresh");
          reload.setBounds(10,530,150,25);
          reload.setFont(new Font("Times New Roman",Font.BOLD,20));
          reload.setBackground(Color.cyan);
          home.add(reload);       
         
          txarea.setBounds(10,170,340,340);
          home.add(txarea);
          
//          scroll.setBounds (10,170,340,340);
//          tabel.setModel(tabelmodel());
//          home.add(scroll);
          
          Daftar = new JButton("Daftar");
          Daftar.setBounds(420,170,200,25);
          Daftar.setFont(new Font("Times New Roman",Font.BOLD,20));
          Daftar.setBackground(Color.cyan);
          home.add(Daftar);
          
          Ambil = new JButton("Ambil Kendaraan");
          Ambil.setBounds(420,220,200,25);
          Ambil.setFont(new Font("Times New Roman",Font.BOLD,20));
          Ambil.setBackground(Color.cyan);
          home.add(Ambil);
          
          Update = new JButton("Update Data");
          Update.setBounds(420,270,200,25);
          Update.setFont(new Font("Times New Roman",Font.BOLD,20));
          Update.setBackground(Color.cyan);
          home.add(Update);

          home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          home. setVisible(true);
          home.setLocationRelativeTo(null);
          
  Daftar.addActionListener(new ActionListener()
  {
    @Override
    public void actionPerformed (ActionEvent x) {
             DaftarGui guidaftar = new DaftarGui();
        }
    });
  
  Ambil.addActionListener(new ActionListener()
  {
    @Override
    public void actionPerformed (ActionEvent x) {
        
             AmbilGui guiambil = new AmbilGui();  
        }
    });
  
  Update.addActionListener(new ActionListener()
  {
    @Override
    public void actionPerformed (ActionEvent x) {
             UpdateGui guiupdate = new UpdateGui();
        }
    });
  
   reload.addActionListener(new ActionListener()
  {
    @Override
    public void actionPerformed (ActionEvent x) {      
//             home. setVisible(false );
//             home. setVisible(true);
             txarea.setText(tesview());
        }
    }); 
   txarea.addMouseListener(new MouseAdapter(){
      @Override
      public void mouseClicked(MouseEvent e) {
//          int i = tabel.getSelectedRow();
            String i = txarea.getSelectedText();
            ViewGui view = new ViewGui();
            }  
    });
  }
         public DefaultTableModel tabelmodel(){
        
        DefaultTableModel tabelmodel = new DefaultTableModel();
        Object[] data = new Object[4]; 
        Object[] kolom ={"No","Nama","Plat Nomor"};
        tabelmodel.setColumnIdentifiers(kolom);
          for (int i=0;i<allobj.ctrl.view().size();i++){
        data[0]=i+1;
        data[1]=allobj.ctrl.view().get(i).getBeli().getNama();
        data[2]=allobj.ctrl.view().get(i).getNomor_kendaraan(); 
        tabelmodel.addRow(data);
        i++;
        }
        return tabelmodel;
     }
         public String tesview(){
             String nama = null;
              for ( int i=0;i<allobj.ctrl.view().size();i++){
       nama ="Antrian ke - "+ (i+1) +". " +allobj.ctrl.view().get(i).getBeli().getNama()
               +" / "+allobj.ctrl.view().get(i).getNomor_kendaraan() + "\tClick to detail...";
         }
       return nama;
 }
}

