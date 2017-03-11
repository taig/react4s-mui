package io.taig.react4s.mui

import com.github.ahnfelt.react4s.{ J, TouchEvent }

trait MuiProps {
    def BackgroundColor( value: String ) = J( "backgroundColor", value )

    def Label( value: String ) = J( "label", value )

    def OnTouchTap( f: TouchEvent ⇒ Unit ) = J( "onTouchTap", f )

    def Size( value: Int ) = J( "size", value )
}