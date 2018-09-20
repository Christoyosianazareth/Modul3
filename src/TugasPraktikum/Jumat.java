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
public class Jumat extends Kamis{
    private final String hari = "Jumat";
    private final String Ekstra = "\n     -Bolla Volly"
                          + "\n     -Seni Baca Al-qur'an"
                          + "\n     -Robotik";
       
    protected void Jumat(){
        super.Kamis();
        System.out.println(" > Hari "+hari+" : "+Ekstra);
}


}
