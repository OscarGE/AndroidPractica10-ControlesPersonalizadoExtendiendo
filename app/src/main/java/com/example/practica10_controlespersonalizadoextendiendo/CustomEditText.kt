package com.example.practica10_controlespersonalizadoextendiendo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.EditText

class CustomEditText: androidx.appcompat.widget.AppCompatEditText {
    constructor(ctx: Context): super(ctx)
    constructor(ctx: Context, attrs: AttributeSet): super(ctx, attrs)
    constructor(ctx: Context, attrs: AttributeSet, defStyleAttr: Int): super(ctx, attrs, defStyleAttr)

    val escala: Float= resources.displayMetrics.density

    val p1: Paint=Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color= Color.BLACK
        style= Paint.Style.FILL
    }
    val p2: Paint=Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color= Color.WHITE
        textSize=30f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawRect(width - 30*escala,
            5 * escala,
            width - 5*escala,
            25*escala, p1)
        canvas.drawText("" + text.toString().length,
        width - 28*escala,
        17*escala, p2)
    }

}