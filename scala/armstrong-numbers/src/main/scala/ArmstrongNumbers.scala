object ArmstrongNumbers {
  val isArmstrongNumber: Int => Boolean = (number: Int) =>
    number.toString.toCharArray
      .map(c => Math.pow(c.asDigit, number.toString.length))
      .sum == number
}