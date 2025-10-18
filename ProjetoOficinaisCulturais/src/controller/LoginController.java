
package controller;

import model.Usuario;
import java.util.ArrayList;


public class LoginController {
    
   


    private Persistencia persistencia;

    public LoginController() {
        this.persistencia = new Persistencia();
    }

    public boolean validarLogin(String login, String senha) {
        
        ArrayList<Usuario> usuarios = persistencia.importarUsuarios("usuarios.txt");

        
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                return true; 
            }
        }
        return false; 
    }


}
