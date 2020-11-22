case class Triangle(x: Double, y: Double, z: Double) {
  val sides = Set(x, y, z)

  private val triangleInequality: Boolean = {
    val everySide = List(x, y, z)
    everySide.map(side => side <= (everySide.sum - side)).min
  }

  private val nonZero: Boolean = !sides.contains(0)

  val equilateral: Boolean = sides.size <= 1 && nonZero
  val isosceles: Boolean = Set(x, y, z).size <= 2 && nonZero && triangleInequality
  val scalene: Boolean = Set(x, y, z).size >= 3 && nonZero && triangleInequality
}