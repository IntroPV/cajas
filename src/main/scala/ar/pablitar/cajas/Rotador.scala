package ar.pablitar.cajas

import ar.pablitar.vainilla.commons.components.GameComponentWithTransform
import com.uqbar.vainilla.GameComponent
import com.uqbar.vainilla.GameScene
import com.uqbar.vainilla.DeltaState
import com.uqbar.vainilla.events.constants.Key
import ar.pablitar.vainilla.commons.math.Vector2D

class Rotador(c: GameComponentWithTransform[_], pivot: Vector2D) extends GameComponent[GameScene] {
  val speed = Math.PI
  override def update(state: DeltaState) = {
    if (state.isKeyBeingHold(Key.Q)) {
      c.transform.rotate(-state.getDelta * speed, pivot.x1, pivot.x2)
    }
    if (state.isKeyBeingHold(Key.E)) {
      c.transform.rotate(state.getDelta * speed, pivot.x1, pivot.x2)
    }
  }
}