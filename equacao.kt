fun main(args: Array<String>) {
  println("Vamos calcular essa equaçao!")
  println("Digite os numeros para formar sau propria equaçao:")
  println("Valor de A")
  var num1 = readLine()!!
  var a = num1.toDouble()
  println("Valor de B")
  var num2 = readLine()!!
  var b = num2.toDouble()
  println("Valor de C")
  var num3 = readLine()!!
  var c = num3.toDouble()
  
  
 // var raiz1=((-b+(sqrt((b^2)-(4*a*c))))/2*a)
  var delta = (b * b) - (4 * a * c)
  var r1= ((0-b) + (Math.sqrt(delta))) / (2 * a)
  
  //var raiz2=(-b-(sqrt(b^2)-(4*a*c)))/2*a
   var r2= ((0-b) - (Math.sqrt(delta))) / (2 * a)
   println("O resultado do x1 é: " +r1)
  println("O resultado do x2 é: " +r2)
}
