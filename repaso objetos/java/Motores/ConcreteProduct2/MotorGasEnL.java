package Motores.ConcreteProduct2;
import Motores.AbstractProduct2.MotorGasolina;

public class MotorGasEnL implements MotorGasolina {

	@Override
	public void CrearMotor() {
		System.out.print("Se ha creado un Motor De Gasolina En Linea");
	}

	@Override
	public void AddInterCool() {
		System.out.print("Se ha añadido Intercooler");
	}	
}