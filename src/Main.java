import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
            curso1.setTitulo("Curso Java");
            curso1.setDescricao("Descrição do curso Java"); 
            curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
            curso2.setTitulo("Curso js");
            curso2.setDescricao("Descrição do curso js"); 
            curso2.setCargahoraria(4);

        

        Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria de Java");
            mentoria.setDescricao("Descrição da mentoria de Java");
            mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
            devArthur.setNome("Arthur");
            devArthur.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
            devArthur.progredir();
            devArthur.progredir();
            System.out.println("--");
            System.out.println("Conteúdos Inscritos Arthur:" + devArthur.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos Arthur:" + devArthur.getConteudosConcluidos());
            System.out.println(" ");
            System.out.println("XP: " + devArthur.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
            devJoao.setNome("João");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
            devJoao.progredir();
            System.out.println("--");
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());
            System.out.println(" ");
            System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}
