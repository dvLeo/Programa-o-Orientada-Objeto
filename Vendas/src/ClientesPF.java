public class ClientePF extends Clientes {
    private String cpf;

    public ClientePF(int codigo, String nome, String cpf){
        super(codigo, nome);
        this.cpf=cpf;
    }
    public String toString(){
        return super.toString() + "\t(cpf: "+cpf+ ")";
    }
}
