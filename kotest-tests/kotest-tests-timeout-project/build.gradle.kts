plugins {
   id("kotlin-conventions")
}

kotlin {

   targets {
      jvm()
   }

   sourceSets {

      val jvmTest by getting {
         dependencies {
            implementation(project(Projects.Framework.engine))
            implementation(project(Projects.Assertions.Shared))
            implementation(project(Projects.JunitRunner))
            implementation(libs.kotlinx.coroutines.core)
         }
      }

      all {
         languageSettings.optIn("kotlin.time.ExperimentalTime")
         languageSettings.optIn("kotlin.experimental.ExperimentalTypeInference")
      }
   }
}
