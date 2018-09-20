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
public class Kamis extends Rabu{
    private final String hari = "Kamis";
    private final String Ekstra = "\n     -Futsal"
                          + "\n     -Metic";
    
    protected void Kamis(){
        super.Rabu();
        System.out.println(" > Hari "+hari+" : "+Ekstra);
}

}
