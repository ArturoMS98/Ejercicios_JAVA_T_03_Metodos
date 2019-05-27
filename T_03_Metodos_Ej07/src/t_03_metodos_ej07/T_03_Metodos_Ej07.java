package t_03_metodos_ej07;
import java.util.Scanner;
 /***********************************************************************************************
 * @author baha                                                                                 *
 * <p>fecha de inicializacion: May 26, 2019 7:41:13 PM<p>                                       *
 * <p>fecha de finalizacion: May 26, 2019 8:44:13 PM<p>                                         *
 * <p>nombre del proyecto: T_03_Metodos_Ej07.java<p>                                            *
 * <p>Anteriores versiones en:</p>                                                              *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_Metodos.git">GIT</a></p>*
 ************************************************************************************************
 *                                                                                              *
 * <h1>Función de la clase:</h1>                                                                *
 * <p>7. Escribir un programa que tenga dos métodos que realicen las siguientes tareas:         *
 *     a) Devolver el valor del día de la semana en respuesta a la entrada de la letra inicial  *
 *        (mayúscula o minúscula) de dicho día.                                                 *
 *     b) Determinar el número de días de un mes.</p>                                           *
 * @version 1.0                                                                                 *
 * <p>Tiempo invertido en esta versión: 49 minutos (no coincide porque tardé en empezar)</p>    *
 *                                                                                              *
 ***********************************************************************************************/
public class T_03_Metodos_Ej07 {
                                                                                                
    /********************************************************************************************
    *                                                                                           *
    * <h1>MÉTODO MAIN</h1>                                                                      *
    * <p>Funcion:</p>                                                                           *
    * <p>Pedir los datos necesarios para la ejecución de los métodos, y ejecutarlos.</p>        *
    *                                                                                           *
    ********************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        Scanner in = new Scanner(System.in);
        String mes;
        char inicialDia;
        
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.println("Introduzca el nombre del mes:");
            mes = in.nextLine();
            
            System.out.println("Introduzca la inicial del día:");
            inicialDia = in.next().charAt(0);
            
        //BACKEND//
        System.out.println(DEVOLUCION_DIAS_MES + metodoCalculoDia(mes));
        System.out.println(DEVOLUCION_NOMBRE_DIA + metodoCalculoNombre(inicialDia));
    }
    private static final String DEVOLUCION_NOMBRE_DIA = "nombre del dia: ";
    private static final String DEVOLUCION_DIAS_MES = "dias del mes: ";
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                       |
     | <p>Calcular el dia de la semana a partir de la letra pasada por parámetro</p>            |
     | ~~~~<p>Parámetros:</p>~~~~                                                               |
     | @param inicial es la inicial del día de la semana a devolver.                            |
     | @return el día de la semana correspondiente a la inicial pasada.                         |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                              |
     |_________________________________________________________________________________________*/
    private static String metodoCalculoNombre (char inicial)
    {
        //VARIABLES LOCALES//
        final String lunes = "Lunes";
        final String martes = "Martes";
        final String miercoles = "Miércoles";
        final String jueves = "Jueves";
        final String viernes = "Viernes";
        final String sabado = "Sábado";
        final String domingo = "Domingo";
        //CUERPO DEL METODO//
        switch(inicial)
        {
            case 'L': return lunes;
            case 'l': return lunes;
            case 'M': return martes;
            case 'm': return martes;
            case 'X': return miercoles;
            case 'x': return miercoles;
            case 'J': return jueves;
            case 'j': return jueves;
            case 'V': return viernes;
            case 'v': return viernes;
            case 'S': return sabado;
            case 's': return sabado;
            case 'd': return domingo;
            case 'D': return domingo;
            default: return "ERROR DE INTRODUCCIÓN";
        }
    }
    
    /**_________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                       |
     | <p>Determina el número de días del mes a pasar por parámetro</p>                         |
     | ~~~~<p>Parámetros:</p>~~~~                                                               |
     | @param nombre es el nombre del mes recibido.                                             |
     | @return el número de días que tiene el mes.                                              |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                              |
     |_________________________________________________________________________________________*/
    static int metodoCalculoDia (String nombre)
    {
        //VARIABLES LOCALES//
        final int dia31 = 31;
        final int dia30 = 30;
        final int diafebrero = 28;
        //CUERPO DEL METODO//
        nombre = nombre.trim();
        nombre = nombre.toLowerCase();
        switch(nombre)
        {
            case "enero": return dia31;
            case "febrero": return diafebrero;
            case "marzo": return dia31;
            case "abril": return dia30;
            case "mayo": return dia31;
            case "junio": return dia30;
            case "julio": return dia31;
            case "agosto": return dia31;
            case "septiembre": return dia30;
            case "octubre": return dia31;
            case "noviembre": return dia30;
            case "diciembre": return dia31;
            default: 
            {
                System.out.println(MENSAJE_ERROR_INTRODUCCION);
                return 0;
            }
        }
    }
    private static final String MENSAJE_ERROR_INTRODUCCION = "ERROR DE INTRODUCCIÓN EN EL NOMBRE DEL MES";
}