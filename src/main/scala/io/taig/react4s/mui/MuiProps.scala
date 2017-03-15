package io.taig.react4s.mui

import com.github.ahnfelt.react4s.{ ElementOrComponent, J }
import com.github.ahnfelt.react4s

trait MuiProps {
    def BackgroundColor( value: String ) = J( "backgroundColor", value )

    def ClassName( values: String* ) = J( "className", values.mkString( " " ) )

    def Color( value: String ) = J( "color", value )

    def ErrorStyle( value: react4s.Style* ) = J( "errorStyle", value )

    def ErrorText( value: String ) = J( "errorText", value )

    def FloatingLabelText( value: String ) = J( "floatingLabelText", value )

    def Icon( value: ElementOrComponent ) = J( "icon", value )

    def HintText( value: String ) = J( "hintText", value )

    def Label( value: String ) = J( "label", value )

    def OnTouchTap( f: react4s.TouchEvent ⇒ Unit ) = J( "onTouchTap", f )

    def Size( value: Int ) = J( "size", value )

    def Src( value: String ) = J( "src", value )

    def Style( values: react4s.Style* ) = J( "style", values: _* )

    def Title( value: String ) = J( "title", value )
}