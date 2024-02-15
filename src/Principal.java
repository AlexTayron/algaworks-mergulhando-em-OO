public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Fusca";
        meuCarro.anoFabricacao = 2024;
        meuCarro.fabricante = "VW";
        meuCarro.cor = "Amarelo";


        Carro seuCarro = new Carro();
        seuCarro.modelo = "x6";
        seuCarro.anoFabricacao = 2024;
        seuCarro.fabricante = "BMW";
        seuCarro.cor = "Branco";

        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.println();
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
    }
}
