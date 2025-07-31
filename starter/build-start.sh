#! /bin/sh

clear

mvn clean package -Dskip.tests

java -jar .\target\starter-0.0.1-SNAPSHOT.jar

echo DONE
