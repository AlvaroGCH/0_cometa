import java.util.ArrayList;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
                
        Departamentos listaDeDepartamentos = new Departamentos(); // Departamentos ya inicializados
        
        Mostrador mainMostrador = new Mostrador(); // mostrador
        
       try{ // main block to test wrong file input
            
            Lector.leer("temp.txt",listaDeDepartamentos);// coge los miembros
            Escritor escritor = new Escritor();
            
            System.out.println(listaDeDepartamentos.getDepartamento("test").getMiembro(2).getNombre());
            
            escritor.writeDep("test",listaDeDepartamentos);
            //Interfaz inter = new Interfaz(listaDeDepartamentos);
            
        }catch(TooManyPeopleEx e){
            System.out.println(e.toString());
        }catch(TooManyPercelEx e){
            System.out.println(e.toString());
        }catch(TooManyCargoEx e){
            System.out.println(e.toString());
        }catch(NoRequisitosEx e){
            System.out.println(e.toString());
        }catch(IOException e){
            System.out.println(e.toString());
        }
        
    }
}