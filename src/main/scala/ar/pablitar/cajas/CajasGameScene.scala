package ar.pablitar.cajas

import com.uqbar.vainilla.GameScene
import ar.pablitar.cajas.components.Cadena
import java.awt.geom.AffineTransform
import ar.pablitar.vainilla.commons.math.Vector2D
import ar.pablitar.cajas.components.Rotadores

class CajasGameScene extends GameScene {
  val root = new Cadena(
    AffineTransform.getTranslateInstance(300, 300),
    Some(
      new Cadena(
        AffineTransform.getTranslateInstance(0, -110),
        Some(new Cadena(AffineTransform.getTranslateInstance(0, -110))))))
  this.addComponent(root)

  this.addComponent(new Rotadores(root))

}