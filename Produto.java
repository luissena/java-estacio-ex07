public abstract class Produto {
    protected String descricao;
    protected float preco;
    protected float desconto;
    protected int qtdParaDesconto;
    protected int qtdItensFazemParteProduto;

    public Produto(String descricao, float preco, float desconto, int qtdParaDesconto, int qtdItensFazemParteProduto) {
        this.descricao = descricao;
        this.preco = preco;
        this.desconto = desconto;
        this.qtdParaDesconto = qtdParaDesconto; // define quantos produtos individuais/caixas devem ser vendidas para
                                                // ter o desconto informado pelo atributo desconto acima
        this.qtdItensFazemParteProduto = qtdItensFazemParteProduto; /*
                                                                     * O atributo qtdItensFazemParteProduto define
                                                                     * quantos itens fazem parte do
                                                                     * produto. Quando o produto é vendido
                                                                     * individualmente, o valor é sempre 1, porém
                                                                     * quando o produto é vendido em caixa, este valor é
                                                                     * sempre maior que 1;
                                                                     */
    }

    public void getPreco() {

    }

    public void getDescricao() {

    }

    public abstract void getDesconto();

    public abstract void getQtdParaDesconto();

    public abstract void qtdItensFazemParteProduto();

}

/*
 * Nesta loja virtual, quando um produto individual acaba, mas ainda existe em
 * caixa,
 * o produto poderá ser retirado da caixa pra ser vendido individualmente, sendo
 * que a
 * caixa não poderá ser mais vendida porque estará incompleta
 */