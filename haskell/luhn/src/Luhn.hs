module Luhn (isValid) where

import Data.Char (digitToInt)

isValid :: String -> Bool
isValid n
  | length n <= 1 = False
  | (sum . doubleEveryOther $ reverse n) `mod` 10 == 0 = True -- TODO needs one more reversion
  | otherwise = True

doubleEveryOther :: String -> Int -- TODO maybe return a string instead and reverse it
doubleEveryOther numberString = mapEveryOther doubleLuhny . map digitToInt numberString

doubleLuhny :: Int -> Int
doubleLuhny x =
  if x * 2 > 9
    then x * 2 - 9
    else x * 2

reverseInt :: Int -> Int
reverseInt x = read (reverse (show x)) :: Integer

mapEveryOther :: (a -> a) -> [a] -> [a]
mapEveryOther f [] = []
mapEveryOther f (x : y) = f x : y
mapEveryOther f (x : y : zs) = f x : y ++ (mapEveryOther zs)