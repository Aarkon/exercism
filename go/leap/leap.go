// leap provides functionality to work out if a given year is a leap year or not.
package leap

// IsLeapYear takes an integer and returns if the year is a leap year or not.
func IsLeapYear(year int) bool {
	return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0 )
}
