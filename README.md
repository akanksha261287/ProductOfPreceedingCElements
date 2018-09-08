# ProductOfPreceedingCElements

### Problem Statement

You have a range of consecutive numbers, from 1 to n (inclusive). e.g. [1,2,3,4,...,n].

 

We would like to calculate a sum of a function across the entire range, where the function returns the product of the *preceding* C elements.

 

If there are less than C previous elements, just use the available numbers. i.e. if you are processing the fourth number in the range, but C is greater than 3, then you will calculate the product using only the 3 available preceding numbers. In this situation as you move further along in this range more preceding numbers become available.

 

A worked example follows: if n=5 and C=2, the correct products and final sum for each element of the range are: 0 + 1 + 2 + 6 + 12 = 21

 

The solution should be implemented in Java.

 

Initially calculate the value where n=100 and C=10, and let us know the answer
Please additionally tell us the values where n=1000000 and C=200, but only include the first 10 digits of the result in your answer.
What is the algorithmic complexity of your solution?
What would be your answer if you needed to calculate n=10,000,000 and C=200 ?

### Algorithmic Complexity

The algorithmic complexity of this solution is n*n i.e. n^2.

## Getting Started

Download the project in your local.<br />
Import it as a Java Project in your IDE.<br />
You can also run from command promt directly using "java -jar"<br />

### Prerequisites

JDK 1.8 or higher <br />
JUNIT 4 or higher <br />

## Running the JUNIT Test Cases
JUNIT test cases can either be ran from command prompt or IDE <br />
If you are running from command prompt you can run by using the below commands<br />

java -cp junit.jar org.junit.runner.JUnitCore [test class name] [fileName] <br />
PortFolioInputInvalidEndingMarketValue.txt
You can also run the JUNIT classes individually from IDE.<br />

Below are the list of classes and it's purposes.<br />
**Class Name:** TestProductOfElements <br />
**Method Name:** testFirstQuestion  <br />
**Purpose:** To calculate and validate the value with n=100 and C=10<br />

**Class Name:** TestProductOfElements <br />
**Method Name:** testSecondQuestion  <br />
**Purpose:** To calculate and validate the value with n=1000000 and C=200 and print only first 10 digits<br />

**Class Name:** TestProductOfElements <br />
**Method Name:** testFourtQuestion  <br />
**Purpose:** To calculate and validate the value with n=10000000 and C=200<br />

