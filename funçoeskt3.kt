//criar uma função passando um pârametro

fun meuNome(nome: String){
   println ("Seu nome é "+ nome)
 }
//crie uma função que retorna true ou false,passando parametros x na chamada da funçãi


fun a (x:Boolean){
   println(x)
}

//crie uma funçãp que verifica a idade passada

fun seramaior(c:Int ){
  if(c >=18) {
     println("Você é maior de idade: "  +c )
     
  }else{
    println ("Você é menor de idade: " 
 +c )
  }
 
}

//crie uma função que soma dois parametros inteiros a e b, a função retorna a soma dos dois valores

  
fun myFunction(a: Int, b: Int): Int{
  return (a + b)
}


  
//função principal kotlin

fun main() {
  meuNome("Kauan")
  a (true)
  a (false)
  seramaior ( 18)
  seramaior ( 17)


var result = myFunction(3 ,5 )
  println(result)
}
