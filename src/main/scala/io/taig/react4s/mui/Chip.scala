package io.taig.react4s.mui

import com.github.ahnfelt.react4s._
import io.taig.react4s.mui.facade.Mui

import scala.scalajs.js

object Chip {
    def apply(
        key:             Option[String]                             = None,
        ref:             Option[Any ⇒ Unit]                         = None,
        backgroundColor: js.UndefOr[String]                         = js.undefined,
        className:       js.UndefOr[String]                         = js.undefined,
        labelColor:      js.UndefOr[String]                         = js.undefined,
        labelStyle:      js.UndefOr[Css]                            = js.undefined,
        onRequestDelete: js.UndefOr[js.Function1[TouchEvent, Unit]] = js.undefined,
        onTouchTap:      js.UndefOr[js.Function1[TouchEvent, Unit]] = js.undefined,
        style:           js.UndefOr[Css]                            = js.undefined
    )( children: Tag* ): DynamicComponent = {
        val props = js.Dictionary(
            "backgroundColor" → backgroundColor,
            "className" → className,
            "labelColor" → labelColor,
            "labelStyle" → labelStyle,
            "onRequestDelete" → onRequestDelete,
            "onTouchTap" → onTouchTap,
            "style" → style
        )

        DynamicComponent( Mui.Chip, props, children, key, ref )
    }
}