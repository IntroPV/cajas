package ar.pablitar.cajas.components

import com.uqbar.vainilla.GameComponent
import ar.pablitar.vainilla.commons.components.GameComponentWithTransform
import ar.pablitar.cajas.CajasGameScene
import java.awt.Color
import java.awt.Graphics2D
import java.awt.geom.AffineTransform
import com.uqbar.vainilla.appearances.Rectangle

class Cadena(aTransform: AffineTransform, next: Option[Cadena] = None) extends GameComponentWithTransform[CajasGameScene](aTransform) {
  //Dado que este objeto usa su transform para la translación,
  //el getX y el getY quedan deprecados (devuelven siempre 0)
  val rectAppearance = new Rectangle(Color.RED, 100, 100)
  override def render(g: Graphics2D) = {
    val beforeTransform = g.getTransform()
    g.transform(this.transform)
    rectAppearance.render(this, g)
    next.foreach { _.render(g) }
    g.setTransform(beforeTransform)
  }

  def allNodes(): List[Cadena] = {
    this :: (next.map { _.allNodes() }.getOrElse(Nil))
  }
}