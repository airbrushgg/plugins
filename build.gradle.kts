plugins {
    kotlin("jvm") version "1.9.0"
}

group = "gg.airbrush"
version = "0.1.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io/")
}

dependencies {
    compileOnly("com.github.Minestom:Minestom:b58db7d5b0")
    implementation("cc.ekblad:4koma:1.2.0")
}

kotlin {
    jvmToolchain(17)
}