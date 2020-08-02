public class ClientePJ extends Clientes {
    private String cnpj;

    public ClientePJ (int codigo, String nome, String cnpj){
        super(codigo, nome);
        this.cnpj=cnpj;

    }
    public String getCnpj(){return cnpj;}

    public String toString(){
        return super.toString() + "\t(Cnpj: "+cnpj+ ")" ;
    }
}

