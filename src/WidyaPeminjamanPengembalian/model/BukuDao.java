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
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku ("112","Si Kancil","Widya","Bobo"));
        data.add(new Buku("113","Merah putih","Suci","Bintang"));
        
    }
    
    public void insert(Buku buku){
        data.add(buku);
    }
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku>getAll(){
        return data;
    }
}

