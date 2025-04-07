package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.CopperWire;
import com.xworkz.isarelation.Internal.Wire;

public class ColorOfWire {
    public void colorofwire(Wire wire){
        wire.conductElectricity();
        wire.flexibility();
        wire.insulation();
        wire.length();

        if (wire instanceof CopperWire);
        CopperWire copperWire=new CopperWire();
        copperWire.wireColors();
    }
}
