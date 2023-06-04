<a href="https://pendared.github.io/sackfix/"><img src ="https://pendared.github.io/sackfix/assets/sf_logo.png" /></a>

# SackFix

A Scala Fix Engine implementation.  It is a full implementation of the session level protocol, tested using the sackfix tester project, supporting acceptor and initiators using AKKA and Scala.

To get started simply download the [examples project](https://github.com/PendaRed/sackfixexamples) and start the acceptor and then the initiator.   The SackFix suite consists of

* [Examples](https://github.com/PendaRed/sackfixexamples): This is all you need!
* [Tester](https://github.com/PendaRed/sackfixtests): A very simple test suite to stress out any Session level implementation.
* [Session](https://github.com/PendaRed/sackfixsessions): All of the statemachines and message handling for the Fix Session.  ie the business logic lives here.
* [Messages](https://github.com/PendaRed/sackfixmessages): Code generated Fix Messages for all versions of fix.
* [Common](https://github.com/PendaRed/sackfix): The code generator and common classes - including all the code generated Fields.

Full documentation is at [SackFix.org](http://www.sackfix.org/).

## Versions

Upgraded in 2021 to akka typed and scala 2.13.

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

<a href="https://pendared.github.io/sackfix/"><img src ="https://pendared.github.io/sackfix/assets/sackfix.png" /></a>
