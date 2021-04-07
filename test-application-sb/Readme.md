# test-application-sb

This module shows that the JEP-238 is also supported by SpringBoot fat jars.

## Usage
Run **mvn clean install** on the multi-release-library

Run **mvn clean package** on this module

Switch from Java 8 to Java11 (or above) and run **java -jar target/test-application-sb-0.0.1-SNAPSHOT.jar**

You will have different outputs depending on Java version.

    Java 8: 3
    java.lang.Thread.getStackTrace(Thread.java:1559)
    com.mechanitis.demo.multi.StackParser.getStack(StackParser.java:16)
    com.mgu.jep238.test.Application.main(Application.java:10)

or

    Java 11: 2
    com.mechanitis.demo.multi.StackParser.getStack(StackParser.java:17)
    com.mgu.jep238.test.Application.main(Application.java:10)
