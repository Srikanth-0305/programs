package com.revision;

public class Demo {

	public static void main(String[] args) {
		Consumer indian=new Consumer();
		EB eboffice=new EB();
		Metro metrooffice=new Metro();
		
		indian.makePayment(metrooffice);
		indian.makePayment(eboffice);
}
}
