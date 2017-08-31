package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

@LocalBean
@Dependent
public class Utilities implements Serializable{
    
    /**
     * Este metodo devuelve el resumen de un texto, retornando las primera 20 letras
     * @param texto recibe el texto a resumir
     * @return devuelve las primeras 20 letras el texto
     */
    public String getResume(String texto) {
 
        String cadena = "";
        int recorrido;
        if(texto==null){
        return null;
        }else{
        if (texto.length() > 20) {
            cadena="";
            for (recorrido = 0; recorrido < 20; recorrido++) {
                cadena += String.valueOf(texto.charAt(recorrido));
            }
        } else {
            cadena = texto;
        }
           
        return cadena;
    }
    }
    /**
     * Este metodo se encarga de eliminar los dobles espacios remplazandolo por un solo espacio, ademas 
     * coloca inicial mayuscula a todas las palabras
     * @param texto recibe el texto que va ser capitalizado
     * @return Retorna el texto sin dobles espacios y las palabras con inicial mayuscula
     */
    
    public String capitalizar(String texto) {
        String salida;

        if (texto != null) {
            for (int i = 0; i < texto.length(); i++) {
                texto = texto.replaceAll("  ", " ");
            }

            texto = texto.toLowerCase();
            salida = String.valueOf(texto.charAt(0)).toUpperCase();
            for (int i = 1; i < texto.length(); i++) {
                if (texto.charAt(i - 1) == ' ' && texto.charAt(i) != ' ') {
                    salida += String.valueOf(texto.charAt(i)).toUpperCase();
                } else {
                    salida += texto.charAt(i);
                }

            }
            return salida;
        } else {
            return null;
        }
    }
//     public String capitalizar(String texto) {
//        String cadena = "";
//       if(texto==null){
//       return null;
//       }else{
//        for (int rec2 = 0; rec2 < texto.length(); rec2++) {
//            texto = texto.replaceAll("  ", " ");
//        }
//        if (texto.charAt(0) != ' ') {
//            cadena = String.valueOf(texto.charAt(0)).toUpperCase();
//        }
//
//        for (int rec = 1; rec < texto.length(); rec++) {
//            if (texto.charAt(rec - 1) == ' ' && texto.charAt(rec) != ' ') {
//                cadena += String.valueOf(texto.charAt(rec)).toUpperCase();
//            } else {
//                cadena += texto.toLowerCase().charAt(rec);
//            }
//
//        }
//        if(texto.isEmpty()){
//        cadena="";
//        }
//         return cadena;
//       }
//    }
     /**
      * 
      * @param frase cadena de texto que contiene la frase a buscar
      * @param texto cadena de texto donde se buscaran las coincidencias
      * @return cantidad de coincidencias de la frase en el texto
      */
     public int contarCoincidencias(String frase, String texto) {
        int cantidad = 0, niv = 0, ct1, ct2;
        if (texto != null) {
            String busqueda;
            if (frase.length() < texto.length()) {
                for (ct1 = frase.length(); ct1 <= texto.length(); ct1++, niv++) {
                    busqueda = "";
                    for (ct2 = 0 + niv; ct2 < frase.length() + niv; ct2++) {
                        busqueda += String.valueOf(texto.charAt(ct2));
                    }
                    if (frase.equalsIgnoreCase(busqueda)) {
                        cantidad++;
                    }
                }

            } else {
                cantidad = 0;
            }
            return cantidad;
        } else {
            return 0;
        }
//       public int contarCoincidencias(String frase, String texto) {
//        int cantidad=0, niv = 0;
//        String busqueda;
//        if (frase.length() < texto.length()) {
//            for (int rec = frase.length(); rec <= texto.length(); rec++, niv++) {
//                busqueda = "";
//                for (int rec2 = 0 + niv; rec2 < frase.length() + niv; rec2++) {
//                    busqueda += String.valueOf(texto.charAt(rec2));
//                }
//                if (frase.equalsIgnoreCase(busqueda)) {
//                    cantidad++;
//                }
//            }
//
//        } else {
//            cantidad=0;
//        }
//        return cantidad;
//    }
//  
}
}
