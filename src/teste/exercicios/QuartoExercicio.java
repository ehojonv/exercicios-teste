package teste.exercicios;

public class QuartoExercicio {

    public void resposta() {
        double OUTROS = 19849.53;
        double ES = 27165.48;
        double MG = 29229.88;
        double RJ = 36678.66;
        double SP = 67836.43;

        double total = SP + RJ + MG + ES + OUTROS;

        double porcentagemSP = 100 * (SP / total);
        double porcentagemRJ = 100 * (RJ / total);
        double porcentagemMG = 100 * (MG / total);
        double porcentagemES = 100 * (ES / total);
        double porcentagemOutros = 100 * (OUTROS / total);

        System.out.printf("""
                %% de SP: %.2f
                %% de RJ: %.2f
                %% de MG: %.2f
                %% de ES: %.2f
                %% dos Outros: %.2f""",porcentagemSP,porcentagemRJ,porcentagemMG,porcentagemES,porcentagemOutros);
    }









}
