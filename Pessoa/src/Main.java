import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Julio", 15);
        Pessoa p2 = new Pessoa("Catarina", 25);
        Pessoa p3 = new Pessoa("Fagundes", 33);
        Pessoa p4 = new Pessoa("Magiev", 20);
        Pessoa p5 = new Pessoa("Mika", 7);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);

        System.out.println(pessoas);

        p2.imprimir();

        getMaiorIdade(pessoas).imprimir();
        getMenorIdade(pessoas).imprimir();


        System.out.println(getMediaIdade(pessoas));



    }

    static Pessoa getMaiorIdade(ArrayList<Pessoa> pessoas){
        Pessoa MaiorIdade = new Pessoa();
        MaiorIdade.setIdade(0);
        for (Pessoa p: pessoas) {
            if (p.getIdade() > MaiorIdade.getIdade()){
                MaiorIdade = p;
            }

        }
        System.out.println("A pessoa mais velha é:");
        return MaiorIdade;

    }
    static Pessoa getMenorIdade(ArrayList<Pessoa> pessoas){
        Pessoa MenorIdade = new Pessoa();
        MenorIdade.setIdade(Integer.MAX_VALUE);
        for (Pessoa p:pessoas) {
            if(MenorIdade.getIdade() > p.getIdade()){
                MenorIdade = p;
            }

        }
        return MenorIdade;
    }

    static float getMediaIdade(ArrayList<Pessoa> pessoas) {
        Pessoa mediaIdade = new Pessoa();
        var b = pessoas.size();
        var soma = 0;
        var media = 0;
        for (Pessoa p: pessoas) {
            soma += p.getIdade();


        }
        media = soma / (pessoas.size());
        return media;

    }
}