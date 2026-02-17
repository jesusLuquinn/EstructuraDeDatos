public class metodosRecursivos {

    public static void main(String[] args){
        int  n = 5;
        int e = 2;
        System.out.println(Suma(n));
        System.out.println(Factorial(n));
        System.out.println(Potenciacion(n, e));
        System.out.println(Fibonacci(n));
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

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
