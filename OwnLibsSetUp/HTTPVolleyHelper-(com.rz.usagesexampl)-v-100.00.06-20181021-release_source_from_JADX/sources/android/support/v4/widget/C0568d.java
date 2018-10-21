package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.widget.C0250e.C0249a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.d */
public abstract class C0568d extends BaseAdapter implements C0249a, Filterable {
    /* renamed from: a */
    protected boolean f1973a;
    /* renamed from: b */
    protected boolean f1974b;
    /* renamed from: c */
    protected Cursor f1975c;
    /* renamed from: d */
    protected Context f1976d;
    /* renamed from: e */
    protected int f1977e;
    /* renamed from: f */
    protected C0247a f1978f;
    /* renamed from: g */
    protected DataSetObserver f1979g;
    /* renamed from: h */
    protected C0250e f1980h;
    /* renamed from: i */
    protected FilterQueryProvider f1981i;

    /* renamed from: android.support.v4.widget.d$a */
    private class C0247a extends ContentObserver {
        /* renamed from: a */
        final /* synthetic */ C0568d f834a;

        C0247a(C0568d c0568d) {
            this.f834a = c0568d;
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            this.f834a.m2438b();
        }
    }

    /* renamed from: android.support.v4.widget.d$b */
    private class C0248b extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ C0568d f835a;

        C0248b(C0568d c0568d) {
            this.f835a = c0568d;
        }

        public void onChanged() {
            this.f835a.f1973a = true;
            this.f835a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.f835a.f1973a = false;
            this.f835a.notifyDataSetInvalidated();
        }
    }

    public C0568d(Context context, Cursor cursor, boolean z) {
        m2433a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public Cursor mo107a() {
        return this.f1975c;
    }

    /* renamed from: a */
    public Cursor mo108a(CharSequence charSequence) {
        return this.f1981i != null ? this.f1981i.runQuery(charSequence) : this.f1975c;
    }

    /* renamed from: a */
    public abstract View mo474a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    void m2433a(Context context, Cursor cursor, int i) {
        DataSetObserver c0248b;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1974b = true;
        } else {
            this.f1974b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f1975c = cursor;
        this.f1973a = z;
        this.f1976d = context;
        this.f1977e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1978f = new C0247a(this);
            c0248b = new C0248b(this);
        } else {
            c0248b = null;
            this.f1978f = null;
        }
        this.f1979g = c0248b;
        if (z) {
            if (this.f1978f != null) {
                cursor.registerContentObserver(this.f1978f);
            }
            if (this.f1979g != null) {
                cursor.registerDataSetObserver(this.f1979g);
            }
        }
    }

    /* renamed from: a */
    public void mo109a(Cursor cursor) {
        cursor = m2436b(cursor);
        if (cursor != null) {
            cursor.close();
        }
    }

    /* renamed from: a */
    public abstract void mo549a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public Cursor m2436b(Cursor cursor) {
        if (cursor == this.f1975c) {
            return null;
        }
        Cursor cursor2 = this.f1975c;
        if (cursor2 != null) {
            if (this.f1978f != null) {
                cursor2.unregisterContentObserver(this.f1978f);
            }
            if (this.f1979g != null) {
                cursor2.unregisterDataSetObserver(this.f1979g);
            }
        }
        this.f1975c = cursor;
        if (cursor != null) {
            if (this.f1978f != null) {
                cursor.registerContentObserver(this.f1978f);
            }
            if (this.f1979g != null) {
                cursor.registerDataSetObserver(this.f1979g);
            }
            this.f1977e = cursor.getColumnIndexOrThrow("_id");
            this.f1973a = true;
            notifyDataSetChanged();
        } else {
            this.f1977e = -1;
            this.f1973a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public View mo475b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo474a(context, cursor, viewGroup);
    }

    /* renamed from: b */
    protected void m2438b() {
        if (this.f1974b && this.f1975c != null && !this.f1975c.isClosed()) {
            this.f1973a = this.f1975c.requery();
        }
    }

    /* renamed from: c */
    public CharSequence mo110c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public int getCount() {
        return (!this.f1973a || this.f1975c == null) ? 0 : this.f1975c.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1973a) {
            return null;
        }
        this.f1975c.moveToPosition(i);
        if (view == null) {
            view = mo475b(this.f1976d, this.f1975c, viewGroup);
        }
        mo549a(view, this.f1976d, this.f1975c);
        return view;
    }

    public Filter getFilter() {
        if (this.f1980h == null) {
            this.f1980h = new C0250e(this);
        }
        return this.f1980h;
    }

    public Object getItem(int i) {
        if (!this.f1973a || this.f1975c == null) {
            return null;
        }
        this.f1975c.moveToPosition(i);
        return this.f1975c;
    }

    public long getItemId(int i) {
        return (this.f1973a && this.f1975c != null && this.f1975c.moveToPosition(i)) ? this.f1975c.getLong(this.f1977e) : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1973a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1975c.moveToPosition(i)) {
            if (view == null) {
                view = mo474a(this.f1976d, this.f1975c, viewGroup);
            }
            mo549a(view, this.f1976d, this.f1975c);
            return view;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("couldn't move cursor to position ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
