package examenrefactcod;

public class ExamenRefactCOD {

    public static boolean valorCorrecto = false;

    public static void main(String arg[]) {
        Metodos metodos = new Metodos();
        int numDigitos = 3;
        int numeroDigitosActual = 0;
        metodos.digitos0(numDigitos);
                for (int i = 1; i <= 99999; i++) {
            int auxiliar = i;
            int contador = 0;

            contador = metodos.bucle1(auxiliar, contador);
            numeroDigitosActual = contador;

            if (numeroDigitosActual == numDigitos) {
                if (i < 4) {
                    valorCorrecto = true;
                } else {
                    if (i % 2 == 0) {
                        valorCorrecto = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        metodos.par(k);
                        metodos.bucle2(i1,k,contador1,i);
                    }    
                }

                if (valorCorrecto == true) {
                    metodos.imprimirNUM(i);
                }
            }
        }
    }

}
