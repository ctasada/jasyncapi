[![AsyncAPI Logo](./assets/logo.png)](https://www.asyncapi.com)

<h4 align="left">Building the future of event-driven architectures</h4>
<h6 align="left">We're on a mission to standardize message-based communication and increase interoperability of the different systems out there.</h6>

---
> ⚠️ This project doesn't support AsyncAPI 1.x
---

[![Version](https://img.shields.io/maven-central/v/com.asyncapi/asyncapi-core?logo=apache-maven)](https://search.maven.org/artifact/io.quarkiverse.asyncapi/quarkus-asyncapi)

## Overview
JVM-friendly bindings for AsyncAPI. It allows you to read or write specifications for your asynchronous API  through code

Hints:
- If you are working with AsyncAPI specification in JetBrains IDE, check out our [AsyncAPI - IDEA plugin](https://github.com/asyncapi/jasyncapi-idea-plugin)
- If you are working with AsyncAPI specification in VSCode, check out our [AsyncAPI - VSCode plugin](https://github.com/asyncapi/vs-asyncapi-preview)

## Known consumers:
- [Springwolf Core](https://github.com/springwolf/springwolf-core) - Automated documentation for async APIs built with Spring Boot
- [AsyncAPI Quarkus](https://github.com/quarkiverse/quarkus-asyncapi) - Generates AsyncAPIRegistry and configuration classes for Quarkus

## Contributors section

### Build

#### Prerequisites
1. JDK 1.8
2. Maven 3+

If you are using SDKMAN! use [env](https://sdkman.io/usage#env) to prepare environment
```shell
sdk env
```

### Publish new release

#### Prerequisites
1. Request credentials for one of AsyncAPI's account on [Sonatype Jira](https://issues.sonatype.org), which is synced
  with [Sonatype nexus](https://oss.sonatype.org)
2. Generate pgp key if it was not generated yet
3. Create `/Users/{userName}/.m2/settings.xml`

```xml
<settings>
  <profiles>
    <profile>
      <id>ossrh</id>
      <activation>
        <activeByDefault>true</activeByDefault>
      </activation>
      <properties>
        <gpg.keyname>GPG key name</gpg.keyname>
        <gpg.executable>gpg</gpg.executable>
        <gpg.passphrase>GPG passphrase for selected key</gpg.passphrase>
        <gpg.homedir>/Users/{userName}/.gnupg</gpg.homedir>
      </properties>
    </profile>
  </profiles>
  <servers>
    <server>
      <id>ossrh</id>
      <username>Jira username</username>
      <password>Jira password</password>
    </server>
  </servers>
</settings>
```

Release
```shell
mvn clean deploy -P release 
```

references:
- [Sonatype Instruction with references and clarifications](https://central.sonatype.org/pages/apache-maven.html)
- [Sonatype Instruction for deployment releasing](https://central.sonatype.org/pages/releasing-the-deployment.html)