import org.scalastyle.sbt.ScalastylePlugin.autoImport._
import sbt.Keys._
import sbt._

/**
 *
 */
object Style {
  val scalastyle = Seq(
    scalastyleFailOnError := true,
    scalastyleSources in Compile += baseDirectory.value / "src" / "test"
  )
}
