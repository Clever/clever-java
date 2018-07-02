.PHONY: all test build run
SHELL := /bin/bash

all: test build

test:
	echo "TODO test app"

generate:
	rm -rf docs/
	rm -rf src/
	rm -rf pom.xml build.gradle build.sbt settings.gradle gradle.properties src/main/AndroidManifest.xml
	swagger-codegen generate -i ../swagger-api/v2.0-client.yml -l java -o . -c clever-java.properties

build:
	rm -r target || true
	./override/override.sh
	mvn package

release:
	mvn clean deploy
