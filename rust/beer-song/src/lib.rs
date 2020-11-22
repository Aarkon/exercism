pub fn verse(n: i32) -> String {
    match n {
        2 => {
            format!("{} bottles of beer on the wall, {} bottles of beer.
Take one down and pass it around, {} bottle of beer on the wall.\n", n.to_string(), n.to_string(), (n - 1))
        }
        1 => {
            format!("{} bottle of beer on the wall, {} bottle of beer.
Take it down and pass it around, {} bottles of beer on the wall.\n", n.to_string(), n.to_string(), "no more")
        }
        0 => {
            "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n".to_string()
        }
        _ => {
            format!("{} bottles of beer on the wall, {} bottles of beer.
Take one down and pass it around, {} bottles of beer on the wall.\n", n.to_string(), n.to_string(), (n - 1).to_string())
        }
    }
}

pub fn sing(start: i32, end: i32) -> String {
    (end..=start).rev()
        .map(|n| verse(n))
        .collect::<Vec<String>>()
        .join("\n")
}
