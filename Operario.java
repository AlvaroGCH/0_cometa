public class Operario extends Cargo {
    public Operario() {
        super(1, /*String info,*/ 14 , 20,-1,-1);
    }
    public String mostrarRequesitos(){
        return "Edad minima: " + getMinEdad();
    }
}