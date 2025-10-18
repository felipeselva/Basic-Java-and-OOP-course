package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Oficina;
import model.Usuario;

public class Persistencia {


    public ArrayList<Usuario> importarUsuarios(String nomeArquivo) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            
            while ((linha = br.readLine()) != null) {
               
                String[] dados = linha.split(";");

                
                if (dados.length == 3) {
                    Usuario u = new Usuario(dados[0], dados[1], dados[2]);
                    usuarios.add(u);
                }
            }
        } catch (IOException e) {
            
            System.err.println("Erro ao ler o arquivo de usuários: " + e.getMessage());
        }

        return usuarios;
    }

  
    
    public void salvarNovoUsuario(Usuario usuario, String nomeArquivo) {
        
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
           
            String linha = usuario.getNome() + ";" + usuario.getLogin() + ";" + usuario.getSenha();

            bw.newLine(); 
            bw.write(linha); 

        } catch (IOException e) {
            System.err.println("Erro ao salvar novo usuário: " + e.getMessage());
        }
    }

    
    
    
    public  ArrayList<Oficina> importarOficinas(String nomeArquivo) {
        
ArrayList<Oficina> oficinas = new ArrayList<>();
    

try (BufferedReader leitor = new BufferedReader (new FileReader(nomeArquivo))){
    String linha;
    
    while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(";");
               
                if (dados.length == 4) {
                    oficinas.add(new Oficina(dados[0], dados[1], dados[2], dados[3]));
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de oficinas: " + e.getMessage());
        }
        return oficinas;
    }
    
    
    public void salvarAlteracoesOficinas(ArrayList<Oficina> listaOficinas, String nomeArquivo) {
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo, false))) {
            
            for (Oficina oficina : listaOficinas) {
                
                String linha = oficina.getNome() + ";" + oficina.getArea() + ";" + oficina.getData() + ";" + oficina.getStatus();
                
                escritor.write(linha);
               
                escritor.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar alterações das oficinas: " + e.getMessage());
        }
    }
}
    

    
    
   


 