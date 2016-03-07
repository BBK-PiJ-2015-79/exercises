/**
  * Created by chris on 26/02/2016.
  */
object TestScript extends App {
  val cc = new CodeController(new CodeImpl(4))
  //println(cc.SIZE_OF_CODE)
  println(cc.code)


}
