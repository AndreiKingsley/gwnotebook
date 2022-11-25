/*
* Copyright 2020-2022 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
*/


buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    kotlin("jvm") version "1.7.10"
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

group = "org.jetbrains.kotlinx"
version = "0.0.1"
