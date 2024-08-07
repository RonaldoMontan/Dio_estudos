package main

import "fmt"

func KelvinToCelsius(kelvin float32) float32{
	return kelvin - 273.15

}

func main() {
	
	var valor float32
	fmt.Println("Conversão de Kelvin para Celsius.")
	fmt.Scanf("%f", &valor)

	celsius := KelvinToCelsius(valor)
	fmt.Println("O valor convertido é: ", celsius)
		
}