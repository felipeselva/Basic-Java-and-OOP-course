
package controller;

import model.Usuario;

public class UsuarioController {
   
    

    public void cadastrarUsuario(String nome, String login, String senha) {
        
        Usuario novoUsuario = new Usuario(nome, login, senha);

     
        Persistencia persistencia = new Persistencia();

      
        
        persistencia.salvarNovoUsuario(novoUsuario, "usuarios.txt");
    }

    // Futuramente, podemos mover o método de validarLogin para cá também!
}
