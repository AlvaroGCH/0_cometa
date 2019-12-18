public class Main
{
    public static void main(String[] args) {
        Departamentos listaDeDepartamentos = new Departamentos(); // Departamentos ya inicializados
        
        Mostrador mainMostrador = new Mostrador(); // mostrador

        Departamento test = listaDeDepartamentos.getDepartamento("test"); // coge departamento
        Miembro juan = Lector.leer("temp.txt",listaDeDepartamentos);// coge los miembros

    }
}
