# Multi java version library

This module handles two different implementation
whether we run the app with Java 8 or Java 11 (or above).

This module is the maven implementation of the
code provided by Treesha Gee (code available
over [GitHub](https://github.com/trishagee/multi-version-jar)).

## base-module
Module that contains code to be run with default Java version.
We don't want artefacts for this module to be installed nor deployed, 
so both steps are skipped in maven lifecycle.

## java-11-module
Module that contains code to be run when Java 11 (or above) is detected.
We don't want artefacts for this module to be installed nor deployed,
so both steps are skipped in maven lifecycle.

## final-module
Module that extracts code from base-module and java-11-module to build an
archive compatible with JEP-238.

Default code is at the root of the jar file. Dedicated Java 11 code is placed
under META-INF/versions/11/