object Bob {
  def response(raw_statement: String): String = {
    val statement = raw_statement.trim()
    val isQuestion = statement.endsWith("?")
    val containsLetters = statement.exists(_.isLetter)
    val isYelled = statement.toUpperCase == statement && containsLetters

    if (statement.isBlank) "Fine. Be that way!"
    else if (isYelled && isQuestion) "Calm down, I know what I'm doing!"
    else if (isYelled) "Whoa, chill out!"
    else if (isQuestion) "Sure."
    else "Whatever."
  }
}
