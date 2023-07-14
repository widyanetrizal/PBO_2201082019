/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WidyaPeminjamanPengembalian.model;

import java.util.*;

/**
 *
 * @author HP
 */
public class PeminjamanDao {
     private List<Peminjaman> data = new ArrayList();
    
    public PeminjamanDao(){
        data.add(new Peminjaman ("02","Widya","12","Legenda danau Toba","12","23"));
        data.add(new Peminjaman ("68","Suci","68","Manusia Hebat","26","30"));
        
    }
    
    public void insert(Peminjaman peminjaman){
        data.add(peminjaman);
    }
    public void update(int index,Peminjaman peminjaman){
        data.set(index,  peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    
    public List<Peminjaman>getAll(){
        return data;
    }
}

