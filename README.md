# ComplexNumber

This repository contains a Java class `Cmplx` that represents complex numbers and provides operations such as addition and multiplication. The `Cmplx` class encapsulates the real and imaginary parts of a complex number and provides methods to perform arithmetic operations on complex numbers.

## Usage

To use the `Cmplx` class, follow these steps:

1. Clone the repository:
git clone https://github.com/therealvoric/Java-Cmplx.git

2. Import the `Cmplx` class into your Java project.

3. Create instances of complex numbers using the provided constructors:
```
Cmplx c1 = new Cmplx(2, 3); // Create a complex number with real part 2 and imaginary part 3
Cmplx c2 = new Cmplx(1);    // Create a complex number with real part 1 and imaginary part 0
Cmplx c3 = new Cmplx();     // Create a complex number with real part 0 and imaginary part 0
``` 
Perform arithmetic operations on complex numbers:


```
Cmplx sum = c1.add(c2);                // Add two complex numbers
Cmplx product = Cmplx.mult(c1, c2);     // Multiply two complex numbers
```
Access the real and imaginary parts of a complex number:

```
int realPart = c1.getRe();   // Get the real part of a complex number
int imagPart = c1.getIm();   // Get the imaginary part of a complex number
``` 
For more details and examples, do a Pull Request.

## License
This project is licensed under the MIT License.
