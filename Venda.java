import java.util.ArrayList;
import java.util.*;

public abstract class Venda {
    protected ArrayList<ProdutoVendido> produtosVendidos = new ArrayList<ProdutoVendido>();
    protected Estoque estoque;
    protected static LojaVirtual lojaVirtual;

    // Por que adicionar um "atributo" do tipo Arraylist<Produto>;

    public Venda(LojaVirtual lojaVirtual, Produto produto) {
        this.lojaVirtual = lojaVirtual;
        this.produtosVendidos = produto;
    }

    public void listarItens() {
        System.out.println(produtosVendidos);
        // TODO o método listar itens irá listar todos os itens existentes no atributo
        // produtosVendidos.
    }

    public Estoque getEstoque() {
        if (estoque == null) {
            return this.estoque = new Estoque();
        } else {
            return this.estoque;
        }
    }

    public abstract double realizarVenda();
}