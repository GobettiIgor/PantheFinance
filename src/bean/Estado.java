package bean;

public class Estado {
    private Integer cd_estado;
    private String nome;
    private String uf;

    public Integer getCd_estado() {
        return cd_estado;
    }

    public void setCd_estado(Integer cd_estado) {
        this.cd_estado = cd_estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
