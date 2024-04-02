package clasestring;

public class ClaseString {

    public static void main(String[] args) {
        String nombre = "Breiner Stiven Parra Cortés";
        
        System.out.println( "La longitud de el nombre " +  nombre +  " es: "  + nombre.length());
       
        
        //charAt = nos muestra la palabra que se indica en el indice
        //No funciona -1 
        
        System.out.println(nombre.charAt(0));
        
        // Ver el ultimo caracter
        int longitud = nombre.length();
        System.out.println(nombre.charAt(longitud - 1));
        
        
        // String.subString = retorna el String cortado con la cantidad indicada
        String frase = "Hola Mundo";
        System.out.println(frase.substring(2));
        
        // De donde empieza a quitar hasta donde
        System.out.println(frase.substring(2, 4));
    
        // String.equals = valida si dos cadenas de caracteres tienen el mismo valor
        
        System.out.println("Hola".equals("Hola")); //true
        
        System.out.println("Hola".equals("hola")); //false
        
        // String.equalsIgnoreCase = ignore las mayusculas y minusculas
    }
    
}
