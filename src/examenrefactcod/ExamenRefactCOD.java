package examenrefactcod;

public class ExamenRefactCOD {

    public static boolean valorCorrecto = false;

    public static void main(String arg[]) {
        int numDigitos = 3;
        int numeroDigitosActual = 0;
        if (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int auxiliar = i;

            int contador = 0;

            while (auxiliar != 0) {
                auxiliar = auxiliar / 10;
                contador++;
            }
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
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            valorCorrecto = true;
                        }
                    }
                }

                if (valorCorrecto == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
