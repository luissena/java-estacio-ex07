import java.util.ArrayList;

public class VendaAPrazo extends Venda {
    private int qtdParcelas;

    public VendaAPrazo(LojaVirtual lojaVirtual, Produto produto, int parcelas) {
        super(lojaVirtual, produto);
        this.qtdParcelas = parcelas;

    }

    public double realizarVenda() {
        if (qtdParcelas < 3) {

            double VT = produto * 1.10;
            return VT;

        } else {
            realizarVenda();
        }

        localizarItemProduto();

        /*
         * TODO O método realizarVenda da classe VendaAPrazo irá chamar o método
         * localizarItemProduto
         * da classe Estoque para cada produto adicionado ao atributo produtosVendidos
         * da classe Venda
         */

        /*
         * caso cada produto seja localizado no estoque VendaAPrazo irá chamar o método
         * o método
         * localizarItemProduto da classe Estoque para cada produto adicionado ao
         * atributo
         * produtosVendidos da classe Venda
         */

    }

    public LojaVirtual (){
        this.LojaVirtual = new lojaVirtual;
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        //TODO this.qtdParcelas = new qtdParcelas (? nsei);

        /* TODO A classe VendaAPrazo irá conter um construtor que receberá um atributo do tipo LojaVirtual
        e um atributo do tipo ArrayList<Produto> , que serão passados a superclasse através da sintaxe super,
        e um atributo que receberá a quantidade de parcelas do tipo int que será armazenado no atributo
        qtdParcelas. (PELO AMOR DE DEUS EKREDKFJLEJRIDJESAIOXCH) */

        if (qtdParcelas > 3) {
            // TODO ??????????????????????
        }
    }
}