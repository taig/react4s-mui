package io.taig.react4s

import com.github.ahnfelt.react4s.JsComponent
import io.taig.react4s.mui.facade.{ Mui, MuiThemeProvider }

package object mui {
    object Avatar extends JsComponent( Mui.Avatar )
    object Chip extends JsComponent( Mui.Chip )
    object RaisedButton extends JsComponent( Mui.RaisedButton )
    object TextField extends JsComponent( Mui.TextField )
    object ThemeProvider extends JsComponent( MuiThemeProvider )
}