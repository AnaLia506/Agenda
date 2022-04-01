package Tarea1PW;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tarea {
    public static void main (String[] args) {

        Scanner tec = new Scanner(System.in);
        String nombre, email, numero;
        char opcion;
        String[] Nombre = new String[259];
        String[] Telefono = new String[259];
        String[] Mail = new String[259];
         do {
            System.out.println("----------------------------------AGENDA DE ANA-------------------------------------");
            System.out.println("************************************************************************************");
            System.out.println("*                               ELIJA UNA OPCION                                   *");
            System.out.println("*  1- ¿Quieres [I]ngresar un nuevo contacto o [C]onsultar un contacto ya existente?*");
            System.out.println("*  2- [S]alir                                                                        *");
            System.out.println("************************************************************************************");
            opcion = tec.nextLine().charAt(0);

            switch (opcion) {
                case 'I':
                    System.out.println("Ingrese el nombre");
                    nombre = tec.nextLine();
                    for (int n = 0; n<= Array.getLength(Nombre); n++){
                        Nombre[n] = (nombre);
                    }
                    System.out.println("Ingrese el numero");
                    numero = tec.nextLine();
                    for (int t = 0; t<= Array.getLength(Telefono); t++){
                        Telefono[t] = (numero);
                    }
                    System.out.println("Agregue el email(opcional)");
                    email = tec.nextLine();
                    for (int m = 0; m<= Array.getLength(Mail); m++){
                        Mail[m] = (email);
                    }
                break;

                case 'C': 
                    System.out.println("Ingresa el nombre que deseas buscar");
                    nombre = tec.nextLine();
                break;
            }


         }while(true); 



    }
}