package classes;

public class Candidato {

    private int numero;
    private String nome;
    private String vice;
    private String partido;
    private String foto;
    private String fotovice;
    private String votos;
    
public Candidato(){
         this.numero = 0;
         this.nome = "";
         this.vice = "";
         this.partido = "";
         this.foto = "";
         this.fotovice = "";
         this.votos= "";
         
     }
    
    public Candidato(int numero, String nome, String vice, String partido, String foto, String fotovice, String votos){
         this.numero = numero;
         this.nome = nome;
         this.vice = vice;
         this.partido = partido;
         this.foto = foto;
         this.fotovice = fotovice;
         this.votos = votos;
         
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVice() {
        return vice;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFotovice() {
        return fotovice;
    }

    public void setFotovice(String fotovice) {
        this.fotovice = fotovice;
    }

    public String getVotos() {
        return votos;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

}
