package Exception;

public class LoginException extends RuntimeException {

    public LoginException (String message){
        super("");
    }

    public void UserInvalidoExcepction(){
        LoginException("User inválido");
    }

    private void LoginException(String string) {
    }

    
}
