# Area Under Polynomial Function Calculator

![Java CI with Maven](https://github.com/<your_username>/area-under-polynomial-function/workflows/Java%20CI%20with%20Maven/badge.svg)  <!-- Replace <your_username> and area-under-polynomial-function with your repo details -->

This Java program calculates the approximate area under the graph of a polynomial function using the trapezoidal rule.

## Features

*   Calculates the area under the graph of any polynomial function.
*   Takes user input for the coefficients of the polynomial, the interval of integration, and the number of intervals to use for the approximation.
*   Uses the trapezoidal rule for numerical integration.
*   Provides a formatted output of the calculated area.
*   Calculates the absolute value of the function in order to calculate the area above the x axis.

## How It Works

The program prompts the user for the degree and coefficients of the polynomial function, the interval (start and end points), and the number of intervals to use for the approximation. It then calculates the area under the curve using the trapezoidal rule, which approximates the area by dividing the interval into a number of trapezoids and summing their areas.  The `getValueFunction()` method calculates the absolute value of the polynomial for a given `x` value, ensuring that the area calculated is above the x-axis.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) installed (version 8 or later)
*   Maven (optional, for building and running with Maven)

### Cloning the repository

To clone this repository to your local machine, use the following command:

```bash
git clone https://github.com/<your_username>/area-under-polynomial-function.git
