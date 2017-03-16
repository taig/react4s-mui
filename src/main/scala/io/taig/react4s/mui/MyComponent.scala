package io.taig.react4s.mui

import com.github.ahnfelt.react4s._

import scala.scalajs.js

case class MyComponent() extends Component[NoEmit] {
    override def render(): ElementOrComponent = {
        val appBar = AppBar(
            Title( Text( "Title" ) ),
            J( "iconClassNameRight", "muidocs-icon-navigation-expand-more" )
        )

        val chip = Chip(
            OnTouchTap( e ⇒ println( "I clicked: " + e.target ) ),
            J( "labelStyle", js.Dictionary( "textTransform" → "uppercase" ) )
        )
        val button = RaisedButton(
            J( "label", "Hello World" ),
            J( "primary", true ),
            S.margin.px( 12 )
        )
        val input = TextField(
            J( "hintText", "Hint Text" ),
            S.color( "red" )
        )
        val avatar = Avatar(
            Size( 60 ),
            Text( "A" )
        )
        E.div( appBar, E.br(), chip, E.br(), button, E.br(), input, E.br(), avatar )
    }
}