public class Voto {
    private Pesquisa pesquisa;
    private Candidatos candidatos;
    private int quantidade;


    public Voto(Pesquisa pesquisa, Candidatos candidatos, int quantidade) {
        this.pesquisa = pesquisa;
        this.candidatos = candidatos;
        this.quantidade = quantidade;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Candidatos getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidatos candidatos) {
        this.candidatos = candidatos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}