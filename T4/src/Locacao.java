import java.time.LocalDate;

public class Locacao {
    private LocalDate data;
    private Cliente cliente;
    private Filme filme;

    public Locacao(LocalDate data, Cliente c, Filme f){
        this.data = data;
        cliente = c;
        filme = f;

    }

    public LocalDate getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "data=" + data +
                ", cliente=" + cliente +
                ", filme=" + filme +
                '}';
    }
}
