# SackFix

A Fix implementation developed as a Scala training excercise.  It is a full implementation of the session level
protocol, tested using an sackfix tester, supporting acceptor and initiators using AKKA and Scala.
Hope you find it useful.

## Versions

JDK 1.8, Scala 2.11, SBT 0.13.12, Akka 2.4.16.   Feel free to upgrade.

## Building

It can be build by cloning the project and using SBT (included all the lifecycle just to show you).
To build without coverage instrumentation uncomment build.sbt
coverageEnabled := true

```
sbt clean coverage test coverageReport publishLocal
```

Code coverage reports will then exist as below (yes, my dev laptop is a trusty Vaio running windows..)
```
..\sackfix\sackfix-codegen\target\scala-2.11\scoverage-report
```

To generate the artifacts without the coverage instrumentation.
```
sbt clean publishLocal
```


#  The packages included in SackFix

The sackfix suite has multiple IntelliJ projects.  This one is Sackfix, and holds these projects:

## sackfix-common
Shared utilities and classes for every other package

## sackfix-codegen
A code generator which reads the quickfix4j xml specs and spits out scala case classes
for all messages and fields.

Because the xml configs are derived from Quickfix please note:
This product includes software developed by quickfixengine.org http://www.quickfixengine.org/

The Quickfix license is included in full in the codegen project within the 
resources where the xml resides.

# SackFix family of projects

Please see the associated projects for more information 

1. sackfixmessages - all of the code generated classes
2. sackfixsession - examples of initiators and acceptors using the above
3. sackfixtest - another tiny fix implementation to implement the fix tests from the test spec. It's almost a full 
session layer test implementation, very simple to understand.

# Why SackFix ?

If you like strongly typed API's and want a scala native one, which you can embed in your
project and extend as you want them it could be for you.  If you want a low latency implementation this is not for you as 
sackfix can take 500 micros to 3 millis per message and creates GC.  

Best wishes,
Jonathan
