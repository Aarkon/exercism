import java.util.Arrays;
import java.util.stream.Collectors;

class Acronym {
	private final String phrase;

	Acronym(String phrase) {
		this.phrase = phrase.strip();
	}

	String get() {
		return Arrays.stream(phrase.replace("'", "").replace("_", "").split("[\\W]"))
				.filter(sequence -> sequence.length() >= 1)//
				.map(string -> string.charAt(0))//
				.map(Object::toString)//
				.map(String::toUpperCase)//
				.collect(Collectors.joining());
	}
}
