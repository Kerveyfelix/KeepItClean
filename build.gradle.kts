// Top-level build file where you can add configuration options common to all sub-projects/modules.

/**
 * The buildScript block is where you configure the repositories and
 * dependencies for Gradle itself— meaning, you should not include dependencies
 * for your modules here. For example, this block includes the Android plugin for
 * Gradle as a dependency because it provides the additional instructions Gradle
 * needs to build Android app modules.
 */

buildscript {

    /**
     * The repositories block configures the repositories Gradle uses to
     * search or download the dependencies. Gradle pre-configures support for remote
     * repositories such as JCenter, Maven Central, and Ivy. You can also use local
     * repositories or define your own remote repositories. The code below defines
     * JCenter as the repository Gradle should use to look for its dependencies.
     *
     * New projects created using Android Studio 3.0 and higher also include
     * Google's Maven repository.
     */

    repositories {
        google()
        jcenter()

        //Just an instance to show how maven is implemented in kt DSLs
//    mavenCentral()
//    maven(url = "https://jitpack.io/")
    }


    /**
     * The dependencies block configures the dependencies Gradle needs to use
     * to build your project. The following line adds Android plugin for Gradle
     * version x.y.z as a classpath dependency.
     */

    dependencies {

        classpath(BuildPlugins.androidGradlePlugin)
        classpath(BuildPlugins.androidKotlinPlugin)
        classpath(BuildPlugins.crashlyticsGradle)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files

    }
}


/**
 * The allprojects block is where you configure the repositories and
 * dependencies used by all modules in your project, such as third-party plugins
 * or libraries. However, you should configure module-specific dependencies in
 * each module-level build.gradle file. For new projects, Android Studio
 * includes JCenter and Google's Maven repository by default, but it does not
 * configure any dependencies (unless you select a template that requires some).
 */

allprojects {
    repositories {
        google()
        jcenter()

    }
}

tasks.register("clean").configure {
    delete(rootProject.buildDir)
}