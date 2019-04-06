package br.com.digitalhouse;

public class Filho {
    private String pai;
    private String mae;
    private String nome;

    // construtor especifico
    public Filho (String nomeMae, String nomePai, String nomeFilho){
        mae = nomeMae;
        pai = nomePai;
        nome = nomeFilho;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }
}
