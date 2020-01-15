import java.io.*;
public class Escritor {

   public static void writeDep(String dep, Departamentos listaDeDepartamentos )throws IOException {
       
       final int NUMERO_CARGOS = 5; // fix the number of cargos
       
       BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
       Departamento departamento = listaDeDepartamentos.getDepartamento(dep);
       int max = 0;
       
       writer.write(""); // limpiar el fichero
       writer.append(dep + "\n"); // name of deparment
       
       // the diferent cargos
       for( int j = 1; j <= NUMERO_CARGOS; j++){
           max = departamento.getGrupoMiembros(j).getCantidadMiembros();
           if (max > 0){
               writer.append(departamento.getGrupoMiembros(j).getMiembro(0).getCargo().getNombre() + ": ( " + departamento.getGrupoMiembros(j).getMiembro(0).getCargo().mostrarRequisitos() + " ) \n");
               for(int i = 0; i < max; i++){
                   writer.append(departamento.getGrupoMiembros(j).getMiembro(i).getNombre() + "\n");
               }
           }
       }
        
       writer.close(); // cerrar el filewriter
    }
    public static void writeMiem(Miembro miembro)throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
        writer.write(""); // limpiar el fichero
        writer.append(miembro.getNombre() + "\n");
        writer.append("Cargo: " + miembro.getCargo().getNombre() +  "\n");
        writer.append(miembro.getEdad() + "\n");
    }
}