public class Principal {
    public static void main(String[] args) {

        Partido partido1 = new Partido("Partido dos Trabalhadores","PT");
        Candidatos candidatos1 = new Candidatos(13,"Lula",partido1);
        Pesquisa pesquisa1 = new Pesquisa(1,"Poder Data","SP");
        pesquisa1.getDate();
        Voto voto1 = new Voto(pesquisa1,candidatos1,50000);
        System.out.println("O Candidato " + candidatos1.getNome() + " na pesquisa do " + pesquisa1.getInstituto() + " na data de " +pesquisa1.getDate() + " teve " + voto1.getQuantidade() + " votos no estado de " + pesquisa1.getUf());
        System.out.println("----------");

        Partido partido2 = new Partido("Partido Liberal","PL");
        Candidatos candidatos2 = new Candidatos(22,"Bolsonaro", partido2);
        Pesquisa pesquisa2 = new Pesquisa(2,"IBOPE","SP");
        pesquisa2.getDate2();
        Voto voto2 = new Voto(pesquisa2,candidatos2,17500);
        System.out.println("O Candidato " + candidatos2.getNome() + " na pesquisa do " + pesquisa2.getInstituto() + " na data de " +pesquisa2.getDate2() +" teve " + voto2.getQuantidade() + " votos no estado de " + pesquisa2.getUf());
        System.out.println("----------");

        Partido partido3 = new Partido("Partido Democrata Trabalhista","PDT");
        Candidatos candidatos3 = new Candidatos(12,"Ciro", partido3);
        Pesquisa pesquisa3 = new Pesquisa(3,"CNN Brasil","SP");
        pesquisa3.getDate3();
        Voto voto3 = new Voto(pesquisa3,candidatos3,10000);
        System.out.println("O Candidato " + candidatos3.getNome() + " na pesquisa do " + pesquisa3.getInstituto() + " na data de " +pesquisa3.getDate3() + " teve " + voto3.getQuantidade() + " votos no estado de " + pesquisa3.getUf());
        System.out.println("----------");


    }
}