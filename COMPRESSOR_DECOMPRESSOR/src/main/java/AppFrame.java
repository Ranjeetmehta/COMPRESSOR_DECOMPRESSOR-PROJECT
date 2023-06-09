
import COMP_DECOMPRESSOR.compressor;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ranjeet Kumar
 */
public class AppFrame extends JFrame implements ActionListener{
   JButton compressButton;
   JButton decompressButton;
   
   
   
   AppFrame(){
       this.setLayout(null);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       compressButton=new JButton("select file to compress");
       compressButton.setBounds(20,100,200,30);
       compressButton.addActionListener(this);
       
       
       decompressButton=new JButton("select file to decompress");
       decompressButton.setBounds(200,100,200,30);
       decompressButton.addActionListener(this);
       this.add(compressButton);
       this.add(decompressButton);
       this.setVisible(true);
       
       this.setSize(1000,700);
       this.getContentPane().setBackground(Color.green);
       this.setTitle("compressor and decompressor");
       
   }

    @Override
    public void actionPerformed(ActionEvent e) {

   if(e.getSource()==compressButton){
       JFileChooser filechooser=new JFileChooser();
        int response= filechooser.showSaveDialog(null);
        if(response==JFileChooser.APPROVE_OPTION){
            File file=new File(filechooser.getSelectedFile().getAbsolutePath());
        System.out.print(file);
        try{ 
            compressor.method(file);
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null,ee.toString());
        }
        }
   }
    if(e.getSource()==decompressButton){
       JFileChooser filechooser=new JFileChooser();
        int response= filechooser.showSaveDialog(null);
        if(response==JFileChooser.APPROVE_OPTION){
            File file=new File(filechooser.getSelectedFile().getAbsolutePath());
        System.out.print(file);
        try{ 
            decompressor.method(file);
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(null,ee.toString());
        }
        }
   }
    
    }
}
