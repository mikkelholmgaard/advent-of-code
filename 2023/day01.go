package main

import (
	"fmt"
	"os"
	"strconv"
	"strings"
)

func part1() {
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

func part2() {
	data, err := os.ReadFile("input/01.txt")
	if err != nil {
		fmt.Println("File reading error", err)
		return
	}
	lines := strings.Split(string(data), "\n")

	var result int64

	for i := 0; i < len(lines); i++ {
		line := strings.Replace(lines[i], "zero", "zero0zero", -1)
		line = strings.Replace(line, "one", "one1one", -1)
		line = strings.Replace(line, "two", "two2two", -1)
		line = strings.Replace(line, "three", "three3three", -1)
		line = strings.Replace(line, "four", "four4four", -1)
		line = strings.Replace(line, "five", "five5five", -1)
		line = strings.Replace(line, "six", "six6six", -1)
		line = strings.Replace(line, "seven", "seven7seven", -1)
		line = strings.Replace(line, "eight", "eight8eight", -1)
		line = strings.Replace(line, "nine", "nine9nine", -1)

		var lineNum string

		for j := 0; j < len(line); j++ {
			char := string(line[j])

			if number, err := strconv.ParseInt(char, 10, 64); err == nil {
				lineNum += strconv.FormatInt(number, 10)
				break
			}
		}

		for j := len(line) - 1; j >= 0; j-- {
			char := string(line[j])

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

func main() {
	part1()
	//part2()
}
