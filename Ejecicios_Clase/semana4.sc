val names : List[String] = List("Leo", "Cristian", "Enner", "Felipe")
names.map(_.length)

//  "_" mapea todo

val numbers =List(3,4,7,11,12)
val isPrime = (nro :Int) => (2 to nro -1).forall((nro% _!= 0))
numbers.map(isPrime(_) match {
  case true =>1
  case false => 0
}).sum

//
def main(args: Array[String]): Unit = {
  val k=10000
  val arctan = (n: Int) =>(0 until k).toList.map(i => (math.pow(-1, i) / (2 * i + 1) *
    (math.pow(n, -2 * i - 1)))).sum
  val pi = (4 * (4 * arctan(5) - arctan(239)))
  println(pi)
}


val numbers =List(6,28,15,12,11,24)
val sumDiv =(nro : Int) => (1 until nro).filter(div => nro % div == 0).sum

numbers.filter(nro => nro == sumDiv(nro)).size


/*forall -> devuelve true si y solo si el predicado devuelve true
para todos los valores de la lista*/

def isPrime(nro: Int): Boolean = (2 until nro).forall((nro %_ !=0))

/* exists -> devuelve true si y solo si el predicado devuelve true
para por los menos un valor de la lista
 */
def isPrime(nro: Int): Boolean = !(2 until nro).exists((nro %_ ==0))
/*
val res = List(1,2,3,4,5).filter( k=> k % 3 !=0)
res: List[Int] = List(1,2,4,5).size

List(1,2,3,4,5).takeWhile(k=> k %3!=0)
res: List[Int] = List(1,2)
*/

print("================================================")
(n :Int) => (1 until n).filter(div => n% div ==0)

def factorialEscalonado(n:Int):Int={
  n% 2 match {
    case 0=>(2 to n by 2).product
    case _=>(1 to n by 2).product
  }
}

factorialEscalonado(8)
factorialEscalonado(9)
/*
deficiente = Suma de los Divisores < N
perfecto = suma divisor = N
Abundante = Suma divisores > N

 */
val numbers = (1 to 20).toList
// toList = todo en entero

//contar pares
numbers.filter(nro =>nro %2 ==0).size
numbers.count(nro => nro % 2 ==0)

//contar impare
numbers.filter(nro =>nro %2 !=0).size
numbers.count(nro =>nro %2 !=0)

//Contar Primos
def contarPrimos(nro : List[Int]): Int={
  val isPrime = (n :Int) => (2 to n -1).forall(n % _!=0)
  nro.filter(isPrime).size
}
contarPrimos(numbers)

//Presentar 3 Factores

def tresFactores (nros : List[Int]) : List[Int]={
  val factores = (n : Int) => (2 until n).filter(n % _ ==0)
  nros.filter(nros => factores(nros).size ==3 )
}
tresFactores((1 to 1000).toList)

def countEven(s:List[Int]) :Int={
  val isEven=(k: Int)=> k % 2 match {
    case 0 =>1
    case _ =>0
  }
  s.map(isEven).sum
}

