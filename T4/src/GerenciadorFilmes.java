import java.util.ArrayList;

public class GerenciadorFilmes {
    private ArrayList<Filme> lista;

    private GerenciadorFilmes(){
        lista = new ArrayList<>();
    }

    private static GerenciadorFilmes instance;

    public static GerenciadorFilmes getInstace(){
        if(instance == null) {
            instance = new GerenciadorFilmes();
        }
        return instance;
    }

    public Filme buscarFilme (int cod){
        for (Filme f: lista){
            if(f.getCodigo() == cod) {
                return f;
            }
        }
        return null;
    }
}
