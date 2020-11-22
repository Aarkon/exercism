object BeerSong {
	def recite(beers: Int, numberOfVerses: Int): String = {
		var result: String = ""
		for (verseNumber <- 0 until numberOfVerses) result = result ++ oneVerse(beers - verseNumber) ++ "\n"
		result.dropRight(1)
	}

	private def oneVerse(beers: Int): String = {
		beers match {
			case 0 => "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
			case 1 => "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
			case 2 => "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
			case _ => s"$beers bottles of beer on the wall, $beers bottles of beer.\nTake one down and pass it around, ${beers - 1} bottles of beer on the wall.\n"
		}
	}
}