package bean;

public class Cidade {
    private Integer cd_cidade;
    private String nome;
    private Estado estado;

    public Integer getCd_cidade() {
        return cd_cidade;
    }

    public void setCd_cidade(Integer cd_cidade) {
        this.cd_cidade = cd_cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
