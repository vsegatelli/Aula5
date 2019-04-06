package br.com.digitalhouse;

public class Dono {

    private String nome;
    public String sexo;

    // Construtor especifico
    public Dono(String novoNome) {
        nome = novoNome;
    }
//Construtor padrao
    public Dono(){

    }

    //método alimentar
    public void alimentar(Cachorro novoCachorro) {
        System.out.println("Olá " + novoCachorro.nome);
    }

    // Get - Acessor
    public String getNome() {
        return nome;
    }

    //Set - Modificador
    public void setNome(String novoNome) {
        nome = novoNome;

    }
}

