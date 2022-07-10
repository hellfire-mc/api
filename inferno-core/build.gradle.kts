plugins {
    id("io.freefair.lombok") version "6.5.0.2"
    `java-library`
}

// disable build task
tasks.build {
    enabled = false
}
