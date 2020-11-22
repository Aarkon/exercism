import scala.collection.mutable
import scala.util.Random

class Robot {
  var name: String = RobotName.randomName()

  def reset(): Unit = {
    name = RobotName.randomName()
  }
}

object RobotName {
  val recentNames= mutable.HashSet.empty[String]

  @scala.annotation.tailrec
  def takeRandomNFromSequence(sequence: String, n: Int, result: String = ""): String = {
    if (result.length() >= n) {
      result
    } else {
      takeRandomNFromSequence(sequence, n, result + sequence(Random.nextInt(sequence.length() - 1)))
    }
  }

  @scala.annotation.tailrec
  def randomName(): String = {
    val name = RobotName.takeRandomNFromSequence(('A' to 'Z').mkString, 2) +
      RobotName.takeRandomNFromSequence((0 to 9).mkString, 3)

    if (!recentNames.contains(name)) {
      recentNames += name
      name
    } else {
      randomName()
    }
  }
}