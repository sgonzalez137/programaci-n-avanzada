package Motores.Fabrica2;
import Motores.AbstractFactory.FabricaMotores;
import Motores.AbstractProduct1.MotorDiesel;
import Motores.AbstractProduct2.MotorGasolina;
import Motores.ConcreteProduct2.MotorGasEnL;
import Motores.ConcreteProduct2.MotorGasEnV;
import Motores.ConcreteProduct2.MotorGasEnW;


public class FabricaGas extends FabricaMotores  {


	@Override
	public MotorGasolina getMotorGasolina(String MotorType) {
		
		if(MotorType.equalsIgnoreCase("EnLinea")) {
			
			return new MotorGasEnL();
			
		}
		
		else if (MotorType.equalsIgnoreCase("W")) {
			
			return new MotorGasEnW();
		}
		
		else if(MotorType.equalsIgnoreCase("V")) {
			
			return new MotorGasEnV();
		}
		
		else{
		return null;
		}
	}

	@Override
	public MotorDiesel getMotorDiesel(String MotorType) {

		return null;
	}

}
