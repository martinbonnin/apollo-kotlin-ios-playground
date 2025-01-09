rootProject.name = "apollo-kotlin-ios-playground"
pluginManagement {
  listOf(repositories, dependencyResolutionManagement.repositories).forEach {
    it.mavenCentral()
  }
}
