package Motores.ConcreteProduct1;
import Motores.AbstractProduct1.MotorDiesel;

public class MotorDieselEnW implements MotorDiesel {

	@Override
	public void CrearMotor() {
		
		System.out.print("Se ha creado un Motor Diesel En W");
		
	}

	@Override
	public void AddTurbo() {
		System.out.print("Se ha añadido turbo");

	}
	

	
}