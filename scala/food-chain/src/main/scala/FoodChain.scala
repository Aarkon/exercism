

object FoodChain {
  val animals = List(
    Animal("fly", ""),
    Animal("spider", "It wriggled and jiggled and tickled inside her."),
    Animal("bird", "How absurd to swallow a bird!"),
    Animal("cat", "Imagine that, to swallow a cat!"))

  val startLine = "I know an old lady who swallowed a "
  val endLine = "I don't know why she swallowed the fly. Perhaps she'll die.\n\n"

  def recite(startVerse: Int, endVerse: Int): String = {
    (startVerse to endVerse).map(i => reciteVerse(i))
      .reduce(_ + _)
  }

  private def reciteVerse(end: Int): String = {
    startLine + (1 to end)
      .reverse
      .map(i => getAnimalString(i - 1))
      .reduce(_ + _) + endLine
  }

  private def getAnimalString(index: Int): String = {
    animals(index).name + ".\n" + getAnimalLine(index)
  }

  private def getAnimalLine(index: Int): String = if (animals(index).line.isBlank) "" else animals(index).line + "\n"

  private def appendCauseLine(sequence: Seq[Int]): String = ""
}

case class Animal(name: String, line: String)