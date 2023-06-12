//criação Classe Carro cpm marca,modelo e ano
class Carro{
  var marca=""
  var modelo=""
  var ano= 0
}

  class Car(var marca: String, var modelo: String, var ano: Int){
  // metodo da classe
  fun ligar() {
    println("Wrooom!")
  }
  }
//função principal
fun main() {
  //criar uma instancia de carro
var corola=Carro()
//atribuir valores
corola.marca="Toyota"
corola.modelo="Corola"
corola.ano=2023

//imprimir atributos

  println(corola.marca)
  println(corola.modelo)
  println(corola.ano)
//instanciar passando os parametros 
val c1 = Car("Ford", "Mustang", 1969)
println (c1.marca)
//instanciar outro carro
val fusca=Car ("Fusca","VW", 1975)
println(fusca.modelo)
//ligar carro
c1.ligar()
}
  
