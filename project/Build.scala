import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName			= "fiebre-naranja"
  val appVersion		= "1.0-SNAPSHOT"

 val appDependencies = Seq(
	// Add your project dependencies here,
	javaCore,
	javaJdbc,
	javaEbean
 )

 val main = PlayProject(appName, appVersion, mainLang = JAVA).settings(
   lessEntryPoints <<= baseDirectory(_ / "app" / "assets" / "stylesheets" ** "main.less")
 )

}
