import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
                
        Departamentos listaDeDepartamentos = new Departamentos(); // Departamentos ya inicializados
        
        Mostrador mainMostrador = new Mostrador(); // mostrador

        Lector.leer("temp.txt",listaDeDepartamentos);// coge los miembros
        
        mainMostrador.mostrarRequisitos(listaDeDepartamentos.getDepartamento("test").getMiembro(1).getCargo());
    }
}