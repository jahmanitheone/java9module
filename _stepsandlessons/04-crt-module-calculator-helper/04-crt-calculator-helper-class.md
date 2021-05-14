# Create Calculator Helper Class



## Create AddHelper Class

>```
>File -> New -> Class
>Package: com.calculator.internal
>Name: AddHelper
>```
>

Paste this content for the class
```
package com.calculator.internal;

/**
 * Helper class for the calculator. Used only by the calculator.
 * 
 * @author pchauvet
 */
public class AddHelper {

	public int add(int i, int j) {
		return i + j;
	}

	public int add(double i, double j) {
		return (int) (i + j);
	}

}
```
>**Explained**
>
>```
>package com.calculator.internal;
>```
>- Create the AddHelper class in the package: com.calculator.internal.
>
>```
>public class AddHelper {
>    public int add(int i, int j) {
>        return i + j;
>    }
>    public int add(double i, double  j) {
>        return (int) (i + j);
>    }
>}
>	
>```
>- The AddHelper class has two add() methods to do addition.
>
>


