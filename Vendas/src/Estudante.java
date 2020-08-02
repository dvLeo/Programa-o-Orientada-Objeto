public class Estudante extends ClientePF {
    private String matricula;
    private String instituicao;

    public Estudante(int codigo, String nome, String cpf, String matricula, String instituicao){
        super(codigo, nome, cpf);
        this.matricula=matricula;
        this.instituicao=instituicao;
    }

    public String toString(){
        return super.toString() + "\t instituicao: " + instituicao;
    }

}
