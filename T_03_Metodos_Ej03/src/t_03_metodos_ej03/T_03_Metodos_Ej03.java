package t_03_metodos_ej03;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 20, 2019 1:44:24 PM                            *
 * fecha de finalizacion: May 20, 2019 1:47:40 PM                              *
 * nombre del proyecto: T_03_Metodos_Ej03.java                                 *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 3. Escribir un método lógico llamado vocal que determine si un carácter es  *
 *    una vocal.                                                               *
 *                                                                             *
 ******************************************************************************/

public class T_03_Metodos_Ej03 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * Comprobar los casos posibles del método vocal.                           *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        System.out.println(vocal('a'));
        System.out.println(vocal('b'));
        System.out.println(vocal('A'));
        System.out.println(vocal('U'));
        System.out.println(vocal('9'));
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | Comprobar si un carácter es una vocal o no.                             |
     | ~~~~Parámetros:~~~~                                                     |
     | caracter: Carácter a comprobar si es una vocal o no.                    |
     | ~~~~Método dirigido a:  BackEnd~~~~                                     |
     |________________________________________________________________________*/
    static boolean vocal(char caracter)
    {
        //CUERPO DEL METODO//
        if((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u'))
        {
            return true;
        }
        else if((caracter == 'A') || (caracter == 'E') || (caracter == 'I') || (caracter == 'O') || (caracter == 'U'))
        {
            return true;
        }
        else
            return false;
    }
}