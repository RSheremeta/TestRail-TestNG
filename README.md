# TestRail-TestNG
This  Library helps you to integrate your TestNG-based tests with TestRail in an easily manner.

## Installation
1 Since it's not pushed to the MVN central repository yet, there are two installation options:

* Download already compiled and packaged **TestRail-TestNG-1.0.jar** file [HERE][here] and proceed to the 2nd step
* Download source code [HERE][here] to your local machine, make a jar by running **`mvn package`** in the repo directory and proceed to the 2nd step

2 Put a **TestRail-TestNG-1.0.jar** file into your project directory (for instance – create root dir `~/libs/` and paste there)

3 Add this dependency to your `pom.xml` (**systemPath** value is for instance)
````
    <dependency>
      <groupId>com.github.rsheremeta</groupId>
      <artifactId>TestRail-TestNG</artifactId>
      <version>1.0</version>
      <scope>system</scope>
      <systemPath>${basedir}/libs/TestRail-TestNG-1.0.jar</systemPath>
    </dependency>
````

## Usage
1. See my article on Medium – [Link][link]

![Medium article](https://i.ibb.co/gm5knGG/2021-02-20-14-52-24.png)


[here]: https://github.com/RSheremeta/TestRail-TestNG/releases/tag/1.0
[link]: https://rsheremeta.medium.com/integrate-your-testng-tests-with-testrail-b7c72726a13c

