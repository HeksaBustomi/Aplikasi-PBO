package GUI;
import java.awt.Color;
import javax.swing.*;

public class ViewGui {
   JFrame view= new JFrame(); 
   JTextArea text = new JTextArea();

    public ViewGui() {
          view.setSize(240,430);
          view.setLayout(null);
          view.getContentPane().setBackground(Color.ORANGE);
       
          view. setVisible(true);
          view.setLocationRelativeTo(null);
         
          
          text.setBounds(10,10,200,360);
          text.setBackground(Color.WHITE);
          view.add(text);
          text.setText(list());
          
          view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
       public String list(){
        String view = null;
        for ( int i=0;i<allobj.ctrl.view().size();i++) {
            
     view = "\n Nama      : "+allobj.ctrl.view().get(i).getBeli().getNama()+
             "\n\n alamat    : " + allobj.ctrl.view().get(i).getBeli().getAlamat()
             + "\n\n Plat Nomor : " + allobj.ctrl.view().get(i).getNomor_kendaraan() +
             "\n\n Merk      : " + allobj.ctrl.view().get(i).getMerk() + "\n\n warna     : "
             + allobj.ctrl.view().get(i).getWarna();
       return view;  
         }
        return null;  
    }
}
