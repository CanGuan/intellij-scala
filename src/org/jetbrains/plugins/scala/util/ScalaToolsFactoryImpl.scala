package org.jetbrains.plugins.scala.util

import com.intellij.lang.ParserDefinition
import com.intellij.psi.FileViewProvider
import org.jetbrains.plugins.scala.lang.psi.javaView.ScJavaFile
import org.jetbrains.plugins.scala.lang.parser.ScalaParserDefinition
import org.jetbrains.plugins.scala.lang.folding.ScalaFoldingBuilder
import org.jetbrains.plugins.scala.lang.surroundWith.descriptors.ScalaSurroundDescriptors
import org.jetbrains.plugins.scala.lang.surroundWith._
//import org.jetbrains.plugins.scala.structure.ScalaStructureViewBuilder
import org.jetbrains.plugins.scala.lang.completion.ScalaCompletionData
import com.intellij.codeInsight.completion._;
import com.intellij.ide.structureView.StructureViewBuilder
import com.intellij.psi.PsiFile

/**
 * Author: Ilya Sergey
 * Date: 09.10.2006
 * Time: 21:26:04
 */
class ScalaToolsFactoryImpl extends ScalaToolsFactory {

  def createScalaParserDefinition: ParserDefinition = new ScalaParserDefinition()

  def createScalaFoldingBuilder: ScalaFoldingBuilder = new ScalaFoldingBuilder()

  def createScalaCompletionData : CompletionData = new ScalaCompletionData()

  def createJavaView (viewProvider : FileViewProvider) = new ScJavaFile(viewProvider)

  def createSurroundDescriptors : SurroundDescriptors = new ScalaSurroundDescriptors()

//  def createStructureViewBuilder (psiFile : PsiFile) : StructureViewBuilder = new ScalaStructureViewBuilder(psiFile : PsiFile)
}
