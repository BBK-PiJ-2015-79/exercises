class MockCode(val code: Array[Colour]) extends Code{

  override def getCode = code

  override def toString = code.mkString
}
