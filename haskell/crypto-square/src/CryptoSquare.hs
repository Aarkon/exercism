module CryptoSquare
  ( encode
  ) where

import Data.Char (isAlphaNum, toLower)

encode :: String -> String
encode [] = []
encode xs = encodeRec ((square . normalize) xs) []

encodeRec :: [String] -> String -> String
encodeRec xss xs
  | length (head xss) > 0 =
    let newList = map tail xss
        result = xs ++ (map head xss) ++ " " 
     in encodeRec newList result
  | otherwise = xs

square :: String -> [String]
square xs =
  let rows = (floor . sqrt) (fromIntegral (length normalized))
      columns =
        if (length normalized) `rem` rows == 0
          then rows
          else rows + 1
   in [ padWithNSpaces (columns - (length x)) x
      | x <- (splitEvery columns normalized)
      ]
  where
    normalized = normalize xs

normalize :: String -> String
normalize xs = [toLower x | x <- xs, isAlphaNum x]

splitEvery :: Int -> String -> [String]
splitEvery n xs = splitEveryRec n xs []

splitEveryRec :: Int -> String -> [String] -> [String]
splitEveryRec _ [] buffer = buffer
splitEveryRec n xs buffer = splitEveryRec n newString (buffer ++ ([take n xs]))
  where
    newString = drop n xs

padWithNSpaces :: Int -> String -> String
padWithNSpaces n xs
  | n < 1 = xs
  | otherwise = padWithNSpaces (n - 1) (xs ++ " ")
