package t_03_metodos_ej05;
 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 20, 2019 1:51:29 PM                             *
 * fecha de finalizacion: May 20, 2019 1:54:40 PM                               *
 * nombre del proyecto: T_03_Metodos_Ej05.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 5. Escribir un programa que lea dos números x y n. Y un método que calcule  *
 *    la suma de la progresión geométrica:                                     *
 *                      1 + x + x^2 + x^3 + ... + x^n                          *
 *                                                                             *
 ******************************************************************************/

public class T_03_Metodos_Ej05 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * 
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        System.out.println(sumaProgresionGeometrica(5,2));
    }
    
    
    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | 
     | ~~~~Parámetros:~~~~                                                     |
     | 
     | ~~~~Método dirigido a: FrontEnd //BackEnd~~~~                                     |
     |________________________________________________________________________*/
    static int sumaProgresionGeometrica(int x, int n)
    {
        //VARIABLES LOCALES//
        int suma = 0;
        int multiplicador = 1;
        //CUERPO DEL METODO//
        do
        {
            suma += multiplicador;
            multiplicador *= x;
            n--;
        }while(n >= 0);
        return suma;
    }
}
