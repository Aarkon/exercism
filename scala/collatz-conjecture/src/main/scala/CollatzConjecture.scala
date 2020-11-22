import scala.annotation.tailrec

object CollatzConjecture {

  @tailrec
  def steps(value: Int, counter: Int = 0): Option[Int] = value match {
    case 1 => Some(counter)
    case _ if value < 1 => None
    case _ if value % 2 == 0 => steps(value / 2, counter + 1)
    case _ => steps(value * 3 + 1, counter + 1)
  }
}