package com.thigpen.phone;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone emiles = new Iphone("10", 75, "TMobile", "buzz");
		Galaxy belles = new Galaxy("S9", 50, "Verizon", "buzz");
		
		emiles.displayInfo();
		System.out.println(emiles.ring());
		System.out.println(emiles.unlock());
		belles.displayInfo();
		System.out.println(belles.ring());
		System.out.println(belles.unlock());
	}

}
