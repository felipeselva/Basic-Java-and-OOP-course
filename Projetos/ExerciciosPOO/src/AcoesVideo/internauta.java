
package AcoesVideo;


public class internauta extends Pessoa {
    
    private String login;
    private int totAssistido;

    public internauta(String login, String nome, String sexo, int idade, int experiencia) {
        super(nome, sexo, idade, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }

    
    
    
    
    
    public void ViuMaisum (){
    
}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "internauta{"  + super.toString()+ "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
}
