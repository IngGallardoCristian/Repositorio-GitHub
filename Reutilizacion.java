import java.util.Scanner;

public class Reutilizacion {
    public static Double ingresarDecimal(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static boolean ingresarBoolean(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextBoolean();
    }

    public static int ingresarEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    public static String ingresarTexto(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    //funcion para ingresar un arreglo de textos
    public static String[] ingresarArregloTexto(int cantidad, String mensaje){
        String [] nuevoArreglo = new String[cantidad];
        for  (int i = 0 ; i<cantidad ; i++){
            nuevoArreglo [i] = ingresarTexto(mensaje+"("+(i+1)+" de " + cantidad + ") : " );
        }
        return nuevoArreglo;
    }

    //funcion para ingresar un arreglo de enteros
    public static int[] ingresarArregloEntero(int cantidad, String mensaje) {
        int[] nuevoArreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nuevoArreglo[i] = ingresarEntero(mensaje+"("+(i+1)+" de " + cantidad + ") : " );
        }
        return nuevoArreglo;
    }

    //funcion para ingresar un arreglo de decimales
    public static double[] ingresarArregloDecimal(int cantidad, String mensaje) {
        double[] nuevoArreglo = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            nuevoArreglo[i] = ingresarDecimal(mensaje+"("+(i+1)+" de " + cantidad + ") : " );
        }
        return nuevoArreglo;
    }


    public static char ingresarCaracter(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.next().charAt(0);
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarPares() {
        int a = 1;
        while (a < 10) {
            a += 2;
            String mensaje = "Los numeros pares del 1 al 10 son: " + a;
            Reutilizacion.mostrarMensaje(mensaje);
        }
    }

    public static int sumarCuadrados(int num1, int num2) {
        int acumulador = 0;
        int i = num1;
        while (i <= num2) {
            acumulador = acumulador + i * i;
            i++;
        }
        return acumulador;
    }

    public static void contarParesEImpares(int inicio, int numfinal) {
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = inicio; i <= numfinal; i++) {
            if (i % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        String mensaje = "La cantidad de impares del 1 al 9 es: " + contadorImpares +
                " y la cantidad de pares es: " + contadorPares;
        Reutilizacion.mostrarMensaje(mensaje);
    }

    public static void mostrarResultado() {
        for (int b = 0; b <= 10; b += 2) {
            int c = (3 * b) + 5;


            String mensaje = (b + "," + c);
            Reutilizacion.mostrarMensaje(mensaje);
        }
    }

    public static void mostrarNumeros(int nummm) {
        for (int i = 0; nummm < 10; nummm++) {
            Reutilizacion.mostrarMensaje("Numero: " + nummm);
        }
    }

    public static int leerVocales(String name) {
        int acumulador = 0;
        for (int i = 0; i < name.length(); i++) {
            char letras = name.charAt(i);
            if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
                acumulador++;
            }
        }
        return acumulador;
    }

    public static boolean validarVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    public static int determinarMayor(int numero) {
        int mayor = 0;
        int i = numero;
        while (i > 0) {
            int digito = i % 10;
            if (digito > mayor) {
                mayor = digito;
            }
            i = i / 10;
        }
        return mayor;
    }

    public static int sacarMenor(int numero) {
        int menor = 9;
        int i = numero;
        while (i > 0) {
            int digito = i % 10;
            if (digito < menor) {
                menor = digito;
            }
            i = i / 10;
        }
        return menor;
    }

}

