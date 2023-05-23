public class SinoTibetan extends Linguagem{
    public SinoTibetan(String nome, int numFalantes){
        super(nome, numFalantes,"Asia", "sujeito-objeto-verbo");
        if(nome.contains("Chines")){
            this.ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Fato interessante: "+nome+ " é uma linguagem sino-tibetana");
    }
}
