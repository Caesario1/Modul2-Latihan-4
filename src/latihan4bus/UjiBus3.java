/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4bus;

/**
 *
 * @author WINDOWS 10
 */
public class UjiBus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] abc) 
    {
      
        Latihan4Bus Bus = new Latihan4Bus(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang (2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang (1); //tambah 1 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang (2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang (2);//tambah 2 penumpang
        Bus.cetakpenumpang();
    }
    
}
