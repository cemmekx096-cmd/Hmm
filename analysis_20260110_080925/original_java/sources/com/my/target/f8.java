package com.my.target;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.my.target.nativeads.NativeAdViewBinder;
import com.my.target.nativeads.NativeBannerAdViewBinder;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.nativeads.views.PromoCardRecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/ori/classes4.dex */
public class f8 {
    public WeakReference b;
    public List c;
    public WeakReference d;
    public WeakReference e;
    public WeakReference f;
    public WeakReference g;
    public WeakReference h;
    public WeakReference i;
    public WeakReference j;
    public WeakReference k;
    public WeakReference l;
    public WeakReference m;
    public WeakReference n;
    public WeakReference o;
    public WeakReference p;
    public final List a = new ArrayList();
    public boolean q = false;

    public static final class a {
        public ViewGroup a;
        public NativeAdViewBinder b;
        public NativeBannerAdViewBinder c;
        public MediaAdView d;
        public List e;
        public int f = 0;

        public f8 a() {
            NativeBannerAdViewBinder nativeBannerAdViewBinder;
            NativeAdViewBinder nativeAdViewBinder;
            NativeBannerAdViewBinder nativeBannerAdViewBinder2;
            NativeAdViewBinder nativeAdViewBinder2;
            f8 f8Var = new f8();
            if (this.e != null) {
                f8Var.c = new ArrayList();
                for (View view : this.e) {
                    if (view != null) {
                        f8Var.c.add(new WeakReference(view));
                        if (view instanceof MediaAdView) {
                            f8Var.q = true;
                        }
                    }
                }
            }
            ViewGroup rootAdBannerView = null;
            int i = this.f;
            if (i == 0) {
                return f8Var;
            }
            if (i == 1) {
                rootAdBannerView = this.a;
            } else if (i == 2 && (nativeAdViewBinder = this.b) != null) {
                rootAdBannerView = nativeAdViewBinder.getRootAdView();
            } else if (i == 3 && (nativeBannerAdViewBinder = this.c) != null) {
                rootAdBannerView = nativeBannerAdViewBinder.getRootAdBannerView();
            }
            if (rootAdBannerView == null) {
                fb.c("NativeViewsHolderBuilder: can't init root ad view");
                return f8Var;
            }
            f8Var.b = new WeakReference(rootAdBannerView);
            List listA = a(rootAdBannerView);
            int i2 = this.f;
            if (i2 == 1) {
                a(f8Var, listA);
            } else if (i2 == 2 && (nativeAdViewBinder2 = this.b) != null) {
                a(f8Var, nativeAdViewBinder2, listA);
            } else if (i2 == 3 && (nativeBannerAdViewBinder2 = this.c) != null) {
                a(f8Var, nativeBannerAdViewBinder2, listA);
            }
            return f8Var;
        }

        public a b(ViewGroup viewGroup) {
            this.f = 1;
            this.a = viewGroup;
            return this;
        }

        public final void a(f8 f8Var, NativeAdViewBinder nativeAdViewBinder, List list) {
            View advertisingView = nativeAdViewBinder.getAdvertisingView();
            if (advertisingView != null) {
                f8Var.i = new WeakReference(advertisingView);
                list.remove(advertisingView);
            }
            View ageRestrictionView = nativeAdViewBinder.getAgeRestrictionView();
            if (ageRestrictionView != null) {
                f8Var.j = new WeakReference(ageRestrictionView);
                list.remove(ageRestrictionView);
            }
            View ctaView = nativeAdViewBinder.getCtaView();
            if (ctaView != null) {
                f8Var.h = new WeakReference(ctaView);
                list.remove(ctaView);
            }
            View descriptionView = nativeAdViewBinder.getDescriptionView();
            if (descriptionView != null) {
                f8Var.k = new WeakReference(descriptionView);
                list.remove(descriptionView);
            }
            View disclaimerView = nativeAdViewBinder.getDisclaimerView();
            if (disclaimerView != null) {
                f8Var.l = new WeakReference(disclaimerView);
                list.remove(disclaimerView);
            }
            View domainOrCategoryView = nativeAdViewBinder.getDomainOrCategoryView();
            if (domainOrCategoryView != null) {
                f8Var.m = new WeakReference(domainOrCategoryView);
                list.remove(domainOrCategoryView);
            }
            PromoCardRecyclerView promoCardRecyclerView = nativeAdViewBinder.getPromoCardRecyclerView();
            if (promoCardRecyclerView != null) {
                f8Var.g = new WeakReference(promoCardRecyclerView);
                list.remove(promoCardRecyclerView);
            }
            View starsRatingView = nativeAdViewBinder.getStarsRatingView();
            if (starsRatingView != null) {
                f8Var.p = new WeakReference(starsRatingView);
                list.remove(starsRatingView);
            }
            View titleView = nativeAdViewBinder.getTitleView();
            if (titleView != null) {
                f8Var.n = new WeakReference(titleView);
                list.remove(titleView);
            }
            View votesView = nativeAdViewBinder.getVotesView();
            if (votesView != null) {
                f8Var.o = new WeakReference(votesView);
                list.remove(votesView);
            }
            View adChoicesView = nativeAdViewBinder.getAdChoicesView();
            if (votesView != null) {
                f8Var.f = new WeakReference(adChoicesView);
                list.remove(adChoicesView);
            }
            MediaAdView mediaAdView = nativeAdViewBinder.getMediaAdView();
            if (mediaAdView != null) {
                f8Var.d = new WeakReference(mediaAdView);
                list.remove(mediaAdView);
            }
            IconAdView iconView = nativeAdViewBinder.getIconView();
            f8Var.e = new WeakReference(iconView);
            list.remove(iconView);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f8Var.a.add(new WeakReference((View) it.next()));
            }
        }

        public final void a(f8 f8Var, NativeBannerAdViewBinder nativeBannerAdViewBinder, List list) {
            View advertisingView = nativeBannerAdViewBinder.getAdvertisingView();
            if (advertisingView != null) {
                f8Var.i = new WeakReference(advertisingView);
                list.remove(advertisingView);
            }
            View ageRestrictionView = nativeBannerAdViewBinder.getAgeRestrictionView();
            if (ageRestrictionView != null) {
                f8Var.j = new WeakReference(ageRestrictionView);
                list.remove(ageRestrictionView);
            }
            View ctaView = nativeBannerAdViewBinder.getCtaView();
            if (ctaView != null) {
                f8Var.h = new WeakReference(ctaView);
                list.remove(ctaView);
            }
            View disclaimerView = nativeBannerAdViewBinder.getDisclaimerView();
            if (disclaimerView != null) {
                f8Var.l = new WeakReference(disclaimerView);
                list.remove(disclaimerView);
            }
            View starsRatingView = nativeBannerAdViewBinder.getStarsRatingView();
            if (starsRatingView != null) {
                f8Var.p = new WeakReference(starsRatingView);
                list.remove(starsRatingView);
            }
            View titleView = nativeBannerAdViewBinder.getTitleView();
            if (titleView != null) {
                f8Var.n = new WeakReference(titleView);
                list.remove(titleView);
            }
            View domainView = nativeBannerAdViewBinder.getDomainView();
            if (domainView != null) {
                f8Var.m = new WeakReference(domainView);
                list.remove(domainView);
            }
            View votesView = nativeBannerAdViewBinder.getVotesView();
            if (votesView != null) {
                f8Var.o = new WeakReference(votesView);
                list.remove(votesView);
            }
            View adChoicesView = nativeBannerAdViewBinder.getAdChoicesView();
            if (votesView != null) {
                f8Var.f = new WeakReference(adChoicesView);
                list.remove(adChoicesView);
            }
            IconAdView iconView = nativeBannerAdViewBinder.getIconView();
            f8Var.e = new WeakReference(iconView);
            list.remove(iconView);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f8Var.a.add(new WeakReference((View) it.next()));
            }
        }

        public final void a(f8 f8Var, List list) {
            if (this.d != null) {
                f8Var.d = new WeakReference(this.d);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaAdView mediaAdView = (View) it.next();
                if (mediaAdView instanceof IconAdView) {
                    f8Var.e = new WeakReference((IconAdView) mediaAdView);
                } else if (mediaAdView instanceof i) {
                    f8Var.f = new WeakReference(mediaAdView);
                } else if (mediaAdView instanceof PromoCardRecyclerView) {
                    f8Var.g = new WeakReference((b9) mediaAdView);
                } else if (mediaAdView instanceof MediaAdView) {
                    if (f8Var.d == null) {
                        f8Var.d = new WeakReference(mediaAdView);
                    }
                } else if (R.id.nativeads_advertising == mediaAdView.getId()) {
                    f8Var.i = new WeakReference(mediaAdView);
                } else if (R.id.nativeads_title == mediaAdView.getId()) {
                    f8Var.n = new WeakReference(mediaAdView);
                } else if (R.id.nativeads_description == mediaAdView.getId()) {
                    f8Var.k = new WeakReference(mediaAdView);
                } else if (R.id.nativeads_rating == mediaAdView.getId()) {
                    f8Var.p = new WeakReference(mediaAdView);
                } else if (R.id.nativeads_domain == mediaAdView.getId()) {
                    f8Var.m = new WeakReference(mediaAdView);
                } else if (R.id.nativeads_age_restrictions == mediaAdView.getId()) {
                    f8Var.j = new WeakReference(mediaAdView);
                } else if (R.id.nativeads_disclaimer == mediaAdView.getId()) {
                    f8Var.l = new WeakReference(mediaAdView);
                } else if (R.id.nativeads_call_to_action == mediaAdView.getId()) {
                    f8Var.h = new WeakReference((Button) mediaAdView);
                } else if (R.id.nativeads_votes == mediaAdView.getId()) {
                    f8Var.o = new WeakReference(mediaAdView);
                } else {
                    f8Var.a.add(new WeakReference(mediaAdView));
                }
            }
        }

        public final List a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof IconAdView) || (childAt instanceof PromoCardRecyclerView) || (childAt instanceof MediaAdView) || !(childAt instanceof ViewGroup)) {
                    arrayList.add(childAt);
                } else {
                    arrayList.addAll(a((ViewGroup) childAt));
                }
            }
            return arrayList;
        }

        public a a(List list) {
            this.e = list;
            return this;
        }

        public a a(MediaAdView mediaAdView) {
            this.d = mediaAdView;
            return this;
        }

        public a a(NativeAdViewBinder nativeAdViewBinder) {
            this.f = 2;
            this.b = nativeAdViewBinder;
            return this;
        }

        public a a(NativeBannerAdViewBinder nativeBannerAdViewBinder) {
            this.f = 3;
            this.c = nativeBannerAdViewBinder;
            return this;
        }
    }

    public void a() {
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((WeakReference) it.next()).clear();
            }
            this.c.clear();
            this.c = null;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((WeakReference) it2.next()).clear();
        }
        this.a.clear();
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            weakReference.clear();
            this.i = null;
        }
        WeakReference weakReference2 = this.j;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.j = null;
        }
        WeakReference weakReference3 = this.h;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.h = null;
        }
        WeakReference weakReference4 = this.k;
        if (weakReference4 != null) {
            weakReference4.clear();
            this.k = null;
        }
        WeakReference weakReference5 = this.l;
        if (weakReference5 != null) {
            weakReference5.clear();
            this.l = null;
        }
        WeakReference weakReference6 = this.m;
        if (weakReference6 != null) {
            weakReference6.clear();
            this.m = null;
        }
        WeakReference weakReference7 = this.e;
        if (weakReference7 != null) {
            weakReference7.clear();
            this.e = null;
        }
        WeakReference weakReference8 = this.p;
        if (weakReference8 != null) {
            weakReference8.clear();
            this.p = null;
        }
        WeakReference weakReference9 = this.n;
        if (weakReference9 != null) {
            weakReference9.clear();
            this.n = null;
        }
        WeakReference weakReference10 = this.o;
        if (weakReference10 != null) {
            weakReference10.clear();
            this.o = null;
        }
        WeakReference weakReference11 = this.d;
        if (weakReference11 != null) {
            weakReference11.clear();
            this.d = null;
        }
        WeakReference weakReference12 = this.g;
        if (weakReference12 != null) {
            weakReference12.clear();
            this.g = null;
        }
        WeakReference weakReference13 = this.b;
        if (weakReference13 != null) {
            weakReference13.clear();
            this.b = null;
        }
    }

    public View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View c() {
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View d() {
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public List e() {
        if (this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add((View) ((WeakReference) it.next()).get());
        }
        return arrayList;
    }

    public Context f() {
        ViewGroup viewGroupO = o();
        if (viewGroupO != null) {
            return viewGroupO.getContext();
        }
        return null;
    }

    public View g() {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View h() {
        WeakReference weakReference = this.k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View i() {
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View j() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public IconAdView k() {
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            return (IconAdView) weakReference.get();
        }
        return null;
    }

    public MediaAdView l() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    public List m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add((View) ((WeakReference) it.next()).get());
        }
        return arrayList;
    }

    public b9 n() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (b9) weakReference.get();
        }
        return null;
    }

    public ViewGroup o() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (ViewGroup) weakReference.get();
        }
        return null;
    }

    public View p() {
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View q() {
        WeakReference weakReference = this.n;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public View r() {
        WeakReference weakReference = this.o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public boolean s() {
        return this.c == null || this.q;
    }

    public void a(i iVar) {
        this.f = new WeakReference(iVar);
    }
}
