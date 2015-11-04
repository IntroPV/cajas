package ar.pablitar.cajas

import com.uqbar.vainilla.GameComponent
import ar.pablitar.cajas.components.Cadena
import com.uqbar.vainilla.GameScene
import com.uqbar.vainilla.DeltaState
import ar.pablitar.vainilla.commons.math.Vector2D
import com.uqbar.vainilla.events.constants.Key

class Rotadores(c: Cadena) extends GameComponent[GameScene] {
  val rotadoresList = c.allNodes().map {new Rotador(_, Vector2D(50, 100))}
  val rotadoresIterator = 
    Iterator.continually(rotadoresList).flatten
  
    var rotador = rotadoresIterator.next()
  
  override def update(state:DeltaState) = {
    //Descomentar para rotar de a una a la vez
//    if(state.isKeyPressed(Key.TAB)) {
//    	rotador = rotadoresIterator.next()
//    }
    //rotador.update(state)
    rotadoresList.foreach {
      _.update(state)
    }
  }
}