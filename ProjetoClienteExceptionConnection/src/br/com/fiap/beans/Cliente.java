package br.com.fiap.beans;

public class Cliente {
	private String nome;
    private int idade;
    private double altura;
    

    public Cliente() {
		super();
	}

	public Cliente(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Métodos de acesso (getters) para os atributos privados
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    // Métodos de modificação (setters) para os atributos privados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
