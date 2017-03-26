.PHONY: all test build run
SHELL := /bin/bash

all: test build

test:
	echo "TODO test app"

build:
	cd override && ./override.sh
	mvn package

release:
	# Will deploy to https://oss.sonatype.org/content/groups/public/com/clever/client/
	echo "Read http://central.sonatype.org/pages/apache-maven.html"