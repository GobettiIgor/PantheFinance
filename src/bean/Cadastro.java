package bean;

public class Cadastro {
    private Integer cd_cadastro;
    private String cpf_cnpj;
    private String nome;
    private String cep;
    private String rua;
    private Integer numero;
    private String bairro;
    private Cidade cidade;
    private Contato contato;
    private String genero;

    public Integer getCd_cadastro() {
        return cd_cadastro;
    }

    public void setCd_cadastro(Integer cd_cadastro) {
        this.cd_cadastro = cd_cadastro;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "cd_cadastro=" + cd_cadastro +
                ", cpf_cnpj='" + cpf_cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", cidade=" + cidade +
                ", contato=" + contato +
                ", genero='" + genero + '\'' +
                '}';
    }
}
