class Maia extends Lingua {  

    public Maia(String nome,  int numLetras) {
      super(nome, numLetras, "America Central", "verbo-objeto-sujeito");
    }
  
      @Override
    public void getFamiliaInfo() {
      System.out.println("As línguas maias são um grupo de línguas faladas pelos povos maias. Os maias formam um enorme grupo de aproximadamente 7 milhões de pessoas que descendem de uma antiga civilização mesoamericana e se espalham pelos países modernos de: México, Belize, Guatemala, Honduras e El Salvador.");
    }
  
    @Override
    public void getInfo() {
      System.out.println(nome+" é falada por "+numFalantes+" pessoas que estão, majoritariamente, localizadas em: " +regiao);
      System.out.println("A língua segue a ordem: "+ordemPalavras);
      System.out.println("Curiosidade: "+nome+" é uma língua ergativa");
    }
  }