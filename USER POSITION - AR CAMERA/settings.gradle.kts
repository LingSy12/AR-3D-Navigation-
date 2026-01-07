// Activate feature preview for type-safe project accessors
enableFeaturePreview("VERSION_CATALOGS")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
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
        maven { url = uri("https://jitpack.io") }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
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
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "AppAppfcshd"
include(":app")
