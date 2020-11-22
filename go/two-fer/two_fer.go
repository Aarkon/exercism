// Package containing the ShareWith function, solving the two-fer task.
package twofer

import "fmt"

// ShareWith takes a name and returns the famous "One for..." sentence with the given name inserted.
// "you" is used if the name is empty.
func ShareWith(name string) string {
	if name == "" {
		name = "you"
	}
	return fmt.Sprintf("One for %s, one for me.", name)
}
