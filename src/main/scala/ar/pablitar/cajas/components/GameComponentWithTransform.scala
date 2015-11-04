package ar.pablitar.cajas.components

import java.awt.geom.AffineTransform
import javax.xml.crypto.dsig.Transform
import java.awt.Graphics2D
import ar.pablitar.vainilla.appearances.WorldSpaceAppearance
import com.uqbar.vainilla.GameScene
import com.uqbar.vainilla.GameComponent

class GameComponentWithTransform[T <: GameScene](var transform:AffineTransform = new AffineTransform()) extends GameComponent[T] {
}