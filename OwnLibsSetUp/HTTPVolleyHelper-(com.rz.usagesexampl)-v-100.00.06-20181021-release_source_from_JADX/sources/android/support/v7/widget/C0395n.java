package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: android.support.v7.widget.n */
class C0395n {
    /* renamed from: a */
    static InputConnection m1585a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof bd) {
                    editorInfo.hintText = ((bd) parent).m1516a();
                    break;
                }
            }
        }
        return inputConnection;
    }
}
