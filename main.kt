fun main() {
  //pergunta idade
  println("Qual sua idade:")
  var idade = readLine()!!
  println("Sua idade é:"+idade)
//números digitados no teclado são interpretados como texto
  val num = idade.toInt()
  
  
  if (num >=18) {
  println ("Você é maior de idade.")
  }else{
    println("Você é menor de idade.")
  }
  
}