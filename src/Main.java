abstract class Main {

  
    public static void main(String[] args) {
      Romanica espanhol = new Romanica("Espanhol", 538000000, "Espanha e América Latina", "sujeito-verbo-objeto");
      Maia kiche = new Maia("K'iche'", 2330000);
      SinoTibetana mandarim = new SinoTibetana("Mandarim", 920000000);
      SinoTibetana birmanes = new SinoTibetana("Birmanês", 33000000);
  
      espanhol.getInfo();
      espanhol.getFamiliaInfo();
      System.out.println();
      kiche.getInfo();
      kiche.getFamiliaInfo();
      System.out.println();
      mandarim.verificarLingua();
      mandarim.getInfo();
      mandarim.getFamiliaInfo();
      System.out.println();
      birmanes.verificarLingua();
      birmanes.getInfo();
      birmanes.getFamiliaInfo();
    }
  }