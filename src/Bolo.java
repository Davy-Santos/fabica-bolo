public class Bolo {
    String sabor;
    int tamanho;

    //Construtor(forno)
    public Bolo(String sabor, int tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    //Método para exibir bolo pronto
    public void exibirDetalhes(){
        System.out.println("Bolo de " + sabor+ "de tamanho" + tamanho + "cm.");
    }
}