import scala.annotation.tailrec

object PrimeFactors {
  @tailrec
  def factors(n: Long, div: Long = 2, acc: List[Long] = List()): List[Long] = {
    if (div > n) acc else {
      if (n % div == 0) factors(n / div, div, acc :+ div)
      else factors(n, div + 1, acc)
    }
  }
}
