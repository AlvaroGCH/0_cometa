

public abstract class Cargo implements Percel{
	
    private int cargoID;
  //  private String info;
    private int maxPercel;
    
    public Cargo(int id, /*String info,*/ int maxPercel){
    	
        this.cargoID = id;
       /* this.info = info;*/
        this.maxPercel = maxPercel;
        
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
    
    public void setCargoID(int cargoID) {
    	this.cargoID = cargoID;
    }
    
    public void setMaxPercel(int maxPercel) {
    	this.maxPercel = maxPercel;
    }
    
}