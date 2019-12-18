public class Departamento {
    final int ID_OPERARIO = 1;
    final int ID_COORDINADOR = 2;
    final int ID_RESPONSABLE = 3;
    final int ID_SUBDIRECTOR = 4;
    final int ID_DIRECTOR = 5;
    
    final int NUMERO_DE_CARGOS = 5;
    
    private GrupoMiembros[] grupos = new GrupoMiembros[5];
    
    
    private Miembro[] miembros = new Miembro[41]; // maximo numero de miembros por dep
    
    private int numMiembros;
    
    Departamento(String funOperario, String funCoordinador, String funSubDirector, String funResponsable , String funDirector){
        this.grupos[0] = new GrupoMiembros(funOperario, ID_OPERARIO, 27);
        this.grupos[1] = new GrupoMiembros(funCoordinador, ID_COORDINADOR, 9);
        this.grupos[2] = new GrupoMiembros(funResponsable, ID_RESPONSABLE, 3);
        this.grupos[3] = new GrupoMiembros(funSubDirector, ID_SUBDIRECTOR, 1);
        this.grupos[4] = new GrupoMiembros(funDirector, ID_DIRECTOR, 1);
                
        this.numMiembros = 0;
    }
    
    
    public boolean aniadirMiembro(Miembro sujetoNuevo){
        for(int i = 0; i < NUMERO_DE_CARGOS; i++){
            if(sujetoNuevo.getCargo().getCargoId() == grupos[i].getCargoId()){
                if(grupos[i].aniadirMiembro(sujetoNuevo)){
                    this.miembros[this.numMiembros] = sujetoNuevo;
                    this.numMiembros++;
                    return true;
                }
            }
        }
        return false;
    }
    
    public Miembro getMiembro(int numMiembro){
        return this.miembros[numMiembro];
    }
}