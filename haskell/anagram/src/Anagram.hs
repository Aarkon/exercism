module Anagram
  ( anagramsFor
  ) where

import Data.Char (toLower)
import Data.List (sort)

anagramsFor :: String -> [String] -> [String]
anagramsFor xs xss = filter (isAnagram xs) xss

isAnagram :: String -> String -> Bool
isAnagram xs ys
  | lowerXs == lowerYs = False
  | otherwise = (sort lowerXs) == (sort lowerYs)
  where lowerXs = map toLower xs
        lowerYs = map toLower ys
