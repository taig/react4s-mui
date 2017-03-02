package io.taig.react4s.mui

import com.github.ahnfelt.react4s._

import scala.scalajs.js

case class MyComponent() extends Component[NoEmit] {
    override def render(): ElementOrComponent = {
        val chip = Chip(
            onTouchTap = js.defined( ( e: TouchEvent ) ⇒ println ( "yolo click: " + e.target ) ),
            labelStyle = js.Dictionary( "textTransform" → "uppercase" ).asInstanceOf[js.Object]
        )( Text( "Yolo" ) )
        val button = RaisedButton(
            label   = "Yolo",
            primary = true,
            style   = js.Dictionary( "margin" → "12px" )
        )()
        val input = TextField(
            hintText = "Hint Text"
        )()
        E.div( chip, button, input )
    }
}