import java.util.*;

public class Estoque {
    private ArrayList<ProdutoEstocado> produtosEstocados = new ArrayList<ProdutoEstocado>();

    public void adicionarItemProduto() {

        produtosEstocados.add(null);

        /*
         * TODO O método adicionarProduto irá adicionar um produto ao atributo
         * produtosEstocados.
         * O método adicionarProduto deverá ser utilizado para cadastrar itens
         * individuais de produtos
         * e caixas contendo itens de produtos.
         * Quando for cadastrar individuais no estoque deve-se informar o produto a
         * quantidade destes itens
         * individuais disponíveis.
         * Quando for cadastrar as caixas no estoque, deve-se informar o produto que
         * está dentro da caixa
         * e a quantidade de itens individuais deste produto dentro da caixa.
         */
    }

    public void removerItemProduto() {
        this.produtosEstocados = null;

        System.gc();
        // TODO o método removerItemProduto irá remover um produto do atributo
        // produtosEstocados.
    }

    public void localizarItemProdutor() { // forEach = para cada produtoEstocado em produtosEstocados, FAÇA:
        for (ProdutoEstocado produtoEstocado : produtosEstocados) {

            System.out.println(produtoEstocado);
        }

        /*
         * TODO O método localizarItemProduto irá localizar um produto no atributo
         * produtosEstocado
         * recebendo a descrição do produto como parâmetro e retornando o objeto do tipo
         * produto,
         * caso seja encontrado.
         */
    }

    /*
     * TODO Se o produto localizado for do tipo caixa e a quantidade de itens dentro
     * da caixa for menor
     * do que a quantidade de itens que fazem parte do produto especificado na
     * classe Produto, o método
     * localizarItemProduto deerá retornar nulo.
     */

    /*
     * O método adicionarItemProduto deverá ser utilizado para cadastrar itens
     * individuais de produtos e caixas contendo itens de produtos;
     * Quando for cadastrar os itens individuais no estoque deve-se informar o
     * produto e
     * a quantidade destes itens individuais disponíveis;
     * 
     */

    /*
     * Quando for cadastrar as caixas no estoque, deve-se informar o produto que
     * está
     * dentro da caixa e a quantidade de itens individuais deste produto disponíveis
     * dentro
     * da caixa.
     */
}