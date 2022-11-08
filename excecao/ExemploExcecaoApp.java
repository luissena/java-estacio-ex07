/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package excecao;

public class ExemploExcecaoApp {

    public static void main(String args[])
    {
        try
        {
               
               Aluno aluno1 = new Aluno("helder",5.0f);
               System.out.println("a nota do aluno"+ aluno1.getNota());
        }
       
        catch (NotaNegativaException e)
        {
          // tratamento da exceção imprime a mensagem
          
            System.out.println("erro mensagem" + e.getMessage());
        }

     /*   finally
        {
          System.out.println("O finally sempre executa");
        }*/
}
}
