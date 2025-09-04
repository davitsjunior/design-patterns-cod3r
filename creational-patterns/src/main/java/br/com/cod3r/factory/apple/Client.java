package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {

		IPhone device = null;

		
		System.out.println("### Ordering an iPhone X");
		device = IPhoneFactory.orderIPhone("X", "standard");
		System.out.println(device);
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		device = IPhoneFactory.orderIPhone("11", "highEnd");
		System.out.println(device);
	}
}
