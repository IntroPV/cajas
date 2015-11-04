package ar.pablitar.cajas

import com.uqbar.vainilla.Game
import java.awt.Dimension

class CajasGame extends Game {
  
  def getDisplaySize(): Dimension = {
    new Dimension(800, 600)
  }

  def getTitle(): String = {
    "Asteroids"
  }

  def initializeResources(): Unit = {
  }

  def setUpScenes(): Unit = {
    this.setCurrentScene(new CajasGameScene())
  }
}