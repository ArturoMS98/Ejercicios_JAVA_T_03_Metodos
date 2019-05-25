package t_03_metodos_ej06;

import java.util.Scanner;

 /******************************************************************************
 * @author baha                                                                *
 * fecha de inicializacion: May 10, 2019 1:54:58 PM, hasta las 2:25:00PM       *
 *                          May 17, 2019 1:30:00 PM                            *
 * fecha de finalizacion: May 17, 2019 2:25:58 PM                              *
 * nombre del proyecto: T_03_Metodos_Ej06.java                                 *
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
    * Llamar al método lectorNumeros()                                         *
    *                                                                          *
    ***************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        System.out.println(lectorNumeros());
    }
    

    //Metodos suplementarios de la clase principal//

    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | Pide un número en base 10, la base a la que cambiarlo, y devuelve el    |
     | String que contiene el número cambiado a base base.                     |
     | ~~~~Parámetros:~~~~                                                     |
     | No recibe ningún parámetro.                                             |
     | ~~~~Método dirigido a: FrontEnd~~~~                                     |
     |________________________________________________________________________*/
    static String lectorNumeros()
    {
        //VARIABLES LOCALES//
        /**
         * @param b es la base a la que cambiar el número n
         */
        int b;
        
        /**
         * @param n es el número en base decimal al que cambiar la base
         */
        int n;
        
        String numeroNuevo;
        Scanner in = new Scanner(System.in);
        //CUERPO DEL METODO//
        System.out.println("Introduzca numero a calcular la base: ");
        n = in.nextInt();
        do
        {
            System.out.println("Introduzca base a la que hacer el cambio: ");
            b = in.nextInt();
        }while(b <= 1);
        System.out.println("n: " + n + ", b: " + b);
        numeroNuevo = cambiar_base(n, b);
        return numeroNuevo;
    }
    
    
    /*_________________________________________________________________________
     | ~~~~Función del metodo:~~~~                                             |
     | Recibe un número en base decimal y lo devuelve cambiado de base         |
     | ~~~~Parámetros:~~~~                                                     |
     | n: el número decimal que se cambiará de base                            |
     | b: base nueva del número n                                              |
     | ~~~~Método dirigido a:  BackEnd~~~~                                     |
     |________________________________________________________________________*/
    static String cambiar_base(int n, int b)
    {
        //final int baseInicial = 10;
        String resultado = "";
        while(n >= b)
        {
            int modulo = n%b;
            
            if(modulo >= 10)
            {//TRANSFORMACION A LETRA DE LA CIFRA MODULO Y LO AÑADIMOS A LA CADENA//
                char caracter = (char)(modulo + 87);
                resultado = caracter + resultado;
                n/=b;
            }
            else
            {//AÑADIMOS MODULO A LA CADENA//
                resultado = modulo + resultado;
                n /= b;
            }
        }
        if(n >= 10)
        {//n es ahora el último dígito del nuevo número resultado. Si es mayor de 9, lo pasamos a letra//
            char caracter = (char)(n + 87);
            resultado = caracter + resultado;
            n/=b;
        }
        resultado = n + resultado;
        return resultado;
    }
}