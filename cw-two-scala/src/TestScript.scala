/**
  * Created by chris on 26/02/2016.
  */
object TestScript extends App {
  val cc = new CodeController
  println(cc.SIZE_OF_CODE)
  println(cc.code)

//  val g1 = new Guess(Vector(Blue(), Blue(), Green(), Red()))
//  val g2 = new Guess(Vector(Red(), Yellow(), Green(), Red()))
//
//  val g1Sizes = g1.coloursGuessed.groupBy(identity).mapValues(_.size)
//  val g2Sizes = g2.coloursGuessed.groupBy(identity).mapValues(_.size)
//
//  println(g1.coloursGuessed.groupBy(identity).mapValues(_.size))
//  println(g2.coloursGuessed.groupBy(identity).mapValues(_.size))
//
//  for(pair <- g1Sizes) {
//    val otherSize = g2Sizes.get(pair._1).getOrElse(pair._1,0)
//    println(pair._1)
//    if(pair._2 < otherSize) println(pair._2) else println(otherSize)
  }

}
