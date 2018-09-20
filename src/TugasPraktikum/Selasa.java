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
public class Selasa extends Ekstrakurikuler{
    private final String hari = "Selasa";
    private final String Ekstra = "\n     -Basket"
                          + "\n     -Paskibra";
    
    protected void Selasa(){
        super.identitas();
        super.judul();
        super.info();
        System.out.println(" > Hari "+hari+" : "+Ekstra);
    }

}
