public class Produto {
    private static Integer count = 1;
    private Integer id;
    private String nome;
    private Double precoUnitario;
    private Double quantidade;
    private Double precoTotal;


    public Produto(String nome, Double quantidade, Double precoUnitario, Double precoTotal) {
        this.id = count;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
        this.precoUnitario = precoUnitario;
        Produto.count += 1;

    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Double getQuantidade() {

        return quantidade;
    }

    public void setQuantidade(Double quantidade) {

        this.quantidade = quantidade;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }



    public String resultado (){
        return "ID: " + this.getId() +
                "\nNOME : " + this.getNome() +
                "\nQUANTIDADE: " + this.getQuantidade() +
                "\nPREÇO UNIDADE : " + this.getPrecoUnitario() + " R$" +
                "\nPREÇO TOTAL : " + this.getPrecoTotal() + " R$" ;

    }
}

