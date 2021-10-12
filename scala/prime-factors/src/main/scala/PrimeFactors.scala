import scala.annotation.tailrec

object PrimeFactors {
  def factors(n: Long): List[Long] = {
    @tailrec
    def factorsRec(n: Long, div: Long, acc: List[Long]): List[Long] = {
      if (div > n) acc else {
        if (n % div == 0) factorsRec(n / div, div, acc :+ div)
        else factorsRec(n, div + 1, acc)
      }
    }

    factorsRec(n, 2, List())
  }
}
