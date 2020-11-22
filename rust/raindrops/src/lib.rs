pub fn raindrops(n: u32) -> String {
    let mut factors: Vec<u32> = vec![1];

    for potential_factor in 1..=n {
        if n % potential_factor == 0 {
            factors.push(potential_factor);
        }
    }

    let mut result = Vec::<String>::new();
    for factor in factors {
        match factor {
            3 => result.push(String::from("Pling")),
            5 => result.push(String::from("Plang")),
            7 => result.push(String::from("Plong")),
            _ => continue
        }
    }
    if result.is_empty() {
        return n.to_string();
    }
    result.join("")
}
