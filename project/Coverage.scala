import scoverage.ScoverageKeys.{coverageEnabled, coverageExcludedPackages, coverageFailOnMinimum, coverageMinimum}

/**
 *
 */
object Coverage {
  val scoverage = Seq(
    coverageExcludedPackages := Seq().mkString(";"),
    coverageFailOnMinimum := true,
    coverageMinimum := 50,  // TODO fix later
    coverageEnabled := true
  )
}