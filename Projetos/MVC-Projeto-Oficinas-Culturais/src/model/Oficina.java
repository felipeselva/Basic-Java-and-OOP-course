
package model;


public class Oficina {
    private String nome;
    private String area;
    private String data;
    private String status; 

    public Oficina(String nome, String area, String data, String status) {
        this.nome = nome;
        this.area = area;
        this.data = data;
        this.status = status;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
    
    

