public  class Camisa {

    protected String cor;
    protected String tamanho;
    protected double preco;
    protected double desconto;

    public void exibirDetalhes(){
      System.out.println("A cor da camisa é:" + this.cor +
              ", o tamanho é " + this.tamanho + ", o preço é: " +
              this.preco + " e o valor com o desconto é " + calcularDesconto());
    }

    public double calcularDesconto(){
        return preco * desconto;
    };
}
