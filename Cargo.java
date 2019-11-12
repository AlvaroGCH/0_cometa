public abstract class Cargo implements Percel{
    private int minEdad;
    private int minExp;
    private int minSkill;
    
    private int cargoID;
  //  private String info;
    private int maxPercel;
    
    
    public Cargo(int id, /*String info,*/ int maxPercel, int minEdad, int minExp, int minSkill){
        
        this.cargoID = id;
       /* this.info = info;*/
        this.maxPercel = maxPercel;
        this.minEdad = minEdad;
        this.minExp = minExp;
        this.minSkill = minSkill;
        
    }
    
    public int getMinEdad(){
        return this.minEdad;
    }
    public int getMinExp(){
        return this.minExp;
    }
    public int getMinSkill(){
        return this.minSkill;
    }
    
    public int getCargoID() {
        return cargoID;
    }
 /*   
    public String getInfo() {
        return info;
    }*/
    
    public int getMaxPercel() {
        return maxPercel;
    }
    
    public abstract String mostrarRequisitos();
}