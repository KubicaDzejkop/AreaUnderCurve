# Function Area Calculator

This repository contains a simple Java program that calculates the area under the graph of a polynomial function. The program uses numerical integration (the trapezoidal rule) to approximate the area between two points on the x-axis.

## Features

- **Supports polynomial functions of any degree.**
- **Interactive console interface:** Users input the degree and coefficients of the polynomial.
- **Customizable integration interval and accuracy:** Users set the start and end points of the interval and the number of subdivisions for numerical integration.
- **Displays the polynomial function and the computed area.**

## How It Works

1. The program prompts the user for the degree of the polynomial.
2. The user enters the coefficients for each term.
3. The user specifies the start and end of the interval over which to calculate the area.
4. The user sets the number of intervals (higher numbers mean greater accuracy but longer computation time).
5. The program computes the area under the function using the trapezoidal rule and displays the result.

## Example

```
Program liczy pole pod wykresem funkcji
Podaj stopień wielomianu
2
Podaj współczynniki wielomianu w ilości 3
1
-3
2
f(x) = 1.0x^2 + -3.0x^1 + 2.0x^0 + 
Podaj początek i koniec przedziału
0
3
Podaj liczbę przedziałów (im większa to dokładność jest większa, lecz czas się przedłuża)
1000
Pole pod wykresem funkcji wynosi 9.000
```

## How to Run

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Cloning the Repository

Open your terminal and run:

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git
cd YOUR_REPOSITORY_NAME
```

### Compiling and Running

```bash
javac Main.java
java Main
```

Follow the prompts in your console to input the polynomial and interval details.

## Code Overview

- `getCoefficients()`: Reads the degree and coefficients of the polynomial from user input.
- `printFunction(coefficients)`: Prints the polynomial equation in human-readable form.
- `calculateFunctionArea(coefficients, start, end, intervals)`: Uses the trapezoidal rule to compute the approximate area under the curve.
- `getValueFunction(coefficients, valueX)`: Evaluates the polynomial at a given x-value.
- **Main method:** Coordinates user input and displays the result.

## Notes

- The function always computes the absolute value for the area, so it works for functions that may cross the x-axis.
- Increasing the number of intervals increases accuracy but also computation time.

## License

This project is open-source and free to use for educational purposes.
