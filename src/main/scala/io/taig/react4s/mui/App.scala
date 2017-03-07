package io.taig.react4s.mui

import com.github.ahnfelt.react4s._
import io.taig.react4s.mui.facade._

import scala.scalajs.js
import scala.scalajs.js.JSApp

object App extends JSApp {
    def main(): Unit = {
        injectTapEventPlugin()

        val theme = ThemeProvider( Component( MyComponent ) )

        NpmReactBridge.renderToDomById( theme, "main" )
    }
}
