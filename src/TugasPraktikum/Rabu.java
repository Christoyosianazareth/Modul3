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
public class Rabu extends Selasa{
    private final String hari = "Rabu";
    private final String Ekstra = "\n     -Fotografi"
                          + "\n     -English Conversation";
    
    protected void Rabu(){
        super.Selasa();
        System.out.println(" > Hari "+hari+" : "+Ekstra);
    }

}
