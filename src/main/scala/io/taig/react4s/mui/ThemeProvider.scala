package io.taig.react4s.mui

import com.github.ahnfelt.react4s._
import io.taig.react4s.mui.facade.MuiThemeProvider

import scala.scalajs.js

object ThemeProvider {
    def apply( child: ElementOrComponent ): DynamicComponent = {
        val react = ReactBridge.elementOrComponentToReact( child )

        DynamicComponent(
            MuiThemeProvider,
            js.Dictionary( "children" → react )
        )
    }
}