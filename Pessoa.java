public class Pessoa {
    //atributos que cliente e cozinheiros tem em comum
    private String nome, user;
    //String email;
    private int senha;
    

    //construtor(inicializar as variaveis de instancia)
    //public Pessoa(String nome, String user, int senha){
       // this.nome=nome;
       // this.email=email;
       // this.senha=senha;
    //}

    public Pessoa(String nome, String user, int senha) {  //construtor de pessoa (cozinheiro ou cliente)
        this.nome = nome;
        this.user = user;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public int getSenha() {
        return senha;
    }
    public String getUser() {
        return user;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public String toString(){
        return user + ": " + nome;
    }
}
