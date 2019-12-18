import java.util.*;

public class Traductor
{
    public static Cargo cargo(String cargoS){
        Map<String, Cargo> cargos = new HashMap<String, Cargo>();
        
        Cargo tempCargo = new Director();
        cargos.put("director", tempCargo);
        tempCargo = new Subdirector();
        cargos.put("subdirector", tempCargo);
        tempCargo = new Responsable();
        cargos.put("responsable", tempCargo);
        tempCargo = new Coordinador();
        cargos.put("coordinador", tempCargo);
        tempCargo = new Operario();
        cargos.put("operario", tempCargo);
        
        //System.out.println(cargos.get("director").getMinExp());
        
        return cargos.get(cargoS); // responde null si no existe el cargo
    }
    
    public static boolean percel(String percelS){ // Precondicion: el string es "si" o "no"
        if(percelS.equals("no")){
            return false;
        }else{
            return true;
        }
    }
}
