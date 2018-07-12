# Flatten-Nested-Array-Of-Integers

## About

This is a very small SBT application which contains a single function and its unit test suite as well as auto generated property based test suite.


### Note

- Since this does not have anything to run with, I did not create any extra code to run and validate
- However, all the test cases can be run on the project which basically takes care of the testing part


## Prerequisite

This application requires SBT as a prerequisite.

## How to run

- Download (and extract)/ Clone this project to your local
- Goto root directory of the project
- Start SBT. ```sbt```
- and then hit run command `run`

Note:
- This application calls the flattening array function with hardcoded input array: `Array(1, Array(2,3), 4, Array(5, Array(6, Array(7))))`
- Running this application with out any change should result the output as below.
```
   Resultant array's elements are: 1,2,3,4,5,6,7
```
- Feel free to change the value of `inputArray` at `Application.scala` accordingly to run this application for different input

## How to test

- Download (and extract)/ Clone this project to your local
- Goto root directory of the project
- Start SBT. ```sbt```
- Then, to run all tests, run the command `test`. That's it.


Thanks!
