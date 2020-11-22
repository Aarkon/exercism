module Clock
  ( addDelta
  , fromHourMin
  , toString
  ) where

data Clock =
  Clock
    { hour :: Int
    , minute :: Int
    }
  deriving (Eq, Show)

fromHourMin :: Int -> Int -> Clock
fromHourMin incomingHour incomingMinute =
  let clock = Clock 0 0
   in addDelta incomingHour incomingMinute clock

toString :: Clock -> String
toString clock =
  padWithZeroes (hour clock) ++ ":" ++ padWithZeroes (minute clock)

padWithZeroes :: Int -> String
padWithZeroes x = reverse (take 2 ((reverse (show x) ++ "0")))

addDelta :: Int -> Int -> Clock -> Clock
addDelta incomingHour incomingMinute clock = Clock newHour newMinute
  where
    newMinute = ((minute clock) + incomingMinute) `mod` 60
    newHour =
      ((((hour clock) + incomingHour) `mod` 24) +
       ((minute clock) + incomingMinute) `div` 60) `mod`
      24
