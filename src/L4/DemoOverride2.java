/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L4;

/**
 *
 * @author GL553VD
 */
public class DemoOverride2 {
    public static void main(String[]args){
        B obj=new B();
        obj.setA(13);
        obj.setB(65);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}
