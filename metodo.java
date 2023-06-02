class Main {
//aqui cria um método
  static void imPrimir(){
    System.out.println("Só imprime isso");
  }
  //aqui cria um método passando parametro
  static void meuMetodo(String nome) {
    System.out.println("O nome é : "+ nome);
  }



  
   //aqui cria um método passando parametro
  static void nomeEidade(String nome, int ano) {
    System.out.println(nome + " tem " + ano + " anos");
  }
  
  
  //classe principal do java
  public static void main (String[] args) {
    //chama metodo imPrime()
    imPrimir();

//chama método meuMetodo()
    
meuMetodo("Kauan");
meuMetodo("Enthony");
meuMetodo("Professor");

  //método com dois parametros

nomeEidade(" Kauan",17 );
nomeEidade(" Enthony",18 );
nomeEidade(" Professor", 46 );
  }

  
}
