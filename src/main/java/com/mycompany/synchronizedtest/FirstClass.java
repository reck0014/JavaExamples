/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.synchronizedtest;

/**
 *
 * @author reck0014
 */
public class FirstClass {

	public static void main(String[] args) {
		
		Bathroom bathroom = new Bathroom();
		
		Thread mom = new Thread(new TakingShower(bathroom), "Mom");
		Thread dad = new Thread(new BrushingTeeth(bathroom), "Dad");
		Thread brother = new Thread(new TakingShower(bathroom), "Brother");
		Thread sister = new Thread(new BrushingTeeth(bathroom), "Sister");
		
		mom.start();
		dad.start();
		brother.start();
		sister.start();
		
	}

}
