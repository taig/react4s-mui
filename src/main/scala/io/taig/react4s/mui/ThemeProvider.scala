package io.taig.react4s.mui

import com.github.ahnfelt.react4s._
import io.taig.react4s.mui.facade._

import scala.scalajs.js

object ThemeProvider {
    def apply( child: ElementOrComponent ): DynamicComponent = {
        val react = NpmReactBridge.elementOrComponentToReact( child )

        DynamicComponent(
            MuiThemeProvider,
            js.Dictionary( "children" → react )
        )
    }
}