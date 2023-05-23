class Linguagem{
    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras){
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }
    public void getInfo(){
        System.out.println(nome+" é falado por "+numFalantes+" pessoas principalmente em "+regioesFaladas);
        System.out.println("A linguagem segue a ordem das palavras "+ ordemDasPalavras);
    }

    public static void main(String[] args){
        Linguagem linguagem = new Linguagem("Portugues", 26000000, "Portugal, Brasil", "sujeito-verbo-objeto");
        linguagem.getInfo();

        Mayan kiche = new Mayan("Maia", 1000000);
        kiche.getInfo();

        SinoTibetan Mandarim = new SinoTibetan("Chines", 1000000);
        Mandarim.getInfo();

        SinoTibetan Birmanes = new SinoTibetan("Birmanes", 500000);
        Birmanes.getInfo();
       
        
    }
}
