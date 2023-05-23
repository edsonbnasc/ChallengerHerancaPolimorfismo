public class Mayan extends Linguagem {
    public Mayan(String nome, int numFalantes){
        super(nome, numFalantes,"America Central","verbo-objeto-sujeito");
    }
   @Override
   public void getInfo(){
    super.getInfo();
    System.out.println("Fato interessante: "+ nome+ " é uma lingua ergativa ");
   }
}