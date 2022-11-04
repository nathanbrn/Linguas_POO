abstract class Lingua {
    String nome;
    int numFalantes;
    String regiao;
    String ordemPalavras;
  
    public Lingua(String nome, int numFalantes, String regiao, String ordemPalavras) {
      this.nome = nome;
      this.numFalantes = numFalantes;
      this.regiao = regiao;
      this.ordemPalavras = ordemPalavras;
    }
  
    public void getInfo() {
      System.out.println(nome+" é falada por "+numFalantes+" pessoas que estão, majoritariamente, localizadas em: " +regiao);
      System.out.println("A língua segue a ordem: "+ordemPalavras);
    }
  
    public abstract void getFamiliaInfo();
    
  }