import javax.swing.plaf.ColorUIResource

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
case class Amber() extends Colour
case class Cyan() extends Colour
case class Dirt() extends Colour
case class Emerald() extends Colour
case class Fuschia() extends Colour
case class Heliotrope() extends Colour
case class Indigo() extends Colour
case class Jade() extends Colour
case class Khaki() extends Colour
case class Lavender() extends Colour
case class Maroon() extends Colour
case class Navy() extends Colour
case class Quartz() extends Colour
case class Silver() extends Colour
case class Teal() extends Colour
case class Ultramarine() extends Colour
case class Violet() extends Colour
case class Wisteria() extends Colour
case class Xanthic() extends Colour
case class Zucchini() extends Colour
