public class CamisaSimples extends Camisa {

    public CamisaSimples( double preco, String tamanho, String cor) {
        this.preco = preco;
        this.tamanho = tamanho;
        this.cor = cor;
        this.desconto = 0.9;
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

}
