import java.util.ArrayList;
import java.util.Arrays;

public class LojaVirtual {
    // atributos

    // PÁG. 99 - ArrayLists
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private ArrayList<Venda> vendas = new ArrayList<Venda>();
    private CarrinhoCompra carrinhoCompras;

}

    public void adicionarProduto() { // Esse método irá adicionar um produto ao atributo produtos (this.produtos =
                                     // ...)

        produtos.add(null);
    }

    public void listarProdutos() { // varrer e listar todos os índices do array

        // TODO o método listarProdutos irá listar todos os produtos existentes no
        // atributo produto
    }

public void adicionarVenda() { //Esse método irá adicionar uma venda ao atributo vendas (this.vendas = ...)
    vendas.add(null);
}

public double calcularTotalVendas() { //Esse método vai receber todas as vendas adicionadas e fazer uma soma delas

    double somaVendas = this.vendas = ; 
    return somaVendas;
    
    // TODO o método calcularTotalVendas irá somar e retornar a soma de todos os valores das vendas através do atributo vendas
}

    public void getCarrinhoCompra() {
        this.carrinhoCompras = new CarrinhoCompra();

        /*
         * TODO o método getCarrinhoCompra irá criar e retornar um objeto do tipo
         * CarrinhoCompra, atribuindo
         * o novo objeto ao atributo CarrinhoCompra. Caso o objeto já tenha sido criado,
         * retornar apenas
         * o atributo CarrinhoCompra. (Fiquei em dúvida/não entendi muito bem)
         */
    }
}
