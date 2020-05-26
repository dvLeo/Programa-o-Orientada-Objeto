import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TextAnalysis {
    private Map<String,Set<String>> arquivos = new HashMap<>();

    public TextAnalysis(String[] files) {
        for (String fname : files ) {
            arquivos.put(fname,carregaDados(fname));
        }
    }

    public Set search(String palavra) {
        Set<String> apareceu=new HashSet<String>();

        Set<Map.Entry<String,Set<String>>> set = arquivos.entrySet();

        for (Map.Entry<String,Set<String>> a : set) {
            if(a.getValue().contains(palavra)){
                apareceu.add(a.getKey());
            }
        }
        return apareceu;
    }

    public Set search(String palavra1, String palavra2) {
        Set<String> apareceu=new HashSet<String>();

        Set<Map.Entry<String,Set<String>>> set = arquivos.entrySet();

        for (Map.Entry<String,Set<String>> a : set) {
            if(a.getValue().contains(palavra1) && a.getValue().contains(palavra2)){
                apareceu.add(a.getKey());
            }
        }
        return apareceu;
    }

    public Set search(String palavra1, String palavra2, String palavra3) {
        Set<String> apareceu=new HashSet<String>();

        Set<Map.Entry<String,Set<String>>> set = arquivos.entrySet();

        for (Map.Entry<String,Set<String>> a : set) {
            if(a.getValue().contains(palavra1) && a.getValue().contains(palavra2) && a.getValue().contains(palavra3)){
                apareceu.add(a.getKey());
            }
        }
        return apareceu;
    }

    public Map frequenciaPalavras(String arquivo){
        Map<String,Integer> frequencias = new HashMap<>();

        Path path = Paths.get(arquivo);
        Set<String> palavras = new HashSet<String>();
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("utf8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-zA-Záéíóúçãõà-]"," ");
                for (String l: line.split(" ")){
                    if (l.length()>0)
                        if(frequencias.get(l)==null){
                            frequencias.put(l,1);
                        }else{
                            int cont=frequencias.get(l)+1;
                            frequencias.put(l,cont);
                        }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro na leitura: "+e.getMessage());
        }
        return frequencias;
    }

    public Set searchArquivos(String arquivo1, String arquivo2) {
        Set<String> apareceu=new HashSet<String>();

        Set<Map.Entry<String,Set<String>>> set = arquivos.entrySet();

        for (Map.Entry<String,Set<String>> a : set) {
            for (Map.Entry<String,Set<String>> b : set) {
                if (a.getKey().equals(arquivo1) && b.getKey().equals(arquivo2)) {
                    for (String palavra : a.getValue()) {
                        if(b.getValue().contains(palavra)){
                            apareceu.add(palavra);
                        }
                    }
                }
            }
        }
        return apareceu;
    }

    private Set<String> carregaDados(String fileName) {
        Path path = Paths.get(fileName);
        Set<String> palavras = new HashSet<String>();
        try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("utf8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-zA-Záéíóúçãõà-]"," ");
                for (String l: line.split(" ")){
                    if (l.length()>0)
                        palavras.add(l);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro na leitura: "+e.getMessage());
        }
        return palavras;
    }
}