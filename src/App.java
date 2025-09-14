import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
class nigga extends Thread {
    @Override public void run(){
        for (int i=1; i<11; i++){
            System.out.println(i);
            try{
            Thread.sleep(500);
            } catch (InterruptedException e){

            }
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
       
        FileWriter nome = new FileWriter("teste.txt");
       PrintWriter escreve = new PrintWriter(nome);

       escreve.print("eu ");
       escreve.print("quero ");
       escreve.println("caga ");
       escreve.println("pofavo");
       escreve.print("obrigado");
       escreve.close();
       nome.close();

       File f = new File("teste.txt");
        Scanner sc = new Scanner (f);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

         Scanner sc2 = new Scanner (f);
         FileWriter n = new FileWriter("teste2.txt");
       PrintWriter e = new PrintWriter(n);
       
       while (sc2.hasNextLine()){
        String l = sc2.nextLine();
        if (l.charAt(0) == 'a' || l.charAt(0) == 'e' || l.charAt(0) == 'i' || l.charAt(0) == 'o' || l.charAt(0) == 'u'){
            e.println(l);
        }
       }
       n.close();
       e.close();

       File f2 = new File("teste2.txt");
        Scanner s = new Scanner (f2);

       while (s.hasNextLine()){
            System.out.println(s.nextLine());
        }

        sc.close();
    }
}
