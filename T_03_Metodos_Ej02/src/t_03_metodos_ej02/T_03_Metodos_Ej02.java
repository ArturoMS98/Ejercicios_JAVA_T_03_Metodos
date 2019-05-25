package t_03_metodos_ej02;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 20, 2019 1:42:47 PM                            *
 * fecha de finalizacion: May 20, 2019 1:44:00 PM                              *
 * nombre del proyecto: T_03_Metodos_Ej02.java                                 *
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
    * Llamar al método y comprobar todos sus casos posibles                    *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        System.out.println(multiplo(3,6));
        System.out.println(multiplo(3,5));
        System.out.println(multiplo(4,0));
        //error en//System.out.println(multiplo(0,4));
        System.out.println(multiplo(3,-6));
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | Devolver true si el segundo parámetro es múltiplo del primero.          |
     | ~~~~Parámetros:~~~~                                                     |
     | numero: número pequeño, el cual puede ser un factor de múltiplo         |
     | multiplo: entero a averiguar si (numero*factor == multiplo)             |
     | ~~~~Método dirigido a:  BackEnd~~~~                                     |
     |________________________________________________________________________*/
    static boolean multiplo(int numero, int multiplo)
    {
        //CUERPO DEL METODO//
        if(multiplo%numero == 0)
            return true;
        else
            return false;
    }
}
