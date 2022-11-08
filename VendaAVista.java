import java.util.*;
import java.text.ParseException;


public class VendaAVista extends Venda {

    public VendaAVista() {




        /*
         * A classe VendaAVista irá conter um construtor que receberá um atributo do
         * tipo
         * LojaVirtual e um atributo do tipo Arraylist<Produto>, que serão passados à
         * superclasse através da sintaxe super;
         */

    }

    public void realizarVenda() {
        localizarItemProduto();

        /*
         * TODO O método realizarVenda da classe VendaAVista irá chamar o método
         * localizarItemProduto
         * da classe Estoque para cada produto adicionado ao atributo produtosVendidos
         * da classe Venda
         */

        /*
         * TODO Caso cada produto seja localizado no estaque, deverá mostrar o valor
         * total de cada produto
         * e chamar o método esvaziarCarrinho da classe CarrinhoCompra
         */
        
        try {
            System.out.println();
            esvaziarCarrinho();


        } catch (CompraNaoPodeSerRealizadaException e) {
            
        throw new CompraNaoPodeSerRealizadaException();
        }

        

        /*
         * TODO Caso algum produto não seja localizado no estoque, deve-se disparar uma
         * exceção informando
         * que a venda não poderá ser realizada porque há algum produto que não existe
         * no estoque.
         * (imagino que seja um try catch com print de mensagem na tela )
         */

    }

    public LojaVirtual (){
        this.LojaVirtual = new lojaVirtual;
        ArrayList<Produto> produtos = new ArrayList< Produto>();
        /* TODO A classe VendaAVista irá conter um construtor que receberá um atributo do tipo LojaVirtual
        e um atributo do tipo ArrayList<Produto> , que serão passados a superclasse através da sintaxe super
        (não sei fazer tudo kjdsfkljfdsjkf / não entendi) */
    }

}
