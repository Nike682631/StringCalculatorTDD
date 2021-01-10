# TDD Kata String Calculator


Before you start:
* Try not to read ahead .
* Do one task at a time. The trick is to learn to work incrementally.
* Make sure you only test for correct inputs. there is no need to test for invalid inputs for
  this kata
* Test First!

# Following Tasks were handled in String Calculator Using TDD
1. Return Zero On Empty String.
2. Return Single when input is Single Value.
3. Return Sum of Two Numbers Separated By Comma Delimiter.
4. Return Sum of Two Numbers Separated By Newline Delimiter.
5. Return Sum of More Than Two Numbers Separated By Newline And Comma Delimiter.
6. Throwing an Exception for negative Input and Displaying Negative Input with Exception Message.
7. Ignoring Numbers Greater Than 1000.
8. Delimiters can be of any length with the following format:
   - **“//[delimiter]\n”**
9. Allow multiple delimiters like this:
   - **“//[delim1][delim2]\n”** 
10. handle multiple delimiters with length longer than one char
    - for example:
    “//[**][%%]\n1**2%%3” == 6.
