package classes;


public class Eleitor {
    private String titulo;
    private String rg;
    private String nome;
    private String dataNasc;
    private String zona;
    private String secao;
    private String votou;
    private String foto;
    private String cidade;
    private String estado;
    
    public Eleitor(){
         this.titulo = "";
         this.rg = "";
         this.nome = "";
         this.dataNasc = "";
         this.zona = "";
         this.secao = "";
         this.votou = "";
         this.foto = "";
         this.cidade = "";
         this.estado = "";   
     }
    
    public Eleitor(String titulo, String rg, String nome, String dataNasc, String zona, String secao, String votou, String foto, String cidade, String estado){
         this.titulo = titulo;
         this.rg = rg;
         this.nome = nome;
         this.dataNasc = dataNasc;
         this.zona = zona;
         this.secao = secao;
         this.votou = votou;
         this.foto = foto;
         this.cidade = cidade;
         this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getVotou() {
        return votou;
    }

    public void setVotou(String votou) {
        this.votou = votou;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
