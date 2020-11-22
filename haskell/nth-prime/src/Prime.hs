module Prime
  ( nth
  ) where

nth :: Int -> Maybe Integer
nth 0 = Nothing
nth n = Just (last (generatePrimes n))

generatePrimes :: Int -> [Integer]
generatePrimes n = take n [x | x <- [toInteger 2 ..], isPrime x]

isPrime :: Integer -> Bool
isPrime 1 = False
isPrime n = [x | x <- [1 .. n], n `mod` x == 0] == [1, n]
