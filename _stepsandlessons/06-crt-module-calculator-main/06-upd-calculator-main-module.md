# Update The Calculator Main Module
[toc]

## Update the module-info.java 
>```
>module calculator.main {
>	/** 
>	 * Indicate that this projects requires the calculator.helper project.  
>	 */
>	requires calculator.helper;
>}
>```
>
>**Explained**
>
>```
>requires calculator.helper;
>```
>- This modular application requires the calculator.helper module.
>- That way, we can access the packages in the calculator.helper project.
>



There is still and issue with accessing this calculator.helper module. We have to configure the project 06-crt-module-calculator-main to access the calculator.helper module.



## Configure 06-crt-module-calculator-main project dependent module
```
Right click 06-crt-module-calculator-main project -> Build Path -> Configure Build Path ->
Select Modulepath -> Add -> Select 04-crt-calculator-helper-module -> [Ok]
[Apply and Close]
```
>**Explained**
>
>- The errors will disappear.
>- The Calculator can be imported: import com.calculator.util.Calculator;
>- 
>- If we try to import: import com.calculator.internal.AddHelper, we get an error.
>- AddHelper is private to the 04-crt-calculator-helper-module module.
>
>







