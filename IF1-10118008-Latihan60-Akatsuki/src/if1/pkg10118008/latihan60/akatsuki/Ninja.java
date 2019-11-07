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
public class Ninja {
	private String nama, desa;

	public Ninja(String nama, String desa) {
		this.nama = nama;
		this.desa = desa;
	}

	public void kenalan(){
		System.out.println("Halo Nama Saia "+ this.nama);	
	}	

	public void desa(){
		System.out.print("Saia dari Desa " + this.desa);
	}
}
