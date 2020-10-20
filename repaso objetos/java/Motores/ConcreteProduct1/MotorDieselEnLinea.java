package Motores.ConcreteProduct1;
import Motores.AbstractProduct1.MotorDiesel;

public class MotorDieselEnLinea implements MotorDiesel {

	@Override
	public void CrearMotor() {
		
		System.out.print("Se ha creado un Motor Diesel En linea");
		
	}

	@Override
	public void AddTurbo() {
		
		System.out.print("Se ha a�adido turbo");
		
	}
	

	
}
