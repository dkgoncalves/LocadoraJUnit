package local.model;

import local.exception.FilmeException;

public class Filme {


    private String nome;
    private Integer estoque;
    private Double precoLocacao;

    public Filme() {
    }

    public Filme(String nome, Integer estoque, Double precoLocacao) {
        this.nome = nome;
        this.estoque = estoque;
        this.precoLocacao = precoLocacao;
    }
    
    public void setNome(String nome) {
        if(nome.length() < 1){
            throw new FilmeException("Nome deve possuir no minimo 2 caracteres");
        }else if(nome.length() > 98) {
            throw new FilmeException("Nome deve possuir no máximo 99 caracteres");
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setEstoque(Integer estoque) {
        if(estoque < 0 || estoque > 99){
            throw new FilmeException("Quantidade do filme não pode ser menor que 0");
        } else if(estoque > 98) {
            throw new FilmeException("Quantidade do filme não pode ser maior que 99");
        }
    }
    
    public Integer getEstoque() {
        return estoque;
    }

    public Double getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(Double precoLocacao) {
        if(precoLocacao.doubleValue() < 1.00){
            throw new FilmeException("Valor minimo do filme é R$1,00");
        } else if(precoLocacao.doubleValue() > 9.99) {
            throw new FilmeException("Valor máximo do filme é R$9,99");
        }
    }
}
