package Motores.Fabrica1;

import Motores.AbstractFactory.FabricaMotores;
import Motores.AbstractProduct1.MotorDiesel;
import Motores.AbstractProduct2.MotorGasolina;
import Motores.ConcreteProduct1.MotorDieselEnLinea;
import Motores.ConcreteProduct1.MotorDieselEnW;
import Motores.ConcreteProduct1.MotorDiselEnV;

public class FabricaDiesel extends FabricaMotores {

	@Override
	public MotorDiesel getMotorDiesel(String MotorType) {

		if(MotorType.equalsIgnoreCase("EnLinea")) {
			
			return new MotorDieselEnLinea();
			
		}
		
		else if (MotorType.equalsIgnoreCase("W")) {
			
			return new MotorDieselEnW();
		}
		
		else if(MotorType.equalsIgnoreCase("V")) {
			
			return new MotorDiselEnV();
		}
		
		else{
		return null;
		}
		
		
		
		
	}

	@Override
	public MotorGasolina getMotorGasolina(String MotorType) {
		return null;
	}


}
