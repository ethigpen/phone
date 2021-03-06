package com.thigpen.phone;

public class Iphone extends Phone implements Ringable {
	
//	constructor
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return "Iphone says zing";
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recgonization";
    }
    @Override
    public void displayInfo() {
        String info = String.format("Iphone %s from %s",this.getVersionNumber(), this.getCarrier());
        System.out.println(info);
    }
		

}
