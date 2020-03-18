object BuildConfig {
  private const val versionMajor = 1
  private const val versionMinor = 1
  private const val versionPatch = 1
  private const val versionBuild = 0

  const val group = "com.aungkyawpaing.burtha"

  const val artifactName = "burtha"

  const val description = "Burmese NRC tools written for Kotlin"

  const val license = "Apache-2.0"
  const val license_url = "http://www.apache.org/licenses/LICENSE-2.0.txt"

  const val versionName =
    "$versionMajor.$versionMinor.$versionPatch"
  const val versionCode =
    versionMajor * 1000000 + versionMinor * 10000 + versionPatch * 100 + versionBuild

}

object CommonLibs {
  const val bintray_plugin = "com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4"

  const val junit = "junit:junit:4.12"
}

object Kotlin {
  private const val version = "1.3.70"

  const val stdblib_jdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
  const val gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
}
