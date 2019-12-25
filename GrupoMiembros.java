public class GrupoMiembros
{
    private String funcion;
    private int cantidadMiembros, nPercel, idCargo, maxMiembros;
    
    GrupoMiembros(String funcion, int idCargo, int maxMiembros){
        this.funcion = funcion;
        this.cantidadMiembros = 0;
        this.nPercel = 0;
        this.idCargo = idCargo;
        this.maxMiembros = maxMiembros;
    }
    
    public int getCargoId(){
        return this.idCargo;
    }
    
    public String getFuncion(){
        return (this.funcion);
    }
    
    public boolean aniadirMiembro(Miembro aniadido) throws TooManyPercelEx { // Precondicion: El cargo debe ser el correcto de este contenedor
        if(this.cantidadMiembros < this.maxMiembros){
            if(aniadido.getPercel()){
                if(aniadido.getCargo().getMaxPercel() < this.nPercel ){
                    this.nPercel++;
                }else{
                    throw new TooManyPercelEx();
                }
            }
            this.cantidadMiembros++;
            aniadido.getCargo().setInfo(this.funcion);
            return true;
        }
        return false;
    }
}
