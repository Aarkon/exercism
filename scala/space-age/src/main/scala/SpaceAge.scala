object SpaceAge {

	val EARTH_YEAR_SECONDS = 31557600

	private def baseAge(ageInSeconds: Double, factor: Double) = {
		ageInSeconds / (EARTH_YEAR_SECONDS * factor)
	}

	def onEarth(ageInSeconds: Double): Double = {
		baseAge(ageInSeconds, 1)
	}

	def onMercury(ageInSeconds: Double): Double = {
		baseAge(ageInSeconds, 0.2408467)
	}

	def onVenus(ageInSeconds: Double): Double = {
		baseAge(ageInSeconds, 0.61519726)
	}

	def onMars(ageInSeconds: Double): Double = {
		baseAge(ageInSeconds, 1.8808158)
	}

	def onJupiter(ageInSeconds: Double): Double = {
		baseAge(ageInSeconds, 11.862615)
	}

	def onSaturn(ageInSeconds: Double): Double = {
		baseAge(ageInSeconds, 29.447498)
	}

	def onUranus(ageInSeconds: Double): Double = {
		baseAge(ageInSeconds, 84.016846)
	}

	def onNeptune(ageInSeconds: Double): Double = {
		baseAge(ageInSeconds, 164.79132)
	}
}