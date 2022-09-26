public class Cliente {
    private String nomeUser;
    private String email;
    private int senha;

    public Cliente(String nomeUser, String email, int senha){
        this.nomeUser=nomeUser;
        this.email=email;
        this.senha=senha;
    }    

    public void SetnomeUser(String nome) {
        this.nomeUser = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }  
    
    public String getEmail() {
        return email;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public int getSenha() {
        return senha;
    }

    public void menu() {
        String meunome="duda";
        //SetnomeUser setnomeUser = new SetnomeUser(meunome);
    }

}
 