import scala.annotation.tailrec
import scala.collection.immutable

object MatchingBrackets {
	private val forwardMatches = immutable.HashMap('[' -> ']', '{' -> '}', '(' -> ')').withDefaultValue('0') // arbitrary character
	private val backwardMatches = forwardMatches.map(_.swap)

	@tailrec
	def isPaired(input: String, bracketStack: List[Char] = List()): Boolean = {
		if (input.isBlank) {
			return bracketStack.isEmpty
		}

		val current = input.head
		if (forwardMatches.contains(current)) {
			isPaired(input.tail, current :: bracketStack)
		} else if (backwardMatches.contains(current) &&
			(bracketStack.isEmpty || bracketStack.head != backwardMatches(current))) {
			false
		} else if (backwardMatches.contains(current)) {
			isPaired(input.tail, bracketStack.tail)
		} else {
			isPaired(input.tail, bracketStack)
		}
	}
}
