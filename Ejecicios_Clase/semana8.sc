import scala.util.Try

def division(n1:Double,n2:Double)=
  if(n2==0)throw new RuntimeException("Division por 0")
  else n1/n2

division(5,8)
/* ------------------------------------------------------------------------------------------------------------------------------- */
def pureDivision(n1:Double,n2:Double):Try [Double]=
  Try{ division(n1,n2)}

pureDivision(2,0)

/* --------------------------------------------------------------------------------------------------------------------------------- */
val result=pureDivision(1,3)
import scala.util.{Success,Failure}
result match{
  case Failure(e) =>println(e.getMessage)
  case Success(v) =>println(v)
}



/* Option/Some/None */

def toInt(s:String):Option[Int]={
  try{
    Some(Integer.parseInt(s))

  }catch{
    case e:Exception=> None
  }
}
toInt("1")
toInt("Uno")
val txtNumbers=List("1","2","3","4")
txtNumbers.map(toInt)
txtNumbers.map(toInt).flatten



/* 
val x=toInt("1").getOrElse(0)
toInt("1").foreach{i=>printf("Obtener un Int:%d",i)}
toInt("1")match{
    case Some(i)=>printf(i)
    case None => printf("no funco")
}*/





/* Either/left/right */

/* def divideXByY(x:Int,y:Int):Either[String,Int]=
    if(y = 0)Left("Nose puede dividir para 0")
    else Right(x/y)
val x=divideXByY(1,1).right.getOrElse(0)
val x=divideXByY(1,0).right.getOrElse(0)
divideXByY(1,0)match{
  case Left(s) => println("Answer:"+s)
  case Right(i) => println("Answer:"+i)
}

val x=divideXByY(1,0)
x.isLeft
x.left