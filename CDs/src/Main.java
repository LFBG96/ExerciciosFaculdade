import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<CD> cds = new ArrayList<>();

        CD cd1 = new CD("titulo1",4,13,"cantor1");
        CD cd2 = new CD("titulo2",5,23,"cantor2");
        CD cd3 = new CD("titulo3",6,3,"cantor3");
        CD cd4 = new CD("titulo4",7,9,"cantor4");
        CD cd5 = new CD("titulo5",2,16,"cantor5");

        cds.add(cd1);
        cds.add(cd2);
        cds.add(cd3);
        cds.add(cd4);
        cds.add(cd5);


        System.out.println(getMaiorNumFaixa(cds));
        getCDMenorPreco(cds,"cantor3");




    }

    static CD getMaiorNumFaixa(ArrayList<CD>cds){
        CD MaiorNumFaixa = new CD();
        MaiorNumFaixa.setNumfaixa(0);

        for (CD cd:cds) {
            if(cd.getNumfaixa() > MaiorNumFaixa.getNumfaixa()){
                MaiorNumFaixa = cd;

            }


        }return MaiorNumFaixa;
    }

    static void getCDMenorPreco(ArrayList<CD> cds,String nomeCantor){
        for (CD cd:cds) {
            if(nomeCantor.equals(cd.getCantor())){
                System.out.println("R$ "+ cd.getPreco());
            }

        }

    }


}