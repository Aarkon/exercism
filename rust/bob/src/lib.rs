pub fn reply(raw_message: &str) -> &str {
    let message = raw_message.trim();
    let question = message.ends_with("?");
    let contains_letters = message.chars().any(char::is_alphabetic);
    let yelled = message.to_uppercase() == message && contains_letters;

    if message.len() == 0 {
        return "Fine. Be that way!";
    }
    if yelled && question {
        return "Calm down, I know what I'm doing!";
    }
    if question {
        return "Sure.";
    }
    if yelled {
        return "Whoa, chill out!";
    }
    "Whatever."
}
