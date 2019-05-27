package t_03_metodos_ej08;
import java.util.Scanner;
 /***********************************************************************************************
 * @author baha                                                                                 *
 * <p>fecha de inicializacion: May 27, 2019 11:50:14 AM<p>                                       *
 * <p>fecha de finalizacion: May 27, 2019 00:31:23 PM<p>                                         *
 * <p>nombre del proyecto: T_03_Metodos_Ej08.java<p>                                            *
 * <p>Anteriores versiones en:</p>                                                              *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Metodos.git">GIT</a></p>*
 ************************************************************************************************
 *                                                                                              *
 * <h1>Función de la clase:</h1>                                                                *
 * <p>8. Escribir un programa que lea una cadena de hasta diez caracteres que representa a un   *
 * número en numeración romana e imprima su equivalente en numeración arábiga. Nota que la      *
 * "numeración arábiga" es numeración decimal.</p>                                              *
 * @version 1.0                                                                                 *
 * <p>Tiempo invertido en esta versión: 0 horas 41 minutos</p>                                  *
 *                                                                                              *
 ***********************************************************************************************/
public class T_03_Metodos_Ej08 {
                                                                                                
    /********************************************************************************************
    *                                                                                           *
    * <h1>MÉTODO MAIN</h1>                                                                      *
    * <p>Funcion:</p>                                                                           *
    * <p>Llamar a los métodos peticionCadenaRomana y transformarlos a numeración decimal con el *
    *    método transforRomanoDecimal</p>                                                       *
    *                                                                                           *
    ********************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String cadenaRomana;
        int cadenaArabiga;
        
        
        //FRONTEND//
            //PETICION DE DATOS//
            cadenaRomana = peticionCadenaRomana();
        //BACKEND//
            cadenaArabiga = transforRomanoDecimal(cadenaRomana);
        
        //Despedida//
        System.out.println("La cadena " + cadenaRomana + " en numeración arábiga es: " + cadenaArabiga);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                       |
     | <p>Pedir un número romano válido y devolverlo en letras mayúsculas</p>                   |
     | <p>Esperando por la versión 1.1 en la que se añada la comprobación del orden de los      |
     |    caracteres para poder verificar si un número romano es correcto a nivel real</p>      |
     | ~~~~<p>Parámetros:</p>~~~~                                                               |
     | @return La cadena de caracteres de números romanos                                       |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                              |
     |_________________________________________________________________________________________*/
    static String peticionCadenaRomana ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        String cadenaRomana;
        boolean centinela;
        //CUERPO DEL METODO//
        do
        {
            centinela = false;
            //PETICION DE CADENA//
            System.out.print("Introduzca un número romano: ");
            cadenaRomana = in.nextLine();
            //Transformamos la cadena para operar con ella//
            cadenaRomana = cadenaRomana.toLowerCase();
            //Comprobación de datos introducidos//
            for(int i = 0; i < cadenaRomana.length(); i++)
            {
                char caracterRomano = cadenaRomana.charAt(i);
                if((caracterRomano != 'i') && (caracterRomano != 'x') && (caracterRomano != 'v') && (caracterRomano != 'c') && (caracterRomano != 'l') && (caracterRomano != 'd') && (caracterRomano != 'm'))
                {
                    System.out.println("El número romano sólo puede contener los caracteres [I,X,V,L,C,D,M]");
                    System.out.println("Error en el caracter " + (i+1));
                    centinela = true;
                }
            }
        }while(centinela);
        return cadenaRomana.toUpperCase();
    }
    
    /**_________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                       |
     | <p>Transformar un número romano que tan sólo contenga sumas dentro, y ordenado de        |
     |    forma correcta, a número arábigo</p>                                                  |
     |    Esperando por la versión 1.1 en que se implanten estas actualizaciones ^-^            |
     | ~~~~<p>Parámetros:</p>~~~~                                                               |
     | @return La cadena de caracteres de números romanos                                       |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                              |
     |_________________________________________________________________________________________*/
    static int transforRomanoDecimal(String cadena)
    {
        int numeroArabigo = 0;
        for(int i = 0; i < cadena.length(); i++)
        {
            char caracter = cadena.charAt(i);
            switch(caracter)
            {
                case 'I': numeroArabigo++;
                break;
                case 'V': numeroArabigo += 5;
                break;
                case 'X': numeroArabigo += 10;
                break;
                case 'L': numeroArabigo += 50;
                break;
                case 'C': numeroArabigo += 100;
                break;
                case 'D': numeroArabigo += 500;
                break;
                case 'M': numeroArabigo += 1000;
                break;
            }
        }
        return numeroArabigo;
    }
}