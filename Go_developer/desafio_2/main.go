package main

import "fmt"


func main(){


	for i := 1; i < 101; i++ {
		

		mult_3 := i % 3 
		mult_5 := i % 5

		switch{

		case (mult_3 == 0) && (mult_5 == 0):
			fmt.Println("PIN PAN")
		
		case mult_3 == 0:
			fmt.Println("pin")
		
		case mult_5 == 0:
			fmt.Println("pan")
		}

	}
}