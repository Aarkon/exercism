pub fn reply(raw_message: &str) -> &str {
    let message: &str = raw_message.trim();
    let question: bool = message.ends_with("?");
    let contains_letters: bool = message.chars().any(char::is_alphabetic);
    let yelled: bool = message.to_uppercase() == message && contains_letters;

    const FINE: &str = "Fine. Be that way!";
    const CALM_DOWN: &str = "Calm down, I know what I'm doing!";
    const SURE: &str = "Sure.";
    const CHILL_OUT: &str = "Whoa, chill out!";
    const WHATEVER: &str = "Whatever.";

    if message.is_empty() {
        return FINE;
    }

    match (yelled, question) {
        (true, true) => CALM_DOWN,
        (_, true) => SURE,
        (true, _) => CHILL_OUT,
        _ => WHATEVER
    }
}
