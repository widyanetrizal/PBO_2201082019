/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package widyabuku.controller;
import widyabuku.view.FromBuku;
import widyabuku.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Slime1
 */
public class BukuController {
    private FromBuku fromBuku;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(FromBuku formBuku){
        this.fromBuku = formBuku;
        bukuDao = new BukuDao();
        
    }
    public void clearForm(){
        fromBuku.gettxtkode().setText("");
        fromBuku.gettxtjudul().setText("");
        fromBuku.gettxtpengarang().setText("");
        fromBuku.gettxtpenerbit().setText("");
        
        
    }
    public void tampil(){
       DefaultTableModel tabelModel = (DefaultTableModel) 
               fromBuku.gettabelbuku().getModel();
       tabelModel.setRowCount(0);
       List<Buku> list =bukuDao.getAll();
       for (Buku a : list){
        Object [] row ={
            a.getKodeBuku(),
            a.getJudulBuku(),
            a.getPengarang(),
            a.getPenerbit(),
            
        };
        tabelModel.addRow(row);
        
    }
       
           
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(fromBuku.gettxtkode().getText());
        buku.setJudulBuku(fromBuku.gettxtjudul().getText());
        buku.setPengarang(fromBuku.gettxtpengarang().getText());
        buku.setPenerbit(fromBuku.gettxtpenerbit().getText());
                
        bukuDao.insert(buku);
        JOptionPane.showMessageDialog(fromBuku,"insert OK");
        
    }
    
    public void updateBuku(){
        int index = fromBuku.gettabelbuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        buku.setKodeBuku(fromBuku.gettxtkode().getText());
        buku.setJudulBuku(fromBuku.gettxtjudul().getText());
        buku.setPengarang(fromBuku.gettxtpengarang().getText());
        buku.setPenerbit(fromBuku.gettxtpenerbit().getText());
        
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(fromBuku,"Update OK");
    }
    
    public void getBuku(){
        int index = fromBuku.gettabelbuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku!=null){
            fromBuku.gettxtkode().setText(buku.getKodeBuku());
            fromBuku.gettxtjudul().setText(buku.getJudulBuku());
            fromBuku.gettxtpengarang().setText(buku.getPengarang());
            fromBuku.gettxtpenerbit().setText(buku.getPenerbit());
        }
    }
    
    public void deleteBuku(){
        int index = fromBuku.gettabelbuku().getSelectedRow();
        bukuDao.delete(index);
         JOptionPane.showMessageDialog(fromBuku,"Delete OK");  
    }

    
   
    

    
    
}
