package ar.pablitar.cajas.components

import com.uqbar.vainilla.GameComponent
import com.uqbar.vainilla.GameScene
import com.uqbar.vainilla.DeltaState
import com.uqbar.vainilla.events.constants.Key

class Rotador(c: GameComponentWithTransform[_], pivotX: Double, pivotY:Double) extends GameComponent[GameScene] {
  val speed = Math.PI
  override def update(state: DeltaState) = {
    if (state.isKeyBeingHold(Key.Q)) {
      c.transform.rotate(-state.getDelta * speed, pivotX, pivotY)
    }
    if (state.isKeyBeingHold(Key.E)) {
      c.transform.rotate(state.getDelta * speed, pivotX, pivotY)
    }
  }
}