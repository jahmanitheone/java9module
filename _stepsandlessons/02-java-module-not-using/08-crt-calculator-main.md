# Create CalculatorMain Main Class
[toc]


## Create CalculatorMain Class
```
File -> New -> Class
Package: com.calculator
Name: CalculatorMain
```



Paste this content for the class:

```
package com.calculator;

import com.calculator.util.Calculator;

/**
 * package com.calculator.internal<br/>
 * It has the AddHelper class that does addition calculations. It is a helper
 * class.
 * 
 * 
 * package com.calculator.util<br/>
 * contains the Calculator class. It's the calculator API we expose external. It
 * uses the AddHelper class to the calculations.
 *
 * For now it's not possible to hide the AddHelper and make the
 * com.calculator.internal private to the Calculator class. Unless we make it an
 * inner class arrangement.
 * 
 * Java new modular approach can help instead of inner classes.
 * 
 * @author pchauvet
 */
public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int result = calc.add(12.2, 12.3);

		System.out.println(result);
	}

}
```
>**Explained**
>
>```
>package com.calculator;
>```
>- Create the CalculatorMain class in the package: package com.calculator;;
>
>This package is different for the AddHelper and Calculator class.
>```
>public class CalculatorMain {
>
>    public static void main(String[] args) {
>        Calculator calc = new Calculator();
>        int result = calc.add(12.2, 12.3);
>
>        System.out.println(result);
>    }
>    
>}
>```
>
>- The CalculatorMain class calls the Calculator utility class. 
>
> 




## Run The CalculatorMain

```
Right click CalculatorMain->Run As->Java Application
```
>**Explained**
>
>```
>We see 24 in the console as output.
>```
>


