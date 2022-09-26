public class Cliente extends Pessoa{  

    public Cliente(String nome, String user, int senha) {
        super(nome, user, senha);
    }

    public void menu() {
        String meunome="duda", email="@";
        int senha = 123; //input pro usuario colocar as informações
        //CHAMAR SUPERCLASSE:
        //Pessoa pessoa = new Pessoa(meunome, email, senha);
        //só vai herdar da superclasse Pessoa
    }

}
 