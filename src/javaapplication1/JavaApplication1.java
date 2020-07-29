package javaapplication1;
public class JavaApplication1 {

    public static void main(String [] args){
    ObjetoJava p1 = new ObjetoJava();
    p1.nome();
    p1.origem();
    System.out.println(p1.nome);
    System.out.println(p1.origem);
    p1.altura();
    System.out.println("a altura de " + p1.nome + " é: " + p1.altura);
    p1.trabalho();
    p1.TempoExperiencia();
    System.out.println(p1.nome + " Trabalha na empresa " + p1.trabalho + " há: " + p1.TempoExperiencia + " meses.");
 }
}
    

