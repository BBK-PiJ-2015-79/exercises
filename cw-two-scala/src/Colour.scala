sealed trait Colour {
  override def toString = {
    getClass.getName.charAt(0).toString
  }
}
case class Blue() extends Colour
case class Green() extends Colour
case class Orange() extends Colour
case class Purple() extends Colour
case class Red() extends Colour
case class Yellow() extends Colour
