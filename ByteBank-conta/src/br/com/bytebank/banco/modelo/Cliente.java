package br.com.bytebank.banco.modelo;

public class Cliente {
    
    private String nome;
    private int cpf;
    private String profissao;

    public Cliente(String nome, int cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public Cliente() {
        
    }

    // GETTERS AND SETTERS
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
