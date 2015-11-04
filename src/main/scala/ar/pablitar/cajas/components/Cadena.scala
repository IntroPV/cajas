package ar.pablitar.cajas.components

import com.uqbar.vainilla.GameComponent
import ar.pablitar.vainilla.appearances.worldspace.Rectangle
import ar.pablitar.vainilla.commons.components.GameComponentWithTransform
import ar.pablitar.cajas.CajasGameScene
import java.awt.Color
import java.awt.Graphics2D
import java.awt.geom.AffineTransform

class Cadena(aTransform: AffineTransform, next: Option[Cadena] = None) extends GameComponentWithTransform[CajasGameScene](aTransform) {
  val rectAppearance = Rectangle(100, 100, Color.RED)
  override def render(g: Graphics2D) = {
    val beforeTransform = g.getTransform()
    g.transform(this.transform)
    rectAppearance.doRenderAt(0, 0, g)
    next.foreach { _.render(g) }
    g.setTransform(beforeTransform)
  }
  
  def allNodes():List[Cadena] = {
    this::(next.map { _.allNodes() }.getOrElse(Nil))
  }
}