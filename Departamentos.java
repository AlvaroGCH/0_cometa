import java.util.*;

public class Departamentos
{
    Map<String, Departamento> departamentos;
    
    
    public Departamentos()
    {
        departamentos = new HashMap<String, Departamento>(); // almacenar todos los departamentos y mapearloscon un string
        
        departamentos.put("test", new Departamento("h","o","l","a","c"));
        departamentos.put("direcci\u00f3n", new Departamento("h","o","l","a","c"));
        departamentos.put("log\u00edstica", new Departamento("h","o","l","a","c"));
        departamentos.put("control de robots", new Departamento("h","o","l","a","c"));
        departamentos.put("m\u00e9dico", new Departamento("h","o","l","a","c"));
        departamentos.put("investigaci\u00f3n biol\u00f3gica", new Departamento("h","o","l","a","c"));
        departamentos.put("construcci\u00f3n y mantenimiento", new Departamento("h","o","l","a","c"));
        departamentos.put("sistemas inform\u00e1ticos", new Departamento("h","o","l","a","c"));
        departamentos.put("investigaci\u00f3n astron\u00f3mica", new Departamento("h","o","l","a","c"));
        departamentos.put("cometolog\u00eda", new Departamento("h","o","l","a","c"));
        departamentos.put("navegaci\u00f3n", new Departamento("h","o","l","a","c"));
    }
    
    Departamento getDepartamento(String dep){
        return this.departamentos.get(dep); // if not found returns null
    }
}