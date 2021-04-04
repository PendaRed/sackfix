April 9th 2017
==============

Install Gnu GP and generated the PGP key using Kleopatra

To make my gpg pass phrase available, BUT not checked in, do this
Edit C:\Users\Jonathan\.sbt\1.0\plugins\pgp.sbt
addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")

Edit C:\Users\Jonathan\.sbt\1.0\pgp.sbt

and add

pgpSecretRing := file("/Users/Jonathan/AppData/Roaming/gnupg/secring.gpg")

pgpPublicRing := file("/Users/Jonathan/AppData/Roaming/gnupg/pubring.gpg")

pgpPassphrase := Some(Array('p','a','s','s','w','o','r','d','1'))

==========================
Configure Sonartype
Edit C:\Users\Jonathan\.sbt\0.13\sonartype.sbt

credentials += Credentials("Sonatype Nexus Repository Manager",
                           "oss.sonatype.org",
                           "yourloginname",
                           "password")

==========================

cd sackfix

sbt
>project sackfixcommon
>publishSigned
>sonatypeRelease

cd ../sackfixmessages

# Below two are SLOW, and 90 mins together
publishAllToNexus.bat
releaseAllToNexus.bat

cd ../sackfixsessions
sbt
>project sackfixsessions
>publishSigned

# Refused to work >sonatypeRelease
# So logged in to nexus, closed the staging repo (search for quickfix in staging), hit refresh, then hit release.
 
==========================
Finally log in to nexus, take a look at the staging repos, and close them and then drop them.

https://oss.sonatype.org/#stagingRepositories
Search in search box for org.sackfix
