package t_03_metodos_ej04;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 20, 2019 1:47:57 PM                            *
 * fecha de finalizacion: May 20, 2019 1:51:00 PM                              *
 * nombre del proyecto: T_03_Metodos_Ej04.java                                 *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 4. Escribir un método lógico que determine si un carácter es una letra      *
 *    minúscula.                                                               *
 *                                                                             *
 ******************************************************************************/

public class T_03_Metodos_Ej04 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * 
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        esMinuscula('z');
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | 
     | ~~~~Parámetros:~~~~                                                     |
     | 
     | ~~~~Método dirigido a: FrontEnd //BackEnd~~~~                                     |
     |________________________________________________________________________*/
    static boolean esMinuscula(char caracter)
    {
        //CUERPO DEL METODO//
        System.out.println((int)caracter);
        if(caracter >= 97 && caracter <= 122)
            return true;
        else
            return false;
    }
}
