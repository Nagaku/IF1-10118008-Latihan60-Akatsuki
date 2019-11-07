/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan60.akatsuki;

/**
 *
 * @author ASUS
 */
public class Amegakure extends Ninja {

	public Amegakure(String nama, String desa) {
		super(nama, desa);
	}

	@Override
	public void desa() {
		super.desa(); //To change body of generated methods, choose Tools | Templates.
		System.out.println(", desa yang tersembunyi di balik hujan\n");
	}
	
}
