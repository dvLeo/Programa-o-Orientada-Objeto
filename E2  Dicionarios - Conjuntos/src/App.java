public class App {
//l
    public static void main(String[]  args) {

        String[] files = new String[]{ "texto01.txt","texto02.txt", "texto03.txt",
                "texto04.txt", "texto05.txt","texto06.txt", "texto07.txt",
                "texto08.txt", "texto09.txt","texto10.txt" };

        TextAnalysis dicionario = new TextAnalysis(files);

        // 1. Dada uma palavra qualquer, em quais arquivos esta palavra aparece?
        System.out.println("1. Dada uma palavra qualquer, em quais arquivos esta palavra aparece?");
        System.out.println(dicionario.search("beatles")+"\n");

        // 2. Dadas duas palavras quaisquer, quais são os arquivos que contém as duas palavras? E três palavras?
        System.out.println("2. Dadas duas palavras quaisquer, quais são os arquivos que contém as duas palavras?");
        System.out.println(dicionario.search("arquimedes","corpo")+"\n");
        System.out.println("E três palavras?");
        System.out.println(dicionario.search("siracusa","arquimedes","ferissem")+"\n");

        // 3. Dado um arquivo qualquer mostrar quais as palavras que aparecem neste arquivo com suas frequências.
        System.out.println("3. Dado um arquivo qualquer mostrar quais as palavras que aparecem neste arquivo com suas frequências.");
        System.out.println(dicionario.frequenciaPalavras("texto09.txt")+"\n");

        // 4. Dados dois arquivos, quais as palavras que aparecem em ambos os arquivos?
        System.out.println("4. Dados dois arquivos, quais as palavras que aparecem em ambos os arquivos?");
        System.out.println(dicionario.searchArquivos("texto01.txt","texto09.txt"));
    }
}
