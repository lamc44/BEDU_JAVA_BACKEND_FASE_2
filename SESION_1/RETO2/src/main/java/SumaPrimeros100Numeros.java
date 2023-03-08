public class SumaPrimeros100Numeros{
    public static void main(String[] args){
        int total = 0;
        for(int indice = 1; indice <= 100; indice++){
            total += indice;
        }
        System.out.println("La suma de los primeros 100 numeros es: " + total);
    }
}