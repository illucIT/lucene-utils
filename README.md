# lucene-utils

This package contains a wrapper for the function `org.apache.lucene.analysis.miscellaneous.ASCIIFoldingFilter#foldToASCII`
from the Apache Lucene project.

The file was taken from the class "org.apache.lucene.analysis.ASCIIFoldingFilter"
from the Apache Lucene project (package lucene-analyzers-common, version 4.7.0).
This file was modified only by removing non-static functions which had dependencies
to further Lucene classes. The static function "foldToASCII" itself is unmodified.

## Setup Maven

To include this artifact as dependency of your Maven project, you also need to add the public illucIT Maven Repository in your `pom.xml`:

    <dependency>
        <groupId>com.illucit</groupId>
        <artifactId>lucene-utils</artifactId>
        <version>1.0</version>
    </dependency>
    
    <repositories>
        <!-- illucIT Company Repository -->
        <repository>
            <id>illucit</id>
            <name>illucIT Public Maven Repository</name>
            <url>http://repository.illucit.com</url>
        </repository>
    </repositories>

## Usage

The package provides a Utility function `com.illucit.util.ASCIIUtils#foldToASCII(String)` which will replace all
diacritical characters with the ASCII base variant, e.g. "ä" -> "a", "É" -> "E" and "ß" -> "ss".
The mapping for the replacement is taken from a class in Apache Lucene.