object PrimeFactors {
  implicit val intToLong: Int => Long = n => n.toLong

  def factors(n: Long): List[Long] = (2L to n).filter(isPrime).toList
  val isPrime: Long => Boolean = (n: Long) => (1L to n).count(i => n % i == 0) < 2
}
