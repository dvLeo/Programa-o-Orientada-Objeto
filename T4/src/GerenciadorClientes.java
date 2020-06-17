import java.util.ArrayList;

public class GerenciadorClientes {
    private ArrayList<Cliente> lista;

    private GerenciadorClientes(){
        lista = new ArrayList<>();
    }

    private static GerenciadorClientes instance;

    public static GerenciadorClientes getInstance(){
        if(instance == null){
            instance = new GerenciadorClientes();
        }
        return instance;
    }

    public Cliente buscarCliente(int cod){
        for(Cliente c: lista){
            if(c.getCodigo() == cod){
                return c;
            }
        }
        return null;
    }
}
