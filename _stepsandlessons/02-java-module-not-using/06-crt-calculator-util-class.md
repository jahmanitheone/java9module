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
 * Calculator usin using a helper class, AddHelper to do the calculations.
 * 
 * 
 * @author pchauvet
 */
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
