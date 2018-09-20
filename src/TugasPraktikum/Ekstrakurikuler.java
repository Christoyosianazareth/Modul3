/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author GL553VD
 */
public class Ekstrakurikuler {
   private final String hari = "Senin";
    private final String Ekstra = "\n     - Bolla Volly"
                          + "\n     - Basket";
    
    protected void identitas(){
        System.out.println("================================================");
        System.out.println("-----ChristoYosiaNazareth / X RPL 5 / 02-----");
        System.out.println("================================================");
    }
    protected void judul(){
        System.out.println("\n* Jadwal Ekstra Kurikuler SMK Telkom Malang");
    }
    public void info (){
        System.out.println(" > Hari "+hari+" : "+Ekstra);
    }
 
}
