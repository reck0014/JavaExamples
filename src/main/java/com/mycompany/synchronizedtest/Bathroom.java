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
public class Bathroom {
    
	public void bathTask() {
		
		String name = Thread.currentThread().getName();
		
		System.out.println(name + " try open the door");
		
		
		synchronized (this) {
		
			System.out.println(name + " open the door and enter");
			System.out.println(name + " close the door");
			System.out.println(name + " starts shower");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name + " close shower, dry and exit bathroom");
		}
	}
	
	public void teethTask() {
		
		String name = Thread.currentThread().getName();
			
		System.out.println(name + " try open the door");
		
		synchronized (this) {
					
			System.out.println(name + " open the door and enter");
			System.out.println(name + " close the door");
			System.out.println(name + " start brushing");
				
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			System.out.println(name + " finish brushing and exit bathroom");
		}
	}    
}
