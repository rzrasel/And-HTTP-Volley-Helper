package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.k */
public abstract class C0747k extends C0568d {
    /* renamed from: j */
    private int f2654j;
    /* renamed from: k */
    private int f2655k;
    /* renamed from: l */
    private LayoutInflater f2656l;

    @Deprecated
    public C0747k(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f2655k = i;
        this.f2654j = i;
        this.f2656l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo474a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2656l.inflate(this.f2654j, viewGroup, false);
    }

    /* renamed from: b */
    public View mo475b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2656l.inflate(this.f2655k, viewGroup, false);
    }
}
