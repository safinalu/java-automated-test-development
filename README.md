Java Automated Test Development
==========

_3. Java Application as a Subject Under Test: autotests designing, coding, running and reporting._ 21hrs.

# Attendee prerequisites
- [ ] Training «2. Java Application Development» completion

# Training Objectives
- [ ] Understanding autotests value and ability to comminicate it to management
- [ ] Hands-on skill of developing autotests as «Specifications by Example» for system documenting
- [ ] Understanding autotests maintainability value
- [ ] Hands-on skill of developing maintainable test suites
- [ ] Hands-on skill of substituting complex systems components for testing
- [ ] Understanding autotests reports for decision making
- [ ] Hands-on skill of covering web UI

# Prerequisites
### Hardware
- [ ] RAM ≥ 8Гб
- [ ] Wi-Fi with Internet access
## Software
- [ ] [git](https://git-scm.com/downloads)
- [ ] [JDK8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [ ] [IDEA (trial Ultimate)](https://www.jetbrains.com/idea/download/)
- [ ] [Maven](https://maven.apache.org/download.cgi)
- [ ] [Chrome standalone offline installer](https://cloud.google.com/chrome-enterprise/browser/download/)
## Network Access
- [ ] github.org :443 :80
- [ ] repo1.maven.org :443 :80
- [ ] jcenter.bintray.com :443 :80

# Agenda
## Training introducing and focusing (1 hrs)
- [ ] Schedule
- [ ] Trainer
- [ ] Training overview
- [ ] Rules
### Hands-on: teams and their demand
- [ ] Pairs forming and introduction
- [ ] Topics focus demand from attendees
- [ ] Additional topics demand form attendees

## Sound-check (0.5)
### Hands-on
- [ ] Fork training repo and clone this fork
```bash
git clone --branch master --depth 1 https://github.com/ACCOUNT/java-automated-test-development
```
- [ ] Open project with IDEA
- [ ] Project JDK set
- [ ] Sourcepath and classpathes
- [ ] Maven full build
### Demo
- [ ] Application requirements overview
- [ ] Application architecture overview
- [ ] DevOps pipeline overview

## What is autotest and why? (2.5)
### Autotest value
- [ ] Autotests values?
- [ ] What difference with debugging?
- [ ] What scopes do we cover with autotests?
### Demo
- [ ] Mapping test scopes to typical architecture
- [ ] Testing pyramid with testability base
### Demo covering "well-known" class
- [ ] Add unit testing framework dependency
- [ ] B. Meyer's Contract definition
- [ ] Naming for test and test case
- [ ] Execution flows and corner cases
- [ ] Naming steps: AAA and GWT ways
- [ ] Fixture value
- [ ] Forgotten 1.5 step
- [ ] Test = fixed flow
- [ ] Test case = component specification
### Hands-on
- [ ] Given legacy codebase with Client and SavingAccount com.acme.banking.dbo.domain types
- [ ] When developers add guard clauses for creating Client and SavingAccount
- [ ] And cover these components with maintainable autotests
- [ ] Then public code review should state its maintainability

## How to measure test coverage? (2.5)
### Test reports
- [ ] Build tool test phases
- [ ] Separate reports
- [ ] Test error types: failure, error, ignored
### Test coverage
- [ ] Coverage definition
- [ ] Coverage metrics
- [ ] Coverage tooling
### Demo
- [ ] Add coverage tool dependency
- [ ] Project test coverage reports
### Hands-on
- [ ] Given legacy codebase with Client and SavingAccount com.acme.banking.dbo.domain types
- [ ] And added covering test suite
- [ ] When developers analyse coverage reprts
- [ ] And develop new tests
- [ ] Then coverage have to be ≥ 80%

## How to make test development faster? (2.5)
### Demo for Common features
- [ ] [Simple assertions](https://junit.org/junit4/javadoc/4.8/org/junit/Assert.html)
- [ ] [Composable assertions](https://github.com/junit-team/junit4/wiki/Matchers-and-assertthat)
- [ ] [Fluent assertions](https://joel-costigliola.github.io/assertj/assertj-core-quick-start.html)
- [ ] [Test timeouts](https://github.com/junit-team/junit4/wiki/Timeout-for-tests)
- [ ] [Testing exception flow](https://github.com/junit-team/junit4/wiki/Exception-testing)
- [ ] [Parameterized tests](https://github.com/junit-team/junit4/wiki/Parameterized-tests)
### Demo for Extending
- [ ] [Runners](https://github.com/junit-team/junit4/wiki/Test-runners)
- [ ] [Rules](https://github.com/junit-team/junit4/wiki/Rules)
### Demo for test suites
- [ ] Why test suites?
- [ ] Value for feedback process metrics
- [ ] Smoke suite
- [ ] [Groups](https://github.com/junit-team/junit4/wiki/aggregating-tests-in-suites)
- [ ] [Categories](https://github.com/junit-team/junit4/wiki/Categories)
- [ ] Build tool support for scoped tests run
### Hands-on
- [ ] Given legacy codebase with Client and SavingAccount com.acme.banking.dbo.domain types
- [ ] When developers add consistency rules for linking Client and SavingAccount
- [ ] And cover these components with maintainable autotests
- [ ] Then coverage for theses components should be 100%
- [ ] And public code review should state for maintainability

## How to implement integration tests? (2.5)
### Integration and Unit vs System tests
- [ ] What's the difference?
- [ ] How to simplify and isolate tests?
- [ ] How can we determine scope just looking code?
- [ ] How build tool differs unit vs integration and system tests?
### Test doublers
- [ ] Test doubler types
- [ ] State-based vs Interaction-based testing
- [ ] [Object-scoped framework](https://site.mockito.org)
- [ ] [REST- and WS-scoped framework](http://wiremock.org/docs/getting-started)
### Demo
- [ ] Developing isolated state-based test
- [ ] Developing isolated interaction-based test
### Hands-on
- [ ] Given legacy codebase with Processing component
- [ ] When developers analyse and refactor production codebase for testability
- [ ] And cover this component with maintainable _unit_ isolated autotests
- [ ] Then coverage for theses component should be 100%
- [ ] And public code review should state for maintainability

## How to achieve tests maintainablity with reusable fixture? (2.5)
### Fixture
- [ ] Fixture value for maintainablity and readability
### Implementing reusable fixture
- [ ] Test cases inheritance
- [ ] [Framework tooling](https://github.com/junit-team/junit4/wiki/Test-fixtures)
- [ ] Fixture Builders
- [ ] Runners
- [ ] Rules
### Demo
- [ ] Fixture builder implementation
### Hands-on
- [ ] Given current test codebase
- [ ] When developers analyse and refactor test codebase for maintainability
- [ ] Then fixture builders introduced
- [ ] And public code review should state for tests maintainability

## How to achieve tests maintainablity with development process? (2.5)
### Tests code quality achievement
- [ ] Broke test first
- [ ] Coverage analysis
- [ ] Tests code review
- [ ] Mutation coverage tools
### Demo
- [ ] Broke test first
- [ ] Mutation coverage report
### Tests code quality anti-patterns
- [ ] "Tests aren't code"
- [ ] Large low-cohesive tests
- [ ] Non-communicative names
- [ ] Fixture doubling
- [ ] 100% coverage
### Hands-on
- [ ] Given test codebase
- [ ] When developers analyse and refactor test codebase for maintainability
- [ ] Then cross-team code review should state for tests maintainability

## TDD intro (2)

## How cover web UI? (2.5)
### HTML overview
- [ ] HTML structure
- [ ] CSS
- [ ] JS
### Demo
- [ ] HTML page structure with browser tooling
- [ ] XPath locating
### WebDriver API
- [ ] Driver concept
- [ ] Selenium API
- [ ] Selenide library API
- [ ] Driver manager library API
### Demo
- [ ] [Test recording tool](https://www.seleniumhq.org/selenium-ide/)
- [ ] Simple test with Selenide
- [ ] Browser headless mode
### UI tests maintainability
- [ ] Whats the problem with Selenium/Selenide tests?
- [ ] Page Object pattern
- [ ] Step Object pattern
### Hands-on
- [ ] Given web UI
- [ ] When developers cover main flow with UI test
- [ ] Then cross-team code review should state for tests maintainability

## Cucumber intro (1.5)
## Allure intro (1)

## Buffer (2)
- [ ] Daily retrospectives

## Webinar recordings
- [12.05](https://us02web.zoom.us/rec/share/58pZI5PB_FpOa53Pt0P5AukKLLy5aaa8hCcbqfcNyHifs4MnaVroY9fhhCgIeLw)
