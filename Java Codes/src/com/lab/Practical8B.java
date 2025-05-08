package com.lab;


class EvenThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even number: "+i);
			}
			try {
				Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted: " + e.getMessage());
	        }
		}
	}
}

class OddThread extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("Odd number: "+i);
			}
			try {
				Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted: " + e.getMessage());
	        }
		}
	}
}

public class Practical8B {

	public static void main(String[] args) {

		EvenThread e = new EvenThread();
		OddThread o = new OddThread();
		e.start();
		o.start();
		
	}

}
