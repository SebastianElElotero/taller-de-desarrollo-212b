public class PruevaDeModuloFinal {
    public static void main(String[] args) {
        double a = 0;
        double b = 10;
        int numSections = 100;

        sectionInterval(a, b, numSections);
    }

    public static void sectionInterval(double a, double b, int numSections) {
        double stepSize = (b - a) / numSections;
        for (int i = 0; i < numSections; i++) {
            double start = a + i * stepSize;
            double end = start + stepSize;

            evaluateFunction(start, end);
        }
    }

    public static void evaluateFunction(double start, double end) {

        System.out.println("Evaluando la función en el intervalo (" + start + ", " + end + ")");
    }
}
