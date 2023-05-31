fun main() {
  
  class Carro {
  var marca = ""
  var modelo = ""
  var ano = 0
} 
  // Criar um objeto (instanciar)
val i8 = Carro()

// Access the properties and add some values to it
  i8.marca = "BMW"
  i8.modelo = "I8"
  i8.ano = 2015

  println(i8.marca)   // MOstrar BMW
  println(i8.modelo)   // Mostrar I8
  println(i8.ano)    // Mostrar 2015

  // instanciar outro carro e imprimiir os atributos

  val car = Carro()
  car.marca = "Chevrolet"
  car.modelo = "Chevete"
  car.ano = 1970

  println(car.marca)  // Mostrar Chevrolet
  println(car.modelo)
//Mostrar Chevete
  println(car.ano)
  //Mostrar 1970
}
