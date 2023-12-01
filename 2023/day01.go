package main

import (
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	data, err := os.ReadFile("input/01.txt")
	if err != nil {
		fmt.Println("File reading error", err)
		return
	}
	lines := strings.Split(string(data), "\n")

	var result int64

	for i := 0; i < len(lines); i++ {
		var lineNum string

		for j := 0; j < len(lines[i]); j++ {
			char := string(lines[i][j])

			if number, err := strconv.ParseInt(char, 10, 64); err == nil {
				lineNum += strconv.FormatInt(number, 10)
				break
			}
		}

		for j := len(lines[i]) - 1; j >= 0; j-- {
			char := string(lines[i][j])

			if number, err := strconv.ParseInt(char, 10, 64); err == nil {
				lineNum += strconv.FormatInt(number, 10)
				break
			}
		}

		number, _ := strconv.ParseInt(lineNum, 10, 64)
		result += number
	}

	fmt.Println(result)
}
