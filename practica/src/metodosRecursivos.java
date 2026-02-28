package src;

import java.util.Scanner;

public class metodosRecursivos {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int e = 2;
        int n1 = 3;
        int n2 = 3;
        int  [] array= {1, 2, 3, 4, 5};
        int indice = 0;

        System.out.println("Ingrese la posicion de la sucesion Fibonacci: ");
        int posicion = sc.nextInt();
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();


        System.out.println("Suma Arreglo Metodo: " + Suma(n));

        System.out.println("Factorial Metodo: "+Factorial(n));

        System.out.println("Potenciacion Metodo: "+Potenciacion(n, e));

        System.out.println("El valor en la posicion " + posicion + " es: " + Fibonacci(posicion));

        System.out.println("Multiplicacion metodo: " + Multiplicacion(n1, n2));

        System.out.println("La suma del arreglo es: "+ sumaArreglo(array, array.length));

        if(esPar(numero) == true){
            System.out.println("El numero proporcionado es par");
        }
        else{
            System.out.println("El numero proporciona es impar");
        }

        if(esPalindromo(palabra)==false){
            System.out.println("La palabra proporcionda no es palindromo");
        }else{
            System.out.println("La palabra proporcionada es palindromo");
        }

        if(buscarElemento(array, indice, numero)>0){
            System.out.println("El numero proporcionado: "+numero+". Se encuentra en la posicion "+buscarElemento(array, indice, numero)+" del arreglo.");
        }else{
            System.out.println("El numero proporcionado no se encuentra en el arreglo");
        }

        


        sc.close();
    }

    public static int Suma(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n += Suma(n - 1);

        }
    }

    public static int Factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n *= Factorial(n - 1);
        }
    }

    public static int Potenciacion(int n, int e){
        if (e==0) {
            return 1;
        }
        else{
            return n *= Potenciacion(n, e-1);
        }

    }
    public static int Fibonacci(int n){ 
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static int Multiplicacion(int n, int e){
        if(e == 0){
            return 0;
        }
        else{
            return n+= Multiplicacion(n, e-1);
        }
    }

    public static int sumaArreglo(int [] arreglo, int n){
        if(n == 0){
            return 0;
        }
        else{
            return arreglo[n-1] + sumaArreglo(arreglo, n-1);
        }

    }

    public static boolean esPar(int n){
        if(n == 0){
            return true;
        }
        if(n == 1){
            return false;
        }else
            {
            return esPar(n - 2);
        }

    }

    public static boolean esPalindromo(String palabra){
        if(palabra.length()<=1){
            return true;
        }
        if(palabra.charAt(0) != palabra.charAt(palabra.length()-1)){
            return false;
        }
        return esPalindromo(palabra.substring(1, palabra.length()-1));

    }

    public static int buscarElemento(int [] numeros, int i, int n){
        if(i >= numeros.length){
            return -1;
        }
        if(numeros[i]==n){
            return i;

        }else{
            return buscarElemento(numeros, i+1, n );
        }
     
    }



}
