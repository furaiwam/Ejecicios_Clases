val cedula = "1108765321"
// cedula = "1108765320"
var cedula1 = "1108765321"
cedula1 = "1108765320"
(x: Double) => - Math.pow(x,2) +8*x -12
val f1 = (x: Double) => - Math.pow(x,2) +8*x -12
f1 (12)
f1(12) * 9 / 8 + 3
((x: Double) => -Math.pow(x,2) + 8 * x - 12)(12) * 9 / 8 + 3
def integracion(a: Int, b: Int, f:  Double => Double) = {
  val intermedio = (a+b)/2.0
  val fa = f(a)
  val fi = f(intermedio)
  val fb = f(b)
  (b-a) * (fa + 4 * fi + fb) / 6
}
def select(option: Char) : (Int, Int) => Double = {
  option match{
    case '+' => (a: Int, b: Int) => a+b
    case '-' => (a: Int, b: Int) => a-b
    case '*' => (a: Int, b: Int) => a*b
    case '/' => (a: Int, b: Int) => a/b.toDouble
    case _ => (a: Int, b: Int) => 0/(a+b)
  }
}
select('+')(2, 1)
val operacion = select('+')
operacion(2, 1)
var L = List (5, 6, 7, 8, 9)
//val L = List[Int]
// def isEven(k: Int) => if(k%2 == 0) 1 else 0
def isEven(k: Int) : Int = (k%2) match {
  case 0 => 1
  case _ => 0
}
def countEven( s: List[Int]): Int = s.map(isEven).sum
countEven(L)

List(1,2,3).sum
// res1: List[Int] = List(101, 204, 309)
def func1(x: Int): Int = x*x + 100*x
List (1,2,3).map(func1)
// res3: List[Int] = List(101, 204, 309)
val nums = List(1,2,3)
nums.map(x => x+1)
def add1(a: Int): Int = a+1
nums.map(add1)
nums.map(x => add1(x))
nums.map(add1(_))

val sumaDos = (a: Int, b: Int) => a+b
// nums.map(sumaDos)
nums.map(x=> sumaDos(x, x))
// nums.map(sumaDos(_, x))
def contador(k: String): Int = k.length()
def tamaño(x: List[String]): Int = x.map(contador(_)).sum
c = List("Hola", "Hola")
tamaño(c)