package teste.exercicios;

public class QuintoExercicio {

    public void resposta(String texto) {

        String[] letras = texto.split("");

        for (int i = letras.length; i != 0; i--) {
            System.out.print(letras[i-1]);
        }
    }
}
