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
public class PengembalianDao {
    private List<Pengembalian> data = new ArrayList();
    
    public PengembalianDao(){
        data.add(new Pengembalian ("03","Widya","980","Legenda Danau Toba","12","23","25","2","Pensil"));
        data.add(new Pengembalian ("68","Suci","678","Merah putih","26","30","4","4","Majalah"));
        
    }
    
    public void insert(Pengembalian Pengembalian){
        data.add(Pengembalian);
    }
    public void update(int index,Pengembalian Pengembalian){
        data.set(index,  Pengembalian);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pengembalian getPengembalian(int index){
        return data.get(index);
    }
    
    public List<Pengembalian>getAll(){
        return data;
    }
}
