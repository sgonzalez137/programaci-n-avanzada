package Motores.ConcreteProduct1;
import Motores.AbstractProduct1.MotorDiesel;

public class MotorDiselEnV implements MotorDiesel {

	@Override
	public void CrearMotor() {
		
		System.out.print("Se ha creado un Motor Diesel En V");
		
	}

	@Override
	public void AddTurbo() {
		
		System.out.print("Se ha añadido turbo");
		
	}
	

	
}