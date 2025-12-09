public class CamisaEstampada extends Camisa {


    protected String estampa;

    public CamisaEstampada( double preco, String tamanho, String cor,
                             String estampa) {
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
        this.estampa = estampa;
        this.desconto = 0.95;
    }

    public String GetCor(){
        return this.cor;
    }
    public void SetCor(String cor){

        this.cor = cor;
    }

    public String GetTamanho(){
        return this.tamanho;
    }

    public void SetTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public double GetPreco(){
        return this.preco;
    }

    public void SetPreco(double preco){
        this.preco = preco;
    }

    public void exibirDetalhesEstampada(){
        System.out.println("A cor da camisa é:" + this.cor +
                ", o tamanho é " + this.tamanho + ", a estampa é "
                + estampa + ", o preço é: " +
                this.preco + " e o valor com o desconto é " + calcularDesconto());
    }

}
