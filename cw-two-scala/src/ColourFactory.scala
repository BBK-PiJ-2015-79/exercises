class ColourFactory {

  def getInstance(colour : String): Colour = colour match{
      case("A") => Amber()
      case("B") => Blue()
      case("C") => Cyan()
      case("D") => Dirt()
      case("E") => Emerald()
      case("F") => Fuschia()
      case("G") => Green()
      case("H") => Heliotrope()
      case("I") => Indigo()
      case("J") => Jade()
      case("K") => Khaki()
      case("L") => Lavender()
      case("M") => Maroon()
      case("N") => Navy()
      case("O") => Orange()
      case("P") => Purple()
      case("Q") => Quartz()
      case("R") => Red()
      case("S") => Silver()
      case("T") => Teal()
      case("U") => Ultramarine()
      case("V") => Violet()
      case("W") => Wisteria()
      case("X") => Xanthic()
      case("Y") => Yellow()
      case("Z") => Zucchini()
      case(x) => null
  }
}
