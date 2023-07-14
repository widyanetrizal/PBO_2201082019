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
public class AnggotaDao {
    private List<Anggota> data = new ArrayList();
    
    public AnggotaDao(){
        data.add(new Anggota ("111","Widya","Sungaipua","p"));
        data.add(new Anggota ("112","Netrizal","Bukittinggi","p"));
        
    }
    
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    
    public List<Anggota>getAll(){
        return data;
    }

    public void delate(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

