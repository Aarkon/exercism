pub fn nth(n: u32) -> u32 {
    let mut count = 0;
    let mut prime = 2;
    while count < n {
        prime = next_prime(prime);
        count += 1;
    }
    prime
}

fn is_prime(n: u32) -> bool {
    if n == 1 {
        return false;
    }

    for i in 2..n {
        if n % i == 0 {
            return false;
        }
    }
    true
}

fn next_prime(n: u32) -> u32 {
    let mut i = n + 1;
    while !is_prime(i) {
        i += 1;
    }
    i
}
