package io.taig.react4s.mui

import com.github.ahnfelt.react4s._

import scala.scalajs.js

case class MyComponent() extends Component[NoEmit] {
    override def render(): ElementOrComponent = {
        val chip = Chip(
            P( "onTouchTap", { e ⇒ println( "yolo click: " + e.target ) }: js.Function1[TouchEvent, Unit] ),
            P( "labelStyle", js.Dictionary( "textTransform" → "uppercase" ) )
        )
        val button = RaisedButton(
            P( "label", "Yolo" ),
            P( "primary", true ),
            S.margin.px( 12 )
        )
        val input = TextField(
            P( "hintText", "Hint Text" ),
            S.color( "red" )
        )
        E.div( chip, button, input )
    }
}