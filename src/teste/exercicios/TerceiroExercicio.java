package teste.exercicios;

public class TerceiroExercicio {

    public void resposta() {

        double[] faturamentoDiario = {
                1200.50, 1500.30, 1700.00, 1100.75, 1400.20,
                1300.10, 2000.50, 1800.25, 1600.40, 2100.85,
                1900.00, 2200.30, 1500.00, 1250.90, 1350.40,
                1450.60, 1550.50, 1650.75, 1750.20, 1850.10,
                1950.30, 2050.40, 2150.50, 2250.60, 2350.70,
                2450.80, 2550.90, 2650.00, 2750.10, 2850.20
        };

        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        double somaFaturamento = 0;

        for (double faturamento : faturamentoDiario) {
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            } else if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            somaFaturamento += faturamento;
        }

        double mediaFaturamento = somaFaturamento / faturamentoDiario.length;
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }
        System.out.printf("""
                O menor faturamento foi: %.2f
                O maior faturamento foi: %.2f
                Dias acima da média: %d
                """,menorFaturamento,maiorFaturamento,diasAcimaDaMedia);
    }
}
