package t_03_metodos_ej01;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 20, 2019 1:36:39 PM                             *
 * fecha de finalizacion: May 20, 2019 1:42:30 PM                               *
 * nombre del proyecto: T_03_Metodos_Ej01.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 1. Escribir un método que tenga un parámetro de tipo entero y que devuelva  *
 *    la letra P si el número es positivo, la letra N si es negativo y la      *
 *    letra C si es cero.                                                      *
 *                                                                             *
 ******************************************************************************/

public class T_03_Metodos_Ej01 {

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
    static char calculoPositivo(int numero)
    {
        //VARIABLES LOCALES//
        char caracter;
        final char p = 'P';
        final char n = 'N';
        final char c = 'C';
        //CUERPO DEL METODO//
        if(numero > 0)
            caracter = p;
        else if(numero < 0)
            caracter = n;
        else if(numero == 0)
            caracter = c;
        else
        {
            System.out.println("Introduzca una opción valida");
            caracter = 'z';
        }
        return caracter;
    }
}
