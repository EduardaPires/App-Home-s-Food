public class Pessoa {
    //atributos que cliente e cozinheiros tem em comum
    String nome;
    String email;
    int senha;

    //construtor(inicializar as variaveis de instancia)
    public Pessoa(String nome, String email, int senha){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public int senha(){
        return this.senha;
    }
    public void setSenha(int senha){
        this.senha=senha;
    }

}
