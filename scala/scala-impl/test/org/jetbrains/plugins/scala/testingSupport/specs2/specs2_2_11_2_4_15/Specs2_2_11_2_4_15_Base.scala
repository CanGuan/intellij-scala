package org.jetbrains.plugins.scala.testingSupport.specs2.specs2_2_11_2_4_15

import org.jetbrains.plugins.scala.DependencyManager._
import org.jetbrains.plugins.scala.base.libraryLoaders.{IvyManagedLoader, LibraryLoader}
import org.jetbrains.plugins.scala.testingSupport.specs2.Specs2TestCase

/**
 * @author Roman.Shein
 * @since 11.01.2015.
 */
trait Specs2_2_11_2_4_15_Base extends Specs2TestCase {

  override protected def additionalLibraries: Seq[LibraryLoader] = IvyManagedLoader(
      "org.specs2" %% "specs2" % "2.4.15",
      "org.scalaz" %% "scalaz-core" % "7.1.0",
      "org.scalaz" %% "scalaz-concurrent" % "7.1.0",
      "org.scala-lang.modules" %% "scala-xml" % "1.0.6"
    ) :: Nil

}
