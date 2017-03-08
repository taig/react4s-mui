package io.taig.react4s.mui

import com.github.ahnfelt.react4s._
import io.taig.react4s.mui.facade.Mui

import scala.scalajs.js

object RaisedButton {
    def apply(
        key:             Option[String]      = None,
        ref:             Option[Any ⇒ Unit]  = None,
        backgroundColor: js.UndefOr[String]  = js.undefined,
        buttonStyle:     js.UndefOr[Css]     = js.undefined,
        className:       js.UndefOr[String]  = js.undefined,
        disabled:        js.UndefOr[Boolean] = js.undefined,
        label:           js.UndefOr[String]  = js.undefined,
        primary:         js.UndefOr[Boolean] = js.undefined,
        style:           js.UndefOr[Css]     = js.undefined
    )( children: Tag* ): DynamicComponent = {
        val props = js.Dictionary(
            "backgroundColor" → backgroundColor,
            "buttonStyle" → buttonStyle,
            "className" → className,
            "disabled" → disabled,
            "label" → label,
            "primary" → primary,
            "style" → style
        )

        DynamicComponent( Mui.RaisedButton, props, children, key, ref )
    }
}