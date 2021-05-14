# Update The Calculator Helper Module
[toc]

## Update the module-info.java 
>```
>module calculator.helper {
>	/**
>	 * The only packaged exposes is com.calculator.util.
>	 * 
>	 * com.calculator.internal is not exposed externally. It's treated as if a
>	 * private package to this project.
>	 */
>	exports com.calculator.util;
>}
>```
>
>**Explained**
>
>```
>exports com.calculator.util;
>```
>- This java module exports the com.calculator.util package.
>- The com.calculator.internal is not exposed externally. It's treated as if this package is a private package. This package is only available to the  com.calculator.util package in this project.
>
>




