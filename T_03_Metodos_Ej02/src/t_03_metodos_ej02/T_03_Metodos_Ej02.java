package t_03_metodos_ej02;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 20, 2019 1:42:47 PM                             *
 * fecha de finalizacion: May 20, 2019 1:44:00 PM                               *
 * nombre del proyecto: T_03_Metodos_Ej02.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 2. Escribir un método que reciba dos parámetros enteros, devolverá true si  *
 *    el segundo es múltiplo del primer parámetro y false en caso contrario.   *
 *                                                                             *
 ******************************************************************************/

public class T_03_Metodos_Ej02 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * 
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        
        
        //FRONTEND//
            //PETICION DE DATOS//
        
        //BACKEND//
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | 
     | ~~~~Parámetros:~~~~                                                     |
     | 
     | ~~~~Método dirigido a: FrontEnd //BackEnd~~~~                                     |
     |________________________________________________________________________*/
    static boolean multiplo(int numero, int multiplo)
    {
        //CUERPO DEL METODO//
        if(numero%multiplo == 0)
            return true;
        else
            return false;
    }
}
