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
 * <p>version 1.0:</p>                                                                          *
 * <p>Tiempo invertido en esta versión: 0 horas 41 minutos</p>                                  *
 * @version 1.1                                                                                 *
 * <p>Tiempo invertido en esta versión: 5 horas 16 minutos</p>                                  *
 * <p>Aún no me creo que haya funcionado tal que así :') tras apenas un par de errores de los   *
 * arrays out of bounds por el último método creado (estaba cansado ^^) lo he ejecutado y,      *
 * excepto por el pequeño error de que se permitía repetir V, L, o D, que no tardé en           *
 * solucionar, FUNCIONABA A LA PERFECCIÓN! aún sigo flipando. Menos mal que he ido clarificando *
 * todos los caminos posibles en cada caso, porque rehacer TODO ESTO o buscar bugs en este      *
 * pedazo de monstruo habría sido una tarea un tanto "ardua" JAJAJAJ                            *
 * Pero todo está bien! Quien la sigue la consigue! TENACIDAD my friend. y palante! BUAH por    *
 * fin puedo ir a dormir jajajajajjaja aunque debería practicar bases de datos que pasado       *
 * mañana es el examen... bah comparado con esto, eso no es nada muahahahahahaahahaahha</p>     *
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
     | <p>Además, también comprueba que el número romano introducido sigue las reglas           |
     |    y es un número romano correcto. Por ejemplo, VM no es 995.</p>                        |
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
            int contadorCaracteresSeguidos = 0;     //Hay un máximo de 3 caracteres seguidos de una misma letra//
            centinela = false;
            //PETICION DE CADENA//
            System.out.print("Introduzca un número romano: ");
            cadenaRomana = in.nextLine();
            //Transformamos la cadena para operar con ella//
            cadenaRomana = cadenaRomana.toLowerCase();
            
            //AQUI VIENE LO CHUNGOO HUAHAHA GAME ON BITCHES//
            //Comprobación de datos introducidos//
            for(int i = 0; i < cadenaRomana.length(); i++)
            {
                int codigoCaracterSiguiente;
                int codigoCaracterAnterior;
                
                //USAMOS CODIFICACION DEL 0 AL 7// 0->error; 1-7 -> I-M;
                int codigoCaracterActual = codificadorCaracterRomano(cadenaRomana.charAt(i));
                
                if(codigoCaracterActual == 0)
                {
                    System.out.println(MENSAJE_ERROR_SINTAXIS);
                    System.out.println(POSICION_ERROR + (i+1));
                    centinela = mensajeError();
                    break;
                }
                else
                {//Sintaxis correcta. Todos los caracteres son caracteres de números romanos//
                    //CASO 1: Antes del último carácter de la cadena//
                    if((i+1) < cadenaRomana.length())
                    {
                        codigoCaracterSiguiente = codificadorCaracterRomano(cadenaRomana.charAt(i+1));
                        if(codigoCaracterSiguiente >= codigoCaracterActual)
                        {//Si el carácter siguiente es menor que el anterior, no hay problema? JAJAJA si que lo hay vaya que si//
                            if(codigoCaracterSiguiente == codigoCaracterActual)
                            {
                                contadorCaracteresSeguidos++;
                                if(contadorCaracteresSeguidos > 3)
                                {
                                    System.out.println(ERROR_EXCESO_REPETICION_CARACTERES);
                                    centinela = mensajeError();
                                    break;
                                }
                                if(codigoCaracterActual%2 == 0)
                                {
                                    System.out.println("Error, un número romano no puede sumar repetidamente V, L ni D");
                                    centinela = mensajeError();
                                    break;
                                }
                            }
                            else
                            {//El siguiente número es mayor que el actual//
                                contadorCaracteresSeguidos = 0;
                                if(codigoCaracterActual % 2 == 0)
                                {
                                    System.out.println(ERROR_INTENTO_RESTAR_VLD);
                                    centinela = mensajeError();
                                    break;
                                }
                                else if(((codigoCaracterSiguiente -2) != codigoCaracterActual) && ((codigoCaracterSiguiente -1) != codigoCaracterActual))
                                {//El siguiente no es ni uno ni dos grados mayor//
                                    System.out.println(INTENTO_RESTAR_INVALIDO);
                                    centinela = mensajeError();
                                    break;
                                }
                            }
                        }
                        else
                        {//El carácter siguiente es menor que el anterior//
                            contadorCaracteresSeguidos = 0;
                            //Comprobamos si el número al que pertenecemos ha sido una resta//
                            if(i >= 1)
                            {//A partir del segundo carácter, es posible que el número haya sido una resta//
                                codigoCaracterAnterior = codificadorCaracterRomano(cadenaRomana.charAt(i-1));
                                if(codigoCaracterAnterior < codigoCaracterActual)
                                {//Si fue resta//
                                    codigoCaracterSiguiente = codificadorCaracterRomano(cadenaRomana.charAt(i+1));
                                    if((codigoCaracterActual - 2) <= codigoCaracterSiguiente)
                                    {
                                        System.out.println(ERROR_RE_SUMAR_RESTADO);
                                        centinela = mensajeError();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    else//CASO 2: En el último carácter de la cadena//
                    {
                        if(i > 0)
                        {
                            System.out.println("caracter: " + cadenaRomana.charAt(i-1));
                            codigoCaracterAnterior = codificadorCaracterRomano(cadenaRomana.charAt(i-1));
                            if(codigoCaracterAnterior < codigoCaracterActual)
                            {//HA SIDO RESTA//
                                if((codigoCaracterActual != (2+codigoCaracterAnterior)) && (codigoCaracterActual != (1+codigoCaracterAnterior)))
                                {
                                    System.out.println(INTENTO_RESTAR_INVALIDO);
                                    centinela = mensajeError();
                                    break;
                                }
                            }
                            else if(codigoCaracterAnterior == codigoCaracterActual)
                            {
                                contadorCaracteresSeguidos++;
                                if(contadorCaracteresSeguidos > 3)
                                {
                                    System.out.println(ERROR_EXCESO_REPETICION_CARACTERES);
                                    centinela = mensajeError();
                                    break;
                                }
                            }
                            else
                                System.out.println("Sin errores! ^-^");
                        }
                    }
                }
            }
        }while(centinela);
        return cadenaRomana.toUpperCase();
    }

    /**_________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                       |
     | <p>Dado el número de caminos de error en este programa, decido sacarlo afuera del        |
     |    método principal, para mayor claridad.</p>                                            |
     | ~~~~<p>Parámetros:</p>~~~~                                                               |
     | @return Un booleano true para permitir la salida del programa.                           |
     | ~~~~<p>Método dirigido a: BackEnd  </p>~~~~                                              |
     |_________________________________________________________________________________________*/
    private static boolean mensajeError() {
        boolean centinela;
        System.out.println(MENSAJE_ERROR_INTRODUCCION_NUMERO);
        centinela = true;
        return centinela;
    }
    private static final String ERROR_RE_SUMAR_RESTADO = "No se puede sumar la misma cantidad que se ha restado anteriormente";
    private static final String ERROR_INTENTO_RESTAR_VLD = "Error de sintaxis: a un número romano no se le puede restar V, L o D";
    private static final String MENSAJE_ERROR_INTRODUCCION_NUMERO = "Introduzca un número válido, por favor.";
    private static final String ERROR_EXCESO_REPETICION_CARACTERES = "Se introdujeron más de 3 mismas letras seguidas.";
    private static final String POSICION_ERROR = "Error en el caracter ";
    private static final String MENSAJE_ERROR_SINTAXIS = "El número romano sólo puede contener los caracteres [I,X,V,L,C,D,M]";
    private static final String INTENTO_RESTAR_INVALIDO = "Error de sintaxis: a un número romano "
            + "sólo se le pueden restar I cuando el siguiente "
            + "número es V o X, X cuando el siguiente número es"
            + " V o C, o C cuando el siguiente número es D o M";
    
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
        cadena = cadena.toLowerCase();
        int numeroArabigo = 0;
        for(int i = 0; i < cadena.length(); i++)
        {
            int caracterActual = codificadorCaracterRomano(cadena.charAt(i));
            if(i < cadena.length()-1)
            {
                int caracterSiguiente = codificadorCaracterRomano(cadena.charAt(i+1));
                if(caracterActual >= caracterSiguiente)
                {
                    switch(caracterActual)
                    {
                        case 1: numeroArabigo++;
                        break;
                        case 2: numeroArabigo += 5;
                        break;
                        case 3: numeroArabigo += 10;
                        break;
                        case 4: numeroArabigo += 50;
                        break;
                        case 5: numeroArabigo += 100;
                        break;
                        case 6: numeroArabigo += 500;
                        break;
                        case 7: numeroArabigo += 1000;
                        break;
                    }
                }
                else
                {
                    switch(caracterActual)
                    {
                        case 1: numeroArabigo--;
                        break;
                        case 3: numeroArabigo -= 10;
                        break;
                        case 5: numeroArabigo -= 100;
                        break;
                    }
                }
            }
            else
            {
                switch(caracterActual)
                {
                    case 1: numeroArabigo++;
                    break;
                    case 2: numeroArabigo += 5;
                    break;
                    case 3: numeroArabigo += 10;
                    break;
                    case 4: numeroArabigo += 50;
                    break;
                    case 5: numeroArabigo += 100;
                    break;
                    case 6: numeroArabigo += 500;
                    break;
                    case 7: numeroArabigo += 1000;
                    break;
                }
            }
        }
        return numeroArabigo;
    }
    /**_________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                       |
     | <p>Codificar el carácter romano según una numeración ordenada de 0 a 7</p>               |
     | ~~~~<p>Parámetros:</p>~~~~                                                               |
     | @param caracterRomano es el carácter recibido que se debe codificar.                     |
     | @return El número correspondiente según la codificación                                  |
     | ~~~~<p>Método dirigido a: BackEnd  </p>~~~~                                              |
     |_________________________________________________________________________________________*/
    static int codificadorCaracterRomano(char caracterRomano)
    {
        switch(caracterRomano)
        {
            case 'i': return 1;
            case 'v': return 2;
            case 'x': return 3;
            case 'l': return 4;
            case 'c': return 5;
            case 'd': return 6;
            case 'm': return 7;
            default: return 0;
        }
    }
}