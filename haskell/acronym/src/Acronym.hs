module Acronym (abbreviate) where
import Data.Char (isUpper, toUpper)

abbreviate :: String -> String
abbreviate [] = []
abbreviate [x] = [toUpper x]
abbreviate xs =
  abbreviateRecursively ' ' xs []

abbreviateRecursively :: Char -> String -> String -> String
abbreviateRecursively _ [] result  = result
abbreviateRecursively lastChar remainingChars result
  | elem currentChar unwantedCharacters = abbreviateRecursively currentChar (tail remainingChars) result
  | isUpper currentChar && not (isUpper lastChar) || elem lastChar unwantedCharacters  =
    abbreviateRecursively currentChar (tail remainingChars) (result ++ [toUpper currentChar])
  | otherwise = abbreviateRecursively currentChar (tail remainingChars) result
      
  where
    currentChar = head remainingChars
    unwantedCharacters = [' ', '-'] 
