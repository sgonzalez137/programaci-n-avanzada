package Motores.ConcreteProduct2;
import Motores.AbstractProduct2.MotorGasolina;

public class MotorGasEnV implements MotorGasolina {

	@Override
	public void CrearMotor() {	
		System.out.print("Se ha creado un Motor De Gasolina En V");	
	}

	@Override
	public void AddInterCool() {	
		System.out.print("Se ha añadido Intercooler");
	}	
}