/**
  * Created by chris on 26/01/2016.
  */
class Motorboat {
  def on(): String = {
    "Motor on"
  }
  def off(): String = {
    "Motor off"
  }
  def signal(): String = {
    (new Flare).light()
  }
}
