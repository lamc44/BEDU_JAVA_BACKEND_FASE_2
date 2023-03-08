public class Calculadora {
    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }

    public float dividir(float a, float b){

        if(b == 0){
            throw new IllegalArgumentException("El divisor no puede ser 0");
        }

        return a / b;
    }
}
