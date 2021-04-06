# Usage
Run **mvn clean package** on the multi-release-library

Run **mvn clean package** on this module

Switch from Java 8 to Java11 (or above) and run **java -cp target/test-application-1.0-SNAPSHOT.jar:../multi-release-library/final-module/target/final-release-1.0-SNAPSHOT.jar com.mgu.jep238.test.Application**

You will have different outputs depending on Java version.

    Java 8: 3
    java.lang.Thread.getStackTrace(Thread.java:1559)
    com.mechanitis.demo.multi.StackParser.getStack(StackParser.java:16)
    com.mgu.jep238.test.Application.main(Application.java:10)

or

    Java 11: 2
    com.mechanitis.demo.multi.StackParser.getStack(StackParser.java:17)
    com.mgu.jep238.test.Application.main(Application.java:10)
