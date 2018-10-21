package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.e */
class C0250e extends Filter {
    /* renamed from: a */
    C0249a f836a;

    /* renamed from: android.support.v4.widget.e$a */
    interface C0249a {
        /* renamed from: a */
        Cursor mo107a();

        /* renamed from: a */
        Cursor mo108a(CharSequence charSequence);

        /* renamed from: a */
        void mo109a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo110c(Cursor cursor);
    }

    C0250e(C0249a c0249a) {
        this.f836a = c0249a;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f836a.mo110c((Cursor) obj);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        Object a = this.f836a.mo108a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f836a.mo107a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f836a.mo109a((Cursor) filterResults.values);
        }
    }
}
