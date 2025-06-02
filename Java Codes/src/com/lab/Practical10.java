package com.lab;


class EvenRunnable implements Runnable {
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even number: "+i);
			}
			try {
				Thread.sleep(1000);
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
				Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted: " + e.getMessage());
	        }
		}
	}
}

public class Practical10 {

	public static void main(String[] args) {

		EvenRunnable e = new EvenRunnable();
		Thread e1 = new Thread(e); 
		OddThread o = new OddThread();
		e1.start();
		o.start();
		
	}

}



/*Output ----
Odd number: 1
Even number: 2
Even number: 4
Odd number: 3
Even number: 6
Even number: 8
Odd number: 5
Even number: 10
Odd number: 7
Odd number: 9
*/
