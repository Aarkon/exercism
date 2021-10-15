class School {
  type DB = Map[Int, Seq[String]]
  private var database: DB = Map()

  def add(name: String, g: Int): Unit = {
    this.database = this.database.get(g) match {
      case Some(names) => this.database.updated(g, names :+ name)
      case None => this.database + (g -> Seq(name))
    }
  }

  def db: DB = database

  def grade(g: Int): Seq[String] = database.getOrElse(g, Seq.empty)

  def sorted: DB = database
    .keys
    .toList
    .sorted
    .map(grade => (grade, database(grade).sorted)) // safe because we already know the grade-index is taken from the map
    .toMap
}

