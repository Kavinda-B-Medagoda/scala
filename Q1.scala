package demo

object Q1 {
  def main(Args: Array[String]): Unit = {
    val x = new RationalNum(1,3)
    println(x.neg);
  }

  class RationalNum(x:Int, y:Int){
    def numer: Int = x
    def denom: Int = y
    def neg = new RationalNum(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
  }

}
