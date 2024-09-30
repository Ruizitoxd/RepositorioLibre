/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import java.util.ArrayList;

/**
 *
 * @author SAlA-9
 */
public class Inventario {
    ArrayList<Zapato> listaZapatos;
    
    public Inventario(){
        this.listaZapatos = new ArrayList<>();
    }

    public ArrayList getListaZapatos() {
        return listaZapatos;
    }

    public void setListaZapatos(ArrayList listaZapatos) {
        this.listaZapatos = listaZapatos;
    }
    
    public void agregarZapato(Zapato x){
        listaZapatos.add(x);
    }
    
    public Zapato buscarZapato(String nombreZapato){
        for (Zapato cadaZapato : listaZapatos){
            if (nombreZapato == cadaZapato.getNombre()){
                return cadaZapato;
            }
        }
        return null;
    }
    
    public void mostrarTodosZapatos(){
        for (Zapato cadaZapato : listaZapatos){
            System.out.println(cadaZapato.getNombre());
        }
    }

}
