package teste.exercicios;

public class SegundoExercicio {

    public boolean resposta(int numero) {
        if (numero < 0) {
            return false;
        }

        int num1 = 0, num2 = 1;

        while (num1 <= numero) {
            if (num1 == numero) {
                return true;
            }
            num1 = num2;
            num2 = num1 + num2;
        }
        return false;
    }
}

