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
public class BrushingTeeth implements Runnable {
	
	private Bathroom bathroom;
		
		public BrushingTeeth(Bathroom bathroom) {
			this.bathroom = bathroom;
		}
		
		@Override
		public void run() {
			this.bathroom.teethTask();
			
		}

}