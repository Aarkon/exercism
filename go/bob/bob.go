// This is bob, a lackadaisical teenager.
package bob

import (
	"strings"
	"unicode"
)

// Hey tells bob to answer your remark.
func Hey(remark string) string {
	remark = trim(remark)

	answer := "Whatever."

	isQuestion := strings.HasSuffix(remark, "?")
	isYelled := strings.ToUpper(remark) == remark && strings.ContainsAny(strings.ToLower(remark), "abcdefghijklmnopqrstuvwxyz")

	if isQuestion {
		answer = "Sure."
	}
	if isYelled {
		answer = "Whoa, chill out!"
	}
	if isYelled && isQuestion {
		answer = "Calm down, I know what I'm doing!"
	}
	if remark == "" {
		answer = "Fine. Be that way!"
	}

	return answer
}

func trim(remark string) string {
	return strings.TrimFunc(remark, func(r rune) bool {
		return !(unicode.IsDigit(r) || unicode.IsLetter(r) || strings.ContainsAny(string(r), "();:-!§$%&/()=?)"))
	})
}
