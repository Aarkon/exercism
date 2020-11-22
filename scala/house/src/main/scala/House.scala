object House {
	private val verses: Map[Int, String] = Map(
		0 -> "",
		1 -> "the malt that lay in",
		2 -> "the rat that ate",
		3 -> "the cat that killed",
		4 -> "the dog that worried",
		5 -> "the cow with the crumpled horn that tossed",
		6 -> "the maiden all forlorn that milked",
		7 -> "the man all tattered and torn that kissed",
		8 -> "the priest all shaven and shorn that married",
		9 -> "the rooster that crowed in the morn that woke",
		10 -> "the farmer sowing his corn that kept",
		11 -> "the horse and the hound and the horn that belonged to",
	)

	def recite(verseNumberStart: Int, verseNumberEnd: Int): String = {
		var result = ""
		for (rhymeNumber <- verseNumberStart to verseNumberEnd) {
			val start = "This is"
			val end = "the house that Jack built.\n"
			var middle = ""
			for (verseNumber <- 0 until rhymeNumber) {
				middle = " " + verses(verseNumber).concat(middle)
			}
			result = result + start + middle + end
		}
		result + "\n"
	}
}