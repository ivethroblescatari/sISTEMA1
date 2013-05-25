package utilitarios;
public class encriptadoGavo {
    public static String getEncriptado(String palabra){
        String s = "";
        char[] cad = palabra.toCharArray();
        for(int i = 0; i< cad.length; i++){
            s+=(char)(int)(cad[i]+(Math.random()*50+1));
            s+=(char)(int)(cad[i]+(Math.random()*50+1));
            s+=(char)(int)(cad[i]+(Math.random()*50+1));
            s+=(char)(int)(cad[i]+13);
            s+=(char)(int)(cad[i]+(Math.random()*50+1));
            s+=(char)(int)(cad[i]+(Math.random()*50+1));
        }        
        return s;
    }
    
    public static String getDesencriptado(String palabra){
        String s = "";
        char[] cad = palabra.toCharArray();
        int o = 0;
        for(int i = 0; i< cad.length; i++){
            if(o==3){                
                s+=(char)(int)(cad[i]-13);
            }
            o++;            
            if(o==6)
                o=0;
        }
        return s;
    }
}
