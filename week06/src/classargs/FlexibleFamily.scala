package classargs

class FlexibleFamily(mother: String, father: String, kids: String*) {

  def familySize() = 2 + kids.size

}
