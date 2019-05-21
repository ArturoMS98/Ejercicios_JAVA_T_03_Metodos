package t_03_metodos_ej06;

import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 10, 2019 1:54:58 PM, hasta las 2:25:00PM
 *                          May 17, 2019 1:30:00 PM
 * fecha de finalizacion: May 17, 2019 2:25:58 PM                               *
 * nombre del proyecto: T_03_Metodos_Ej06.java                                       *
 *******************************************************************************
 *                                                                             *
 * Función de la clase:                                                        *
 * 6. Escribir un programa que lea dos enteros positivos n y b, y llame al     *
 *    método cambiar_base para calcular y visualizar la representación del     *
 *    número n en la base b. (NOTA: el número n dado por el usuario siempre    *
 *    está en base decimal. La base puede ser cualquiera entre 2 y 9, y la     *
 *    base hexadecimal, 16.)                                                   *
 *                                                                             *
 ******************************************************************************/

public class T_03_Metodos_Ej06 {

    /***************************************************************************
    *                                                                          *
    * CLASE MAIN                                                               *
    * Funcion del método MAIN:                                                 *
    * 
    *                                                                          *
    ***************************************************************************/

    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        System.out.println(lectorNumeros());
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | 
     | ~~~~Parámetros:~~~~                                                     |
     | 
     | ~~~~Método dirigido a: FrontEnd //BackEnd~~~~                                     |
     |________________________________________________________________________*/
    static String lectorNumeros()
    {
        //VARIABLES LOCALES//
        int b;
        int n;
        String numeroNuevo;
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        System.out.println("Introduzca numero a calcular la base: ");
        n = in.nextInt();
        do
        {
            System.out.println("Introduzca base al que hacer el cambio: ");
            b = in.nextInt();
        }while(b <= 1);
        System.out.println("n: " + n + ", b: " + b);
        numeroNuevo = cambiar_base(n, b);
        return numeroNuevo;
    }
    
    
    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | 
     | ~~~~Parámetros:~~~~                                                     |
     | 
     | ~~~~Método dirigido a: FrontEnd //BackEnd~~~~                                     |
     |________________________________________________________________________*/
    static String cambiar_base(int n, int b)
    {
        //final int baseInicial = 10;
        String resultado = "";
        while(n >= b)
        {
            int modulo = n%b;
            if(modulo >= 10)
            {
                System.out.println("modulo: " + modulo);
                char caracter = (char)(modulo + 87);
                System.out.println("caracter: " + caracter);
                resultado = caracter + resultado;
                n/=b;
            }
            else
            {
                resultado = modulo + resultado;
                n /= b;
            }
        }
        resultado = n + resultado;
        return resultado;
    }
}