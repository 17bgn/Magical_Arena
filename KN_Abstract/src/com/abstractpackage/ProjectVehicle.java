package com.abstractpackage;

public class ProjectVehicle {

	public static void main(String[] args) {
		//Vehicle v = new Vehicle();
		YuluBike y= new YuluBike();
		Vehicle.engine();
		y.engine();
		y.gear();
		
		Vehicle v =y;
		v.engine();
		v.gear();
		

	}

}
