# Create Calculator Utility Class
[toc]


## Create Calculator Class
```
File -> New -> Class
Package: com.calculator.util
Name: Calculator
```



Paste this content for the class:

```
package com.calculator.util;

import com.calculator.internal.AddHelper;

/**
 * Calculator is the API exposed externally.<br/>
 * 
 * AddHelper is the internal utility doing the calculation. We are not using
 * inner class to hide the AddHelper class. We are using the modular approach to
 * hide the AddHelper from other external usage.
 * 
 * @author pchauvet
 */
public class Calculator {
	AddHelper helper = new AddHelper();

	public int add(int i, int j) {
		return helper.add(i, j);
	}

	public int add(double i, double j) {
		return helper.add(i, j);
	}

}
```
>**Explained**
>
>```
>package com.calculator.util;
>```
>- Create the Calculator class in the package: package com.calculator.util;
>
>This package is different for the AddHelper package com.calculator.internal.
>
```
  public class Calculator {
    	AddHelper helper = new AddHelper();
  
      public int add(int i, int j) {
            return helper.add(i, j);
       }
       
  	public int add(double i, double  j) {
        	return helper.add(i, j);
    	}
    	
  }
```

>
> 
> - The Calculator class has two add() methods using the AddHelper class.
>
> - Create the Calculator class in the package: package com.calculator.util;
> 
