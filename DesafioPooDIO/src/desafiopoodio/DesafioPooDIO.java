
package desafiopoodio;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;


public class DesafioPooDIO {

   
    public static void main(String[] args) {
       
        Curso curso = new Curso();
        
        
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);
        
         Curso curso2 = new Curso();
        
        
        curso.setTitulo("Curso JavaScript");
        curso.setDescricao("Descrição curso JavaScript");
        curso.setCargaHoraria(8);
        
        Mentoria mentoria = new Mentoria();
        
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java Descrição");
        mentoria.setData(LocalDate.now());
        
        
        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        */
        
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descricao BootCamp Java Developer");
        bootcamp.getConteudos().add(curso);
                bootcamp.getConteudos().add(curso2);
                        bootcamp.getConteudos().add(mentoria);
                        
                        
                        
                        Dev devFelipe = new Dev();
                        devFelipe.setNome("Felipe");
                        devFelipe.inscreverBootCamp(bootcamp);
                        
                        System.out.println("Conteudos Inscritos Felipe: " 
                        + devFelipe.getConteudosIncristos());
                        devFelipe.progredir();
                        System.out.println("Conteudos Concluidos Felipe: " 
                        + devFelipe.getConteudosConcluidos());
                        
                        System.out.println("--------------------------");
                        
                        Dev devSelva = new Dev();
                        devSelva.setNome("Selva");
                        devSelva.inscreverBootCamp(bootcamp);
                        
                        System.out.println("Conteudos Inscritos Selva: " 
                        + devSelva.getConteudosIncristos());
                        devSelva.progredir();
                        System.out.println("Conteudos Concluidos Selva: " 
                        + devSelva.getConteudosConcluidos());


    }
    
}
