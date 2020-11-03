package Motores.AbstractFactory;

import Motores.AbstractProduct1.MotorDiesel;
import Motores.AbstractProduct2.MotorGasolina;

public abstract class FabricaMotores {
    public abstract MotorDiesel getMotorDiesel (String MotorType);   
	public abstract MotorGasolina getMotorGasolina (String MotorType);
}

