VERSION := 0.0.0-SNAPSHOT
APP_NAME = template-maven-single

all: cleanup build test deploy log-results

.PHONY: check-style
check-style:
	./mvnw spotless:check

.PHONY: build
build: check-style
	@echo "build"

.PHONY: test
test:
	./mvnw verify

.PHONY: deploy
deploy:
	@echo "deploy"

.PHONY: log-results
log-results:
	@echo "log-results"
