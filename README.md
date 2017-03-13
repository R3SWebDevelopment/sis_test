# Stratis coding problem
---
## Problem definition
 * In Linux, write a file of **5 MB size**: `base64.txt`, the file will contain random text in _base64_.
Change the file permissions to read only and _tarball_ a copy of it. After that, **print the MD5 checksum** of your file and rename the _tarball_ to the time since epoch (e.g. `147288392.txt`). _Yes, this you have to submit as a script!_

 * In Python, open the original file and find all the numbers in this file. Print a **tuple** containing both a list with all the different consecutive numbers found and the length of that list.
From the list, write to a new file: `numbers.txt` all the _pair numbers_ and all the numbers ending in _5_ or _7_ in **CSV format**.

 * In Java, using the first 1000 characters of the `numbers.txt` file, write a Class that will take a _String_ and return a **List of Integers**, containing all the palindrome numbers identified in chunks of 5 numbers. If nothing is found, try with chunks of 4, after that with chunks of 3. Print your results to the console.

## How to submit?
 * Use **no external modules/libraries**, other than those provided with your runtime environment
 * Be creative with your solution, there is no right answer but some will work better
 * Submit the instructions for using your solution
 * Measure the time your solution takes to complete all the steps
   * If possible, include unit tests
 * Submit your solution via Github (fork this project and send back the URL via e-mail/in-mail, **do not comment here nor create pull requests from this project**)
