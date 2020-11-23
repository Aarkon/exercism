object PrimeFactors {
  val factors: Long  => Seq[Long] = (n: Long) => (1 to n).filter(isPrime)
  val isPrime: Long => Boolean = (n: Long) => (1 to n).count(i => n % i == 0) < 2
}
