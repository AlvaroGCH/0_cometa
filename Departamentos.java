import java.util.*;

public class Departamentos
{
    Map<String, Departamento> departamentos;
    
    
    public Departamentos()
    {
        departamentos = new HashMap<String, Departamento>(); // almacenar todos los departamentos y mapearloscon un string
        
        departamentos.put("test", new Departamento("h","o","l","a","c"));
    }
    
    Departamento getDepartamento(String dep){
        return this.departamentos.get(dep); // if not found returns null
    }
}
