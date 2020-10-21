import sbt.Keys._
import sbt._
import wartremover.WartRemover.autoImport._

/**
 *
 */
object StaticAnalysis {
  val wartremover = Seq(
    wartremoverErrors in(Compile, compile) ++= Warts.allBut(Wart.Overloading),
    wartremoverErrors in(Test, test) ++= Warts.allBut(Wart.Overloading, Wart.NonUnitStatements)
  )
}
