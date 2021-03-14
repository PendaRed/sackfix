<a href="http://www.sackfix.org/"><img src ="http://www.sackfix.org/assets/sf_logo.png" /></a>

# SackFix

A Fix implementation developed as a Scala training excercise.  It is a full implementation of the session level
protocol, tested using an sackfix tester, supporting acceptor and initiators using AKKA and Scala.
Hope you find it useful.

## Versions

| Version | Year | built with |
|---------|------|------------|
| 0.1.0  | 2017 | JDK 1.8, Scala 2.11, SBT 0.13.12, Akka 2.4.16 |
| 0.1.3  | 2021 | JDK 1.8, Scala 2.13.5, SBT 1.4.7, Akka 2.6.13 |

Feel free to upgrade and generate your own version.

## What is this project?

This project contains the core code generator and the common fields and message definitions which makes the session layer tick.

You should really have no need to checkout this project unless you want to change the code generator.   All documentation is at [sackfix.org](http://www.sackfix.org/).

## I want to build it anyway

Check it out and use sbt.   

You can get the fix xml specs from org.quickfixj, which is on 2.2.0 as I rework for Scala 2.13.
ie download it, unzip it, and you will find the xml files in:

org.quickfixj-2.2.0\etc

The application.conf contains the list of versions to generate, directories and so on.  The fields
are generated into this project - so if you make changes you may want to first edit application.conf
to change the output directory or package.

To update the other projects, you should install the newly built version and then update them.

sbt clean packageLocal


Best wishes,
Jonathan

<a href="http://www.sackfix.org/"><img src ="http://www.sackfix.org/assets/sackfix.png" /></a>
