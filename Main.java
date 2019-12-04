public class Main
{
    public static void main(String[] args) {
        Mostrador mainMostrador = new Mostrador();
        Cargo op = new Director();
        Departamento test = new Departamento("h","o","l","a","c");
        Miembro juan = new Miembro("juan","perez",op,100,2000,100,test,false);
        
        if(test.aniadirMiembro(juan)){
            mainMostrador.mostrarRequisitos(test.getMiembro(0).getCargo());
            System.out.println(juan.getCargo().getInfo());
        }else{
            System.out.println("Miembro no se puede aniadir");
        }
        
        
    }
}
