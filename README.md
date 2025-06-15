# lucene-utils

[![Maven Central](https://img.shields.io/maven-central/v/com.illucit/lucene-utils.svg?label=Maven%20Central)](https://central.sonatype.com/artifact/com.illucit/instatrie)

This package contains a wrapper for the function `org.apache.lucene.analysis.miscellaneous.ASCIIFoldingFilter#foldToASCII`
from the Apache Lucene project.

The file was taken from the class `org.apache.lucene.analysis.ASCIIFoldingFilter`
from the Apache Lucene project (package `lucene-analyzers-common`, version 4.7.0).
This file was modified only by removing non-static functions which had dependencies
to further Lucene classes. The static function `foldToASCII` itself is unmodified.

## Requirements

`lucene-utils` is compiled with the Java21 compilation target, and has support for Jigsaw (Java9+ module system).

In order to use it in a modular project, add the module `com.illucit.lucene.utils` to your project.

An example can be seen in the `module-info.java` of `example-projects/java21`.

    module lucene.utils.java21example {
        [...]
        requires com.illucit.lucene.utils;
    }


## Setup Maven

To include this artifact as dependency of your Maven project in your `pom.xml`:

    <dependency>
        <groupId>com.illucit</groupId>
        <artifactId>lucene-utils</artifactId>
        <version>1.2.0</version>
    </dependency>
    

## Usage

The package provides a Utility function `com.illucit.util.ASCIIUtils#foldToASCII(String)` which will replace all
diacritical characters with the ASCII base variant, e.g. "ä" -> "a", "É" -> "E" and "ß" -> "ss".
The mapping for the replacement is taken from a class in Apache Lucene.