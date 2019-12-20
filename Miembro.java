public class  Miembro {
    
    private String nombre;
    private String apellidos;
    private Cargo cargo;
    private int experiencia;
    private int nacimiento;  
    private double habilidad;
    private Departamento departamento;
    private boolean percel;
    
    
    public Miembro(String nombre, String apellidos, Cargo cargo, int experiencia, int nacimiento, double habilidad, Departamento departamento, boolean percel){
        
        this.nombre = String.valueOf(nombre);
        this.apellidos = String.valueOf(apellidos);
        setCargo(cargo); // TODO: comprovaciones se union
        this.experiencia = experiencia;
        this.nacimiento = nacimiento;
        this.habilidad = habilidad;
        this.departamento = departamento;
        this.percel = percel;
        
    }
    
    public void setNombre(String nombre){
        this.nombre = String.valueOf(nombre);
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = String.valueOf(apellidos);
    }
    
   public void setCargo(Cargo cargo){	
		int edad = 2061 - nacimiento;
		int min_exp = cargo.getMinExp();
		int min_edad = cargo.getMinEdad();
		int min_habilidad = cargo.getMinSkill();
		if(experiencia > min_exp && edad > min_edad && habilidad > min_habilidad) 
			this.cargo = cargo;
		else
			System.out.println("Excepcion");
	}
    
    public void setDepartamento(Departamento departamento){ 
        this.departamento = departamento;
    }
    
    public void setExperiencia(int experiencia){        
        this.experiencia = experiencia;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public Cargo getCargo(){
        return cargo;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    public int getNacimiento(){         
        return nacimiento;
    }
    
    public int getEdad() {
        return 2061-nacimiento;
    }
    
    public double getHabilidad(){
        return habilidad;
    }
    
    public Departamento getDepartamento(){
        return departamento;
    }
    public boolean getPercel(){
       return this.percel;
    }
}
