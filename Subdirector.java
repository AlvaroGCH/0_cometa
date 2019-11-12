public class Subdirector extends Cargo {
	int minAniosExp;
	int minEdad;
	public Subdirector() {
		super(4, /*String info,*/ 1, 30, 10, -1);
		minAniosExp = 10;
		minEdad = 30;
	}
	public String mostrarRequisitos() {
		return "Minimo de experiencia:"+getMinExp()+"\nMinimo de edad "+getMinEdad()+"\nMaximo de Percel:"+getMaxPercel();
	}
}