import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private ArrayList<ProdutoCarrinho> produtos = new ArrayList<ProdutoCarrinho>();
    private Venda venda;
    private LojaVirtual lojaVirtual;

    public CarrinhoCompra(LojaVirtual lojaVirtual){
        this.lojaVirtual = lojaVirtual;
    }

    public adicionarItem() {
        //Método que irá adicionar um item
        
        produtos.add();

    }
    
    public void listarItens() {
        //O for deverá pegar item por item do array e exibir.
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos.get(i));
        }
    }
    
    public void esvaziarCarrinho() {

    this.produtos = null;

        // TODO o método esvaziarCarrinho irá apagar todos os itens existentes no atributo produto
        System.gc();
    }


    public void getVenda() {
        
        this.venda = new Venda();

    }

    public getVenda(int qtdParcela) {

        public Venda (){
            this.Venda = new venda;
            // TODO caso o objeto já tenha sido criado, retornar apenas o atributo venda.
        }
    }

}