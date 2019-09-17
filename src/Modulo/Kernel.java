package Modulo;

import java.util.ArrayList;

public class Kernel {

    public static void main(String []args){
        ArrayList<String> tokens = new ArrayList<>();
        tokens.add("esta");
        tokens.add("es");
        tokens.add("una");
        tokens.add("oracion");
        ArrayList<String> permutaciones = Combinaciones(tokens);
        for(int Contador=0;Contador<permutaciones.size();Contador++){
            System.out.println(permutaciones.get(Contador));
        }
    }

    public static ArrayList<String> Combinaciones(ArrayList<String> tokens){
        ArrayList<String> combinaciones = new ArrayList<>();
        CombinacionesRecursivo(tokens,combinaciones,"");
        return combinaciones;
    }

    public static void CombinacionesRecursivo(ArrayList<String> tokens,ArrayList<String>combinaciones,String palabra){
        ArrayList<String> copiatokens;
        String auxiliarpalabra;
        if(tokens.size() == 1){
            copiatokens = new ArrayList<String>(tokens);
            auxiliarpalabra = palabra + " " + copiatokens.remove(0);
            combinaciones.add(auxiliarpalabra);
            return;
        }
        for(int Contador=0;Contador<tokens.size();Contador++){
            copiatokens = new ArrayList<>(tokens);
            auxiliarpalabra = palabra + " " + copiatokens.remove(Contador);
            CombinacionesRecursivo(copiatokens,combinaciones,auxiliarpalabra);
        }
    }

}