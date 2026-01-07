buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://dl.cloudsmith.io/public/indooratlas/mvn-public/maven/")
        }
        maven {
            url = uri("https://dl.cloudsmith.io/public/indooratlas/mvn-public-alpha/maven/")
        }
        maven {
            url = uri("https://dl.cloudsmith.io/public/indooratlas/mvn-public-beta/maven/")
        }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath ("com.google.ar:core:1.43.0")

    }
}


