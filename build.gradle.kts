/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */

buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.1.6.RELEASE")
    }
}

plugins {
    java
    id("org.springframework.boot") version ("2.1.6.RELEASE")
}

apply(plugin = "io.spring.dependency-management")


repositories {
    jcenter()
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter-quartz")
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.springframework.boot:spring-boot-starter-jdbc")
    compile("org.springframework.boot:spring-boot-starter-aop")
    compile("org.springframework.boot:spring-boot-starter-security")
    
    compile("mysql:mysql-connector-java")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}


