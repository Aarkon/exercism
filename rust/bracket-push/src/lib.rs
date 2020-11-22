use std::collections::HashMap;

pub fn brackets_are_balanced(string: &str) -> bool {
    let mut stack: Vec<char> = Vec::new();
    let brackets = "{[()]}";
    let associations: HashMap<char, char> = [('{', '}'), ('[', ']'), ('(', ')')]
        .iter()
        .cloned()
        .collect();

    let filtered_only: String = string.chars().filter(|&c| brackets.contains(c)).collect();

    for character in filtered_only.chars() {
        if brackets[0..3].contains(character) {
            stack.push(character);
        } else {
            if stack.is_empty() {
                return false;
            };
            if *associations.get(stack.last().unwrap()).unwrap() != character {
                return false;
            };
            stack.pop();
        };

    }
    stack.is_empty()
}
