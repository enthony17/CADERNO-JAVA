fun main(){
//1-Faça um programa em KOTLIN que receba dois números inteiros e o programa faz a soma dos números
  
  println("Qual é o seu nome?")
  var texto=readLine()!!
  println("seja Bem vindo"+ texto)
  println ("Digite um numero inteiro : ")
  var num1=readLine()!!
  var x =num1.toInt()
  println("Ok, digite outro numero: ")
  var num2=readLine()!!
  var y = num2.toInt()
  var soma= x+y
println("O numero é:"+ soma )
  //agora inclua as funcionalidades de subtração multiplicação e divisão
  var sub=x-y
  
  var divi=x/y
  
  var mult=x*y

println("A subtração é:"+ sub)

println("A divisão é:"+ divi)

println("A multiplicação é:" + mult)

  

}
