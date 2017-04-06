.PHONY: all test build run
SHELL := /bin/bash

all: test build

test:
	echo "TODO test app"

build:
	rm -r target || true
	cd override && ./override.sh
	mvn package

release:
	mvn clean deploy
