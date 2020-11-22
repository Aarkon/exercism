module LeapYear (isLeapYear) where

isLeapYear :: Integer -> Bool
isLeapYear year = 
    year `isDivisibleBy` 4
    && (not (year `isDivisibleBy` 100) || year `isDivisibleBy` 400)

isDivisibleBy :: Integer -> Integer -> Bool
isDivisibleBy dividend divisor =
    dividend `rem` divisor == 0

foo: Int -> Int
foo a = a * a
