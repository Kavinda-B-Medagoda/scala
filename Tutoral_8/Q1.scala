package Tutorial_8
import scala.math._

object Q1 {
  def main(args: Array[String]): Unit = {
    val p1 = Point(1,2)
    val p2 = Point(3,4)
    println(p1.add(p2))
    println(p1.move(2,4))
    println(p1.distance(p2))
    println(p1.switch())
  }

  case class Point(a:Int,b:Int){
    var x:Int = a
    var y:Int = b

    def add(p: Point): Point = {
      val ad = Point(this.x+p.x, this.y+p.y)
      return ad
    }

    def move(l:Int, m:Int): Point ={
      val z = Point(this.x+l,this.y+m);
      return z
    }

    def distance(p:Point): Any ={
      val dx = this.x-p.x
      val dy = this.y-p.y
      val dis = sqrt((dx*dx)+(dy*dy))
      return dis
    }

    def switch(): Point ={
      val x1= this.x;
      this.x = this.y
      this.y = x1
      val p = Point(x,y)
      return p
    }
  }
}
