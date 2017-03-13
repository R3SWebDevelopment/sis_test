Stratis coding problem
---
# Problem definition
 * In Linux, write a file of **5 MB size**: `base64.txt`, the file will contain random text in _base64_.
Change the file permissions to read only and _tarball_ a copy of it. After that, **print the MD5 checksum** of your file and rename the _tarball_ to the time since epoch (e.g. `147288392.txt`).

 * In Python, open the original file and find all the numbers in this file. Print a **tuple** containing both a list with all the different consecutive numbers found and the length of that list.
From the list, write to a new file: `numbers.txt` all the _pair numbers_ and all the numbers ending in _5_ or _7_ in _CSV format_.

 * In Java, using the first 1000 characters of the `numbers.txt` file, write a Class that will take a _String_ and return a **List of Integers**, containing all the palindrome numbers identified in chunks of 5 numbers. If nothing is found, try with chunks of 4, after that with chunks of 3. Print your results to the console.
