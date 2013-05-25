package utilitarios;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class archivo {
   private static String texto;
   private static File archivo;
   //private static DataInputStream leer = null;
    private static void leerDatos() throws FileNotFoundException, IOException{
        texto ="";
        String curDir = System.getProperty("user.dir");        
        archivo = new File(curDir+"\\datadir.conf");
        DataInputStream leer = new DataInputStream(new FileInputStream(archivo));
        int x=1;
        while(x == 1){
            int l = leer.read();
            if(l>-1){
                texto+=(char)l;
            }
            else x =0;
        }      
    }
    
    public static void datos(){
        try {
            leerDatos();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void crear(String s) throws IOException{
        ObjectOutputStream file = null;
        try {
            String curDir = System.getProperty("user.dir");
            file = new ObjectOutputStream(new FileOutputStream(curDir+"\\datadir.conf"));
            char[]c=s.toCharArray();
            for(int i = 0; i<c.length;i++){
                file.write((int)c[i]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static String cuenta(){
        datos();
        texto=encriptadoGavo.getDesencriptado(texto);
        String cuenta = "";
        char[]cad = texto.toCharArray();
        int o = 0;
        for(int i = 0; i< cad.length;i++){
            if(((int)(cad[i]))==64){
                o++;
            } 
            else{
                if(o==1)
                cuenta+=cad[i];
            }
        }
        return cuenta;
    }
        public static String pass(){
        datos();
        texto=encriptadoGavo.getDesencriptado(texto);
        String cuenta = "";
        char[]cad = texto.toCharArray();
        int o = 0;
        for(int i = 0; i< cad.length;i++){
            if(((int)(cad[i]))==64){
                o++;
            } 
            else{
                if(o==2)
                cuenta+=cad[i];
            }
        }
        return cuenta;
    }
    public static String db(){
        datos();
        texto=encriptadoGavo.getDesencriptado(texto);
        String cuenta = "";
        char[]cad = texto.toCharArray();
        int o = 0;
        for(int i = 0; i< cad.length;i++){
            if(((int)(cad[i]))==64){
                o++;
            } 
            else{
                if(o==3)
                cuenta+=cad[i];
            }
        }
        return cuenta;
    }
    public static String url(){
        datos();
        texto=encriptadoGavo.getDesencriptado(texto);
        String cuenta = "";
        char[]cad = texto.toCharArray();
        int o = 0;
        for(int i = 0; i< cad.length;i++){
            if(((int)(cad[i]))==64){
                o++;
            } 
            else{
                if(o==4)
                cuenta+=cad[i];
            }
        }
        return cuenta;
    }    
}
