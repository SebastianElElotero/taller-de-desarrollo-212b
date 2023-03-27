import java.util.Scanner;

public class BisectionMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, fa, fb, fc, tol;
        int n;

        // Pedimos los valores iniciales
        System.out.println("Ingresa el valor de a: ");
        a = sc.nextDouble();

        System.out.println("Ingresa el valor de b: ");
        b = sc.nextDouble();

        System.out.println("Ingresa el numero maximo de iteraciones: ");
        n = sc.nextInt();

        System.out.println("Ingresa la tolerancia: ");
        tol = sc.nextDouble();

        // Verificamos que el intervalo [a, b] contenga una raíz
        fa = f(a);
        fb = f(b);

        if (fa * fb >= 0) {
            System.out.println("El intervalo no contiene una raiz.");
            return;
        }

        // Aplicamos el método de bisección
        for (int i = 1; i <= n; i++) {
            c = (a + b) / 2;
            fc = f(c);

            if (Math.abs (fc) < tol) {
                System.out.println("La raiz es " + c);
                return;
            }

            if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }
        }

        System.out.println("No se pudo encontrar la raiz en " + n + " iteraciones.");
    }

    // Definimos la función f(x)
    public static double f(double x) {
        return Math.pow(x, 3) - 2 * x - 5;
    }
}