package main

import "fmt"

func KelvinToCelsius(kelvin float32) float32{
	return kelvin - 273.15
}

func main() {
	
	var value float32
	fmt.Println("Convert from Kelvin to Celsius.")
	fmt.Scanf("%f", &value)

	celsius := KelvinToCelsius(value)
	fmt.Println("The value converted is: ", celsius)		
}