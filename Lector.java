import java.io.*;

public class Lector {
    public static Miembro leer(String fileName, Departamentos listaDeDepartamentos) {

        // This will reference one line at a time
        char letra = (char) -1;
        
        String buffer = ""; 
        
        String nombre = "";
        String apellido = "";
        Cargo cargo = null;
        int xp = -1;
        int naci = -1;
        int habi = -1;
        Departamento dep = null;
        boolean percel = false;
        
        int elemento = 1;
        
        try {
            // Lee ficheros de texto
            FileReader fileReader = new FileReader(fileName);

            // Envuelto en un buffer reader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // recorer el fichero entero
            while((letra =  (char) bufferedReader.read()) !=  (char) -1 ) { 
                
                //Para los distintos elementos del miembro
                if(letra != ';' && elemento == 1){
                    nombre += letra;
                }
                else if(letra != ';' && elemento == 2){
                    apellido += letra;
                }
                else if(letra != ';'){ // para el resto de elementos que son string
                    buffer += letra;
                }
                if(letra == ';'){ // delimitador de atributos
                    //traducir casos q no son string
                    if( elemento == 3 ){
                        cargo = Traductor.cargo(buffer);
                        buffer = "";
                    }
                    if( elemento == 4){
                        xp = Integer.parseInt(buffer);
                        buffer = "";
                    }
                    if( elemento == 5){
                        naci = Integer.parseInt(buffer);
                        buffer = "";
                    }
                    if( elemento == 6){
                        habi = Integer.parseInt(buffer);
                        buffer = "";
                    }
                    if( elemento == 7){
                        dep = listaDeDepartamentos.getDepartamento(buffer); // traductor no tiene acceso a la lista de departamentos
                        buffer = "";
                    }
                    if( elemento == 8){
                        percel = Traductor.percel(buffer);
                        buffer = "";
                    }
                    elemento++;
                }
                
            }   

            // Always close files.
            bufferedReader.close();
            
            Miembro ret = new Miembro(nombre,apellido,cargo,xp,naci,habi,dep,percel);
            return ret;
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();             
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
