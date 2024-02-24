plugins {
    kotlin("jvm") version "1.9.0"
    `maven-publish`
}

val versionNumber = "0.1.1"
group = "gg.airbrush"
version = versionNumber

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

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "gg.airbrush"
            artifactId = "plugins"
            version = versionNumber

            from(components["java"])
        }
    }
}