package dev.pegasus.customviews.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Rect
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.util.Log
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View

const val TAG = "MyTag"

class DummyView : View {

    /* ---------------------------------------------- Creation ---------------------------------------------- */

    constructor(context: Context) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)

    init {
        Log.d(TAG, "Handler: initiated")
        Handler(Looper.getMainLooper()).postDelayed({
            Log.d(TAG, "Handler: invoked")
            setBackgroundColor(Color.BLUE)
        }, 5000)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        Log.d(TAG, "onFinishInflate: called")
    }

    /* ---------------------------------------------- Layout ---------------------------------------------- */

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.d(TAG, "onMeasure: called")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.d(TAG, "onLayout: called")
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        Log.d(TAG, "onSizeChanged: called")
    }

    /* ---------------------------------------------- Drawing ---------------------------------------------- */

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        Log.d(TAG, "onDraw: called")
    }

    /* ----------------------------------------- Event Processing ----------------------------------------- */

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d(TAG, "onKeyDown: called")
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d(TAG, "onKeyUp: called")
        return super.onKeyUp(keyCode, event)
    }

    override fun onTrackballEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "onTrackballEvent: called")
        return super.onTrackballEvent(event)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.d(TAG, "onTouchEvent: called")
        return super.onTouchEvent(event)
    }

    /* ---------------------------------------------- Focus ---------------------------------------------- */

    override fun onFocusChanged(gainFocus: Boolean, direction: Int, previouslyFocusedRect: Rect?) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect)
        Log.d(TAG, "onFocusChanged: called")
    }

    override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
        super.onWindowFocusChanged(hasWindowFocus)
        Log.d(TAG, "onWindowFocusChanged: hasWindowFocus: $hasWindowFocus")
    }

    /* -------------------------------------------- Attaching -------------------------------------------- */

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d(TAG, "onAttachedToWindow: called")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.d(TAG, "onDetachedFromWindow: called")
    }

    override fun onWindowVisibilityChanged(visibility: Int) {
        super.onWindowVisibilityChanged(visibility)
        val type = when (visibility) {
            VISIBLE -> "VISIBLE"
            INVISIBLE -> "INVISIBLE"
            GONE -> "GONE"
            else -> "else"
        }
        Log.d(TAG, "onWindowVisibilityChanged: visibility: $type")
    }
}