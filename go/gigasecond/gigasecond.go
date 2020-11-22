// gigasecond exports functionality for calculation in a large time frame.
package gigasecond

// import path for the time package from the standard library
import (
	"time"
)

// AddGigasecond takes a date and adds a gigasecond.
func AddGigasecond(t time.Time) time.Time {
	return t.Add(time.Second * 1000000000)
}
