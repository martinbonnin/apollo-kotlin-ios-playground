plugins {
  id("org.jetbrains.kotlin.multiplatform").version("2.1.0")
  id("com.apollographql.apollo").version("4.1.0")
}


kotlin {
  iosSimulatorArm64 {
    binaries {
      framework {
        
      }
    }
  }

  applyDefaultHierarchyTemplate()

  sourceSets {
    getByName("appleMain").dependencies {
      implementation("com.apollographql.apollo:apollo-runtime")
    }
  }
}

apollo {
  service("service") {
    packageName.set("com.example")
    introspection {
      this.schemaFile.set(file("src/commonMain/graphql/schema.graphqls"))
      this.endpointUrl.set("https://confetti-app.dev/graphql")
    }
  }
}

