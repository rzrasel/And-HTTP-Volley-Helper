package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AlertController.C0280a;
import android.support.v7.p020a.C0270a.C0260a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.b */
public class C0748b extends C0583k implements DialogInterface {
    /* renamed from: a */
    final AlertController f2657a = new AlertController(getContext(), this, getWindow());

    /* renamed from: android.support.v7.app.b$a */
    public static class C0288a {
        /* renamed from: a */
        private final C0280a f964a;
        /* renamed from: b */
        private final int f965b;

        public C0288a(Context context) {
            this(context, C0748b.m3465a(context, 0));
        }

        public C0288a(Context context, int i) {
            this.f964a = new C0280a(new ContextThemeWrapper(context, C0748b.m3465a(context, i)));
            this.f965b = i;
        }

        /* renamed from: a */
        public Context m1066a() {
            return this.f964a.f882a;
        }

        /* renamed from: a */
        public C0288a m1067a(OnKeyListener onKeyListener) {
            this.f964a.f902u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0288a m1068a(Drawable drawable) {
            this.f964a.f885d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0288a m1069a(View view) {
            this.f964a.f888g = view;
            return this;
        }

        /* renamed from: a */
        public C0288a m1070a(ListAdapter listAdapter, OnClickListener onClickListener) {
            this.f964a.f904w = listAdapter;
            this.f964a.f905x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0288a m1071a(CharSequence charSequence) {
            this.f964a.f887f = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0748b m1072b() {
            C0748b c0748b = new C0748b(this.f964a.f882a, this.f965b);
            this.f964a.m995a(c0748b.f2657a);
            c0748b.setCancelable(this.f964a.f899r);
            if (this.f964a.f899r) {
                c0748b.setCanceledOnTouchOutside(true);
            }
            c0748b.setOnCancelListener(this.f964a.f900s);
            c0748b.setOnDismissListener(this.f964a.f901t);
            if (this.f964a.f902u != null) {
                c0748b.setOnKeyListener(this.f964a.f902u);
            }
            return c0748b;
        }
    }

    protected C0748b(Context context, int i) {
        super(context, C0748b.m3465a(context, i));
    }

    /* renamed from: a */
    static int m3465a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0260a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2657a.m1008a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f2657a.m1014a(i, keyEvent) ? true : super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f2657a.m1018b(i, keyEvent) ? true : super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2657a.m1013a(charSequence);
    }
}
