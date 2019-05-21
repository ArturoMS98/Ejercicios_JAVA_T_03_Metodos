package t_03_metodos_ej03;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 20, 2019 1:44:24 PM                             *
 * fecha de finalizacion: May 20, 2019 1:47:40 PM                               *
 * nombre del proyecto: T_03_Metodos_Ej03.java                                       *
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
    * 
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | 
     | ~~~~Parámetros:~~~~                                                     |
     | 
     | ~~~~Método dirigido a: FrontEnd //BackEnd~~~~                                     |
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
