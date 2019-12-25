import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
                
        Departamentos listaDeDepartamentos = new Departamentos(); // Departamentos ya inicializados
        
        Mostrador mainMostrador = new Mostrador(); // mostrador
        
        try{ // main block to test wrong file input
            
            Lector.leer("temp.txt",listaDeDepartamentos);// coge los miembros
            mainMostrador.mostrarRequisitos(listaDeDepartamentos.getDepartamento("test").getMiembro(1).getCargo());
            
        }catch(TooManyPeopleEx e){
            System.out.println(e.toString());
        }catch(TooManyPercelEx e){
            System.out.println(e.toString());
        }catch(TooManyCargoEx e){
            System.out.println(e.toString());
        }catch(NoRequisitosEx e){
            System.out.println(e.toString());
        }
        
    }
}