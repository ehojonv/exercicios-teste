package teste.exercicios.TerceiroExercicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TerceiroExercicio {

    public void resposta() {
        
        var json = """
                [
                {
                "dia": 1,
                "valor": 22174.1664
                },
                {
                "dia": 2,
                "valor": 24537.6698
                },
                {
                "dia": 3,
                "valor": 26139.6134
                },
                {
                "dia": 4,
                "valor": 0.0
                },
                {
                "dia": 5,
                "valor": 0.0
                },
                {
                "dia": 6,
                "valor": 26742.6612
                },
                {
                "dia": 7,
                "valor": 0.0
                },
                {
                "dia": 8,
                "valor": 42889.2258
                },
                {
                "dia": 9,
                "valor": 46251.174
                },
                {
                "dia": 10,
                "valor": 11191.4722
                },
                {
                "dia": 11,
                "valor": 0.0
                },
                {
                "dia": 12,
                "valor": 0.0
                },
                {
                "dia": 13,
                "valor": 3847.4823
                },
                {
                "dia": 14,
                "valor": 373.7838
                },
                {
                "dia": 15,
                "valor": 2659.7563
                },
                {
                "dia": 16,
                "valor": 48924.2448
                },
                {
                "dia": 17,
                "valor": 18419.2614
                },
                {
                "dia": 18,
                "valor": 0.0
                },
                {
                "dia": 19,
                "valor": 0.0
                },
                {
                "dia": 20,
                "valor": 35240.1826
                },
                {
                "dia": 21,
                "valor": 43829.1667
                },
                {
                "dia": 22,
                "valor": 18235.6852
                },
                {
                "dia": 23,
                "valor": 4355.0662
                },
                {
                "dia": 24,
                "valor": 13327.1025
                },
                {
                "dia": 25,
                "valor": 0.0
                },
                {
                "dia": 26,
                "valor": 0.0
                },
                {
                "dia": 27,
                "valor": 25681.8318
                },
                {
                "dia": 28,
                "valor": 1718.1221
                },
                {
                "dia": 29,
                "valor": 13220.495
                },
                {
                "dia": 30,
                "valor": 8414.61
                }
                ]
                """;

        var gson = new Gson();

        Type tipoListaFaturamento = new TypeToken<ArrayList<Faturamento>>(){}.getType();

        List<Faturamento> faturamentos = gson.fromJson(json, tipoListaFaturamento);

        List<Double> valorfaturamentoDiario  = new ArrayList<>();

        faturamentos.forEach(f -> valorfaturamentoDiario.add(f.getValor()));

        double menorFaturamento = valorfaturamentoDiario.getFirst();
        double maiorFaturamento = valorfaturamentoDiario.getFirst();
        double somaFaturamento = 0;

        for (Double faturamento : valorfaturamentoDiario) {
            if (faturamento == 0){
                continue;
            } else if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            } else if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            somaFaturamento += faturamento;
        }

        double mediaFaturamento = somaFaturamento / valorfaturamentoDiario.size();
        int diasAcimaDaMedia = 0;
        for (double faturamento : valorfaturamentoDiario) {
            if (faturamento > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }
        System.out.printf("""
                O menor faturamento foi: R$%.2f
                O maior faturamento foi: R$%.2f
                Dias acima da média: %d""",menorFaturamento,maiorFaturamento,diasAcimaDaMedia);
    }
}
