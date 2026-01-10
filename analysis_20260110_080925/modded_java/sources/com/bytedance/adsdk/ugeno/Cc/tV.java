package com.bytedance.adsdk.ugeno.Cc;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import com.bytedance.adsdk.ugeno.Bc.Cc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: /data/data/com.termux/files/home/mod/mod/classes4.dex */
class tV {
    static final /* synthetic */ boolean EO = true;
    private boolean[] Cc;
    int[] IlO;
    long[] MY;
    private final com.bytedance.adsdk.ugeno.Cc.IlO tV;
    private long[] vCE;

    int IlO(long j) {
        return (int) j;
    }

    int MY(long j) {
        return (int) (j >> 32);
    }

    long MY(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    tV(com.bytedance.adsdk.ugeno.Cc.IlO ilO) {
        this.tV = ilO;
    }

    int[] IlO(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.tV.getFlexItemCount();
        List<MY> listMY = MY(flexItemCount);
        MY my = new MY();
        if (view != null && (layoutParams instanceof com.bytedance.adsdk.ugeno.Cc.MY)) {
            my.MY = ((com.bytedance.adsdk.ugeno.Cc.MY) layoutParams).EO();
        } else {
            my.MY = 1;
        }
        if (i != -1 && i != flexItemCount && i < this.tV.getFlexItemCount()) {
            my.IlO = i;
            while (i < flexItemCount) {
                listMY.get(i).IlO++;
                i++;
            }
        } else {
            my.IlO = flexItemCount;
        }
        listMY.add(my);
        return IlO(flexItemCount + 1, listMY, sparseIntArray);
    }

    int[] IlO(SparseIntArray sparseIntArray) {
        int flexItemCount = this.tV.getFlexItemCount();
        return IlO(flexItemCount, MY(flexItemCount), sparseIntArray);
    }

    private List<MY> MY(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.Cc.MY layoutParams = this.tV.IlO(i2).getLayoutParams();
            MY my = new MY();
            my.MY = layoutParams.EO();
            my.IlO = i2;
            arrayList.add(my);
        }
        return arrayList;
    }

    boolean MY(SparseIntArray sparseIntArray) {
        int flexItemCount = this.tV.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewIlO = this.tV.IlO(i);
            if (viewIlO != null && viewIlO.getLayoutParams().EO() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    private int[] IlO(int i, List<MY> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (MY my : list) {
            iArr[i2] = my.IlO;
            sparseIntArray.append(my.IlO, my.MY);
            i2++;
        }
        return iArr;
    }

    void IlO(IlO ilO, int i, int i2) {
        IlO(ilO, i, i2, Integer.MAX_VALUE, 0, -1, (List<EO>) null);
    }

    void MY(IlO ilO, int i, int i2) {
        IlO(ilO, i2, i, Integer.MAX_VALUE, 0, -1, (List<EO>) null);
    }

    void IlO(IlO ilO, int i, int i2, int i3, int i4, int i5, List<EO> list) {
        int i6;
        IlO ilO2;
        int i7;
        int i8;
        int i9;
        List<EO> list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i;
        int i18 = i2;
        int i19 = i5;
        boolean zIlO = this.tV.IlO();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<EO> arrayList = list == null ? new ArrayList() : list;
        ilO.IlO = arrayList;
        boolean z = i19 == -1;
        int iIlO = IlO(zIlO);
        int iMY = MY(zIlO);
        int iEO = EO(zIlO);
        int iTV = tV(zIlO);
        EO eo = new EO();
        int i20 = i4;
        eo.ea = i20;
        int i21 = iMY + iIlO;
        eo.Cc = i21;
        int flexItemCount = this.tV.getFlexItemCount();
        boolean z2 = z;
        int i22 = Integer.MIN_VALUE;
        int i23 = 0;
        int iCombineMeasuredStates = 0;
        int i24 = 0;
        while (true) {
            if (i20 >= flexItemCount) {
                i6 = iCombineMeasuredStates;
                ilO2 = ilO;
                break;
            }
            View viewMY = this.tV.MY(i20);
            if (viewMY == null) {
                if (IlO(i20, flexItemCount, eo)) {
                    IlO(arrayList, eo, i20, i23);
                }
            } else if (viewMY.getVisibility() == 8) {
                eo.DmF++;
                eo.lEW++;
                if (IlO(i20, flexItemCount, eo)) {
                    IlO(arrayList, eo, i20, i23);
                }
            } else {
                if (viewMY instanceof CompoundButton) {
                    IlO((CompoundButton) viewMY);
                }
                com.bytedance.adsdk.ugeno.Cc.MY my = (com.bytedance.adsdk.ugeno.Cc.MY) viewMY.getLayoutParams();
                int i25 = flexItemCount;
                if (my.vCE() == 4) {
                    eo.bWL.add(Integer.valueOf(i20));
                }
                int iIlO2 = IlO(my, zIlO);
                if (my.rp() != -1.0f && mode == 1073741824) {
                    iIlO2 = Math.round(size * my.rp());
                }
                if (zIlO) {
                    int iIlO3 = this.tV.IlO(i17, i21 + EO(my, true) + tV(my, true), iIlO2);
                    i7 = size;
                    i8 = mode;
                    int iMY2 = this.tV.MY(i18, iEO + iTV + Cc(my, true) + vCE(my, true) + i23, MY(my, true));
                    viewMY.measure(iIlO3, iMY2);
                    IlO(i20, iIlO3, iMY2, viewMY);
                    i9 = iIlO3;
                } else {
                    i7 = size;
                    i8 = mode;
                    int iIlO4 = this.tV.IlO(i18, iEO + iTV + Cc(my, false) + vCE(my, false) + i23, MY(my, false));
                    int iMY3 = this.tV.MY(i17, EO(my, false) + i21 + tV(my, false), iIlO2);
                    viewMY.measure(iIlO4, iMY3);
                    IlO(i20, iIlO4, iMY3, viewMY);
                    i9 = iMY3;
                }
                IlO(viewMY, i20);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewMY.getMeasuredState());
                int i26 = i23;
                int i27 = i21;
                EO eo2 = eo;
                int i28 = i20;
                list2 = arrayList;
                int i29 = i9;
                if (IlO(viewMY, i8, i7, eo.Cc, tV(my, zIlO) + IlO(viewMY, zIlO) + EO(my, zIlO), my, i28, i24, arrayList.size())) {
                    if (eo2.MY() > 0) {
                        IlO(list2, eo2, i28 > 0 ? i28 - 1 : 0, i26);
                        i23 = eo2.Bc + i26;
                    } else {
                        i23 = i26;
                    }
                    if (zIlO) {
                        if (my.MY() == -1) {
                            com.bytedance.adsdk.ugeno.Cc.IlO ilO3 = this.tV;
                            i10 = i2;
                            i20 = i28;
                            view = viewMY;
                            view.measure(i29, ilO3.MY(i10, ilO3.getPaddingTop() + this.tV.getPaddingBottom() + my.bWL() + my.zPa() + i23, my.MY()));
                            IlO(view, i20);
                        } else {
                            i10 = i2;
                            view = viewMY;
                            i20 = i28;
                        }
                    } else {
                        i10 = i2;
                        view = viewMY;
                        i20 = i28;
                        if (my.IlO() == -1) {
                            com.bytedance.adsdk.ugeno.Cc.IlO ilO4 = this.tV;
                            view.measure(ilO4.IlO(i10, ilO4.getPaddingLeft() + this.tV.getPaddingRight() + my.hp() + my.ea() + i23, my.IlO()), i29);
                            IlO(view, i20);
                        }
                    }
                    eo = new EO();
                    eo.lEW = 1;
                    i11 = i27;
                    eo.Cc = i11;
                    eo.ea = i20;
                    i13 = Integer.MIN_VALUE;
                    i12 = 0;
                } else {
                    i10 = i2;
                    view = viewMY;
                    i20 = i28;
                    eo = eo2;
                    i11 = i27;
                    eo.lEW++;
                    i12 = i24 + 1;
                    i23 = i26;
                    i13 = i22;
                }
                eo.cl |= my.tV() != 0.0f;
                eo.cL |= my.Cc() != 0.0f;
                int[] iArr = this.IlO;
                if (iArr != null) {
                    iArr[i20] = list2.size();
                }
                eo.Cc += IlO(view, zIlO) + EO(my, zIlO) + tV(my, zIlO);
                eo.NV += my.tV();
                eo.EV += my.Cc();
                this.tV.IlO(view, i20, i12, eo);
                int iMax = Math.max(i13, MY(view, zIlO) + Cc(my, zIlO) + vCE(my, zIlO) + this.tV.IlO(view));
                eo.Bc = Math.max(eo.Bc, iMax);
                if (zIlO) {
                    if (this.tV.getFlexWrap() != 2) {
                        eo.rp = Math.max(eo.rp, view.getBaseline() + my.bWL());
                    } else {
                        eo.rp = Math.max(eo.rp, (view.getMeasuredHeight() - view.getBaseline()) + my.zPa());
                    }
                }
                i14 = i25;
                if (IlO(i20, i14, eo)) {
                    IlO(list2, eo, i20, i23);
                    i23 += eo.Bc;
                }
                i15 = i5;
                if (i15 != -1 && list2.size() > 0) {
                    if (list2.get(list2.size() - 1).zPa >= i15 && i20 >= i15 && !z2) {
                        i23 = -eo.IlO();
                        i16 = i3;
                        z2 = true;
                    }
                    if (i23 <= i16 && z2) {
                        ilO2 = ilO;
                        i6 = iCombineMeasuredStates;
                        break;
                    }
                    i24 = i12;
                    i22 = iMax;
                    i20++;
                    i17 = i;
                    flexItemCount = i14;
                    i18 = i10;
                    i21 = i11;
                    arrayList = list2;
                    mode = i8;
                    i19 = i15;
                    size = i7;
                }
                i16 = i3;
                if (i23 <= i16) {
                }
                i24 = i12;
                i22 = iMax;
                i20++;
                i17 = i;
                flexItemCount = i14;
                i18 = i10;
                i21 = i11;
                arrayList = list2;
                mode = i8;
                i19 = i15;
                size = i7;
            }
            i7 = size;
            i8 = mode;
            i10 = i18;
            i15 = i19;
            list2 = arrayList;
            i11 = i21;
            i14 = flexItemCount;
            i20++;
            i17 = i;
            flexItemCount = i14;
            i18 = i10;
            i21 = i11;
            arrayList = list2;
            mode = i8;
            i19 = i15;
            size = i7;
        }
        ilO2.MY = i6;
    }

    private void IlO(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.Cc.MY layoutParams = compoundButton.getLayoutParams();
        int iBc = layoutParams.Bc();
        int iLEW = layoutParams.lEW();
        Drawable drawableIlO = Cc.IlO(compoundButton);
        int minimumWidth = drawableIlO == null ? 0 : drawableIlO.getMinimumWidth();
        int minimumHeight = drawableIlO != null ? drawableIlO.getMinimumHeight() : 0;
        if (iBc == -1) {
            iBc = minimumWidth;
        }
        layoutParams.IlO(iBc);
        if (iLEW == -1) {
            iLEW = minimumHeight;
        }
        layoutParams.MY(iLEW);
    }

    private int IlO(boolean z) {
        if (z) {
            return this.tV.getPaddingStart();
        }
        return this.tV.getPaddingTop();
    }

    private int MY(boolean z) {
        if (z) {
            return this.tV.getPaddingEnd();
        }
        return this.tV.getPaddingBottom();
    }

    private int EO(boolean z) {
        if (z) {
            return this.tV.getPaddingTop();
        }
        return this.tV.getPaddingStart();
    }

    private int tV(boolean z) {
        if (z) {
            return this.tV.getPaddingBottom();
        }
        return this.tV.getPaddingEnd();
    }

    private int IlO(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int MY(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int IlO(com.bytedance.adsdk.ugeno.Cc.MY my, boolean z) {
        if (z) {
            return my.IlO();
        }
        return my.MY();
    }

    private int MY(com.bytedance.adsdk.ugeno.Cc.MY my, boolean z) {
        if (z) {
            return my.MY();
        }
        return my.IlO();
    }

    private int EO(com.bytedance.adsdk.ugeno.Cc.MY my, boolean z) {
        if (z) {
            return my.hp();
        }
        return my.bWL();
    }

    private int tV(com.bytedance.adsdk.ugeno.Cc.MY my, boolean z) {
        if (z) {
            return my.ea();
        }
        return my.zPa();
    }

    private int Cc(com.bytedance.adsdk.ugeno.Cc.MY my, boolean z) {
        if (z) {
            return my.bWL();
        }
        return my.hp();
    }

    private int vCE(com.bytedance.adsdk.ugeno.Cc.MY my, boolean z) {
        if (z) {
            return my.zPa();
        }
        return my.ea();
    }

    private boolean IlO(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.Cc.MY my, int i5, int i6, int i7) {
        if (this.tV.getFlexWrap() == 0) {
            return false;
        }
        if (my.EV()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.tV.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iIlO = this.tV.IlO(view, i5, i6);
        if (iIlO > 0) {
            i4 += iIlO;
        }
        return i2 < i3 + i4;
    }

    private boolean IlO(int i, int i2, EO eo) {
        return i == i2 - 1 && eo.MY() != 0;
    }

    private void IlO(List<EO> list, EO eo, int i, int i2) {
        eo.hp = i2;
        this.tV.IlO(eo);
        eo.zPa = i;
        list.add(eo);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void IlO(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.Cc.MY r0 = (com.bytedance.adsdk.ugeno.Cc.MY) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.Bc()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.Bc()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.DmF()
            if (r1 <= r3) goto L26
            int r1 = r0.DmF()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.lEW()
            if (r2 >= r5) goto L32
            int r2 = r0.lEW()
            goto L3e
        L32:
            int r5 = r0.NV()
            if (r2 <= r5) goto L3d
            int r2 = r0.NV()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.IlO(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.Cc.tV.IlO(android.view.View, int):void");
    }

    void IlO(int i, int i2) {
        IlO(i, i2, 0);
    }

    void IlO(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        EO(this.tV.getFlexItemCount());
        if (i3 >= this.tV.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.tV.getFlexDirection();
        int flexDirection2 = this.tV.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.tV.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.tV.getPaddingLeft();
            paddingRight = this.tV.getPaddingRight();
        } else if (flexDirection2 == 2 || flexDirection2 == 3) {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.tV.getLargestMainSize();
            }
            paddingLeft = this.tV.getPaddingTop();
            paddingRight = this.tV.getPaddingBottom();
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.IlO;
        int i5 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = this.tV.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i6 = i5; i6 < size2; i6++) {
            EO eo = (EO) flexLinesInternal.get(i6);
            if (eo.Cc < size && eo.cl) {
                IlO(i, i2, eo, size, i4, false);
            } else if (eo.Cc > size && eo.cL) {
                MY(i, i2, eo, size, i4, false);
            }
        }
    }

    private void EO(int i) {
        boolean[] zArr = this.Cc;
        if (zArr == null) {
            this.Cc = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.Cc = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void IlO(int i, int i2, EO eo, int i3, int i4, boolean z) {
        int i5;
        int iMax;
        double d;
        int i6;
        double d2;
        float f = 0.0f;
        if (eo.NV <= 0.0f || i3 < eo.Cc) {
            return;
        }
        int i7 = eo.Cc;
        float f2 = (i3 - eo.Cc) / eo.NV;
        eo.Cc = i4 + eo.vCE;
        if (!z) {
            eo.Bc = ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
        }
        int i8 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i9 = 0;
        while (i8 < eo.lEW) {
            int i10 = eo.ea + i8;
            View viewMY = this.tV.MY(i10);
            if (viewMY == null || viewMY.getVisibility() == 8) {
                i5 = i7;
            } else {
                com.bytedance.adsdk.ugeno.Cc.MY my = (com.bytedance.adsdk.ugeno.Cc.MY) viewMY.getLayoutParams();
                int flexDirection = this.tV.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int i11 = i7;
                    int measuredWidth = viewMY.getMeasuredWidth();
                    long[] jArr = this.vCE;
                    if (jArr != null) {
                        measuredWidth = IlO(jArr[i10]);
                    }
                    int measuredHeight = viewMY.getMeasuredHeight();
                    long[] jArr2 = this.vCE;
                    i5 = i11;
                    if (jArr2 != null) {
                        measuredHeight = MY(jArr2[i10]);
                    }
                    if (!this.Cc[i10] && my.tV() > 0.0f) {
                        float fTV = measuredWidth + (my.tV() * f2);
                        if (i8 == eo.lEW - 1) {
                            fTV += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(fTV);
                        if (iRound > my.DmF()) {
                            iRound = my.DmF();
                            this.Cc[i10] = true;
                            eo.NV -= my.tV();
                            z2 = true;
                        } else {
                            f3 += fTV - iRound;
                            double d3 = f3;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            }
                            f3 = (float) d;
                        }
                        int iMY = MY(i2, my, eo.hp);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMY.measure(iMakeMeasureSpec, iMY);
                        int measuredWidth2 = viewMY.getMeasuredWidth();
                        int measuredHeight2 = viewMY.getMeasuredHeight();
                        IlO(i10, iMakeMeasureSpec, iMY, viewMY);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i9, measuredHeight + my.bWL() + my.zPa() + this.tV.IlO(viewMY));
                    eo.Cc += measuredWidth + my.hp() + my.ea();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMY.getMeasuredHeight();
                    long[] jArr3 = this.vCE;
                    if (jArr3 != null) {
                        measuredHeight3 = MY(jArr3[i10]);
                    }
                    int measuredWidth3 = viewMY.getMeasuredWidth();
                    long[] jArr4 = this.vCE;
                    if (jArr4 != null) {
                        measuredWidth3 = IlO(jArr4[i10]);
                    }
                    if (this.Cc[i10] || my.tV() <= f) {
                        i6 = i7;
                    } else {
                        float fTV2 = measuredHeight3 + (my.tV() * f2);
                        if (i8 == eo.lEW - 1) {
                            fTV2 += f3;
                            f3 = f;
                        }
                        int iRound2 = Math.round(fTV2);
                        if (iRound2 > my.NV()) {
                            iRound2 = my.NV();
                            this.Cc[i10] = true;
                            eo.NV -= my.tV();
                            i6 = i7;
                            z2 = true;
                        } else {
                            f3 += fTV2 - iRound2;
                            i6 = i7;
                            double d4 = f3;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                iRound2--;
                                d2 = d4 + 1.0d;
                            }
                            f3 = (float) d2;
                        }
                        int iIlO = IlO(i, my, eo.hp);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMY.measure(iIlO, iMakeMeasureSpec2);
                        measuredWidth3 = viewMY.getMeasuredWidth();
                        int measuredHeight4 = viewMY.getMeasuredHeight();
                        IlO(i10, iIlO, iMakeMeasureSpec2, viewMY);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i9, measuredWidth3 + my.hp() + my.ea() + this.tV.IlO(viewMY));
                    eo.Cc += measuredHeight3 + my.bWL() + my.zPa();
                    i5 = i6;
                }
                eo.Bc = Math.max(eo.Bc, iMax);
                i9 = iMax;
            }
            i8++;
            i7 = i5;
            f = 0.0f;
        }
        int i12 = i7;
        if (!z2 || i12 == eo.Cc) {
            return;
        }
        IlO(i, i2, eo, i3, i4, true);
    }

    private void MY(int i, int i2, EO eo, int i3, int i4, boolean z) {
        int i5;
        int iMax;
        int i6 = eo.Cc;
        float f = 0.0f;
        if (eo.EV <= 0.0f || i3 > eo.Cc) {
            return;
        }
        float f2 = (eo.Cc - i3) / eo.EV;
        eo.Cc = i4 + eo.vCE;
        if (!z) {
            eo.Bc = ExoMediaDrm.KeyRequest.REQUEST_TYPE_UNKNOWN;
        }
        int i7 = 0;
        float f3 = 0.0f;
        boolean z2 = false;
        int i8 = 0;
        while (i7 < eo.lEW) {
            int i9 = eo.ea + i7;
            View viewMY = this.tV.MY(i9);
            if (viewMY == null || viewMY.getVisibility() == 8) {
                i5 = i7;
            } else {
                com.bytedance.adsdk.ugeno.Cc.MY my = (com.bytedance.adsdk.ugeno.Cc.MY) viewMY.getLayoutParams();
                int flexDirection = this.tV.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i7;
                    int measuredWidth = viewMY.getMeasuredWidth();
                    long[] jArr = this.vCE;
                    if (jArr != null) {
                        measuredWidth = IlO(jArr[i9]);
                    }
                    int measuredHeight = viewMY.getMeasuredHeight();
                    long[] jArr2 = this.vCE;
                    if (jArr2 != null) {
                        measuredHeight = MY(jArr2[i9]);
                    }
                    if (!this.Cc[i9] && my.Cc() > 0.0f) {
                        float fCc = measuredWidth - (my.Cc() * f2);
                        if (i5 == eo.lEW - 1) {
                            fCc += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(fCc);
                        if (iRound < my.Bc()) {
                            iRound = my.Bc();
                            this.Cc[i9] = true;
                            eo.EV -= my.Cc();
                            z2 = true;
                        } else {
                            f3 += fCc - iRound;
                            double d = f3;
                            if (d > 1.0d) {
                                iRound++;
                                f3 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f3 += 1.0f;
                            }
                        }
                        int iMY = MY(i2, my, eo.hp);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewMY.measure(iMakeMeasureSpec, iMY);
                        int measuredWidth2 = viewMY.getMeasuredWidth();
                        int measuredHeight2 = viewMY.getMeasuredHeight();
                        IlO(i9, iMakeMeasureSpec, iMY, viewMY);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, measuredHeight + my.bWL() + my.zPa() + this.tV.IlO(viewMY));
                    eo.Cc += measuredWidth + my.hp() + my.ea();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewMY.getMeasuredHeight();
                    long[] jArr3 = this.vCE;
                    if (jArr3 != null) {
                        measuredHeight3 = MY(jArr3[i9]);
                    }
                    int measuredWidth3 = viewMY.getMeasuredWidth();
                    long[] jArr4 = this.vCE;
                    if (jArr4 != null) {
                        measuredWidth3 = IlO(jArr4[i9]);
                    }
                    if (this.Cc[i9] || my.Cc() <= f) {
                        i5 = i7;
                    } else {
                        float fCc2 = measuredHeight3 - (my.Cc() * f2);
                        if (i7 == eo.lEW - 1) {
                            fCc2 += f3;
                            f3 = f;
                        }
                        int iRound2 = Math.round(fCc2);
                        if (iRound2 < my.lEW()) {
                            iRound2 = my.lEW();
                            this.Cc[i9] = true;
                            eo.EV -= my.Cc();
                            i5 = i7;
                            z2 = true;
                        } else {
                            f3 += fCc2 - iRound2;
                            i5 = i7;
                            double d2 = f3;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f3 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f3 += 1.0f;
                            }
                        }
                        int iIlO = IlO(i, my, eo.hp);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewMY.measure(iIlO, iMakeMeasureSpec2);
                        measuredWidth3 = viewMY.getMeasuredWidth();
                        int measuredHeight4 = viewMY.getMeasuredHeight();
                        IlO(i9, iIlO, iMakeMeasureSpec2, viewMY);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, measuredWidth3 + my.hp() + my.ea() + this.tV.IlO(viewMY));
                    eo.Cc += measuredHeight3 + my.bWL() + my.zPa();
                }
                eo.Bc = Math.max(eo.Bc, iMax);
                i8 = iMax;
            }
            i7 = i5 + 1;
            f = 0.0f;
        }
        if (!z2 || i6 == eo.Cc) {
            return;
        }
        MY(i, i2, eo, i3, i4, true);
    }

    private int IlO(int i, com.bytedance.adsdk.ugeno.Cc.MY my, int i2) {
        com.bytedance.adsdk.ugeno.Cc.IlO ilO = this.tV;
        int iIlO = ilO.IlO(i, ilO.getPaddingLeft() + this.tV.getPaddingRight() + my.hp() + my.ea() + i2, my.IlO());
        int size = View.MeasureSpec.getSize(iIlO);
        if (size > my.DmF()) {
            return View.MeasureSpec.makeMeasureSpec(my.DmF(), View.MeasureSpec.getMode(iIlO));
        }
        return size < my.Bc() ? View.MeasureSpec.makeMeasureSpec(my.Bc(), View.MeasureSpec.getMode(iIlO)) : iIlO;
    }

    private int MY(int i, com.bytedance.adsdk.ugeno.Cc.MY my, int i2) {
        com.bytedance.adsdk.ugeno.Cc.IlO ilO = this.tV;
        int iMY = ilO.MY(i, ilO.getPaddingTop() + this.tV.getPaddingBottom() + my.bWL() + my.zPa() + i2, my.MY());
        int size = View.MeasureSpec.getSize(iMY);
        if (size > my.NV()) {
            return View.MeasureSpec.makeMeasureSpec(my.NV(), View.MeasureSpec.getMode(iMY));
        }
        return size < my.lEW() ? View.MeasureSpec.makeMeasureSpec(my.lEW(), View.MeasureSpec.getMode(iMY)) : iMY;
    }

    void MY(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.tV.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection == 2 || flexDirection == 3) {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        }
        List<EO> flexLinesInternal = this.tV.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.tV.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).Bc = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.tV.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    EO eo = new EO();
                    eo.Bc = i5;
                    flexLinesInternal.add(0, eo);
                    return;
                }
                if (alignContent == 2) {
                    this.tV.setFlexLines(IlO(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i4 < size4) {
                            arrayList.add(flexLinesInternal.get(i4));
                            if (i4 != flexLinesInternal.size() - 1) {
                                EO eo2 = new EO();
                                if (i4 == flexLinesInternal.size() - 2) {
                                    eo2.Bc = Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    eo2.Bc = Math.round(size3);
                                }
                                f += size3 - eo2.Bc;
                                if (f > 1.0f) {
                                    eo2.Bc++;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    eo2.Bc--;
                                    f += 1.0f;
                                }
                                arrayList.add(eo2);
                            }
                            i4++;
                        }
                        this.tV.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.tV.setFlexLines(IlO(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    EO eo3 = new EO();
                    eo3.Bc = size5;
                    for (EO eo4 : flexLinesInternal) {
                        arrayList2.add(eo3);
                        arrayList2.add(eo4);
                        arrayList2.add(eo3);
                    }
                    this.tV.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size7) {
                        EO eo5 = flexLinesInternal.get(i4);
                        float f3 = eo5.Bc + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int iRound = Math.round(f3);
                        f2 += f3 - iRound;
                        if (f2 > 1.0f) {
                            iRound++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            iRound--;
                            f2 += 1.0f;
                        }
                        eo5.Bc = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    private List<EO> IlO(List<EO> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        EO eo = new EO();
        eo.Bc = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(eo);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(eo);
            }
        }
        return arrayList;
    }

    void IlO() {
        IlO(0);
    }

    void IlO(int i) {
        View viewMY;
        if (i >= this.tV.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.tV.getFlexDirection();
        if (this.tV.getAlignItems() == 4) {
            int[] iArr = this.IlO;
            List flexLinesInternal = this.tV.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                EO eo = (EO) flexLinesInternal.get(i2);
                int i3 = eo.lEW;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = eo.ea + i4;
                    if (i4 < this.tV.getFlexItemCount() && (viewMY = this.tV.MY(i5)) != null && viewMY.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.Cc.MY layoutParams = viewMY.getLayoutParams();
                        if (layoutParams.vCE() == -1 || layoutParams.vCE() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                IlO(viewMY, eo.Bc, i5);
                            } else if (flexDirection == 2 || flexDirection == 3) {
                                MY(viewMY, eo.Bc, i5);
                            } else {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            }
                        }
                    }
                }
            }
            return;
        }
        for (EO eo2 : this.tV.getFlexLinesInternal()) {
            for (Integer num : eo2.bWL) {
                View viewMY2 = this.tV.MY(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    IlO(viewMY2, eo2.Bc, num.intValue());
                } else if (flexDirection == 2 || flexDirection == 3) {
                    MY(viewMY2, eo2.Bc, num.intValue());
                } else {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
            }
        }
    }

    private void IlO(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.Cc.MY layoutParams = view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - layoutParams.bWL()) - layoutParams.zPa()) - this.tV.IlO(view), layoutParams.lEW()), layoutParams.NV());
        long[] jArr = this.vCE;
        if (jArr != null) {
            measuredWidth = IlO(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        IlO(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    private void MY(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.Cc.MY layoutParams = view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - layoutParams.hp()) - layoutParams.ea()) - this.tV.IlO(view), layoutParams.Bc()), layoutParams.DmF());
        long[] jArr = this.vCE;
        if (jArr != null) {
            measuredHeight = MY(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        IlO(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    void IlO(View view, EO eo, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.Cc.MY layoutParams = view.getLayoutParams();
        int alignItems = this.tV.getAlignItems();
        if (layoutParams.vCE() != -1) {
            alignItems = layoutParams.vCE();
        }
        int i5 = eo.Bc;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.tV.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - layoutParams.zPa(), i3, i6 - layoutParams.zPa());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + layoutParams.bWL(), i3, (i4 - i5) + view.getMeasuredHeight() + layoutParams.bWL());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + layoutParams.bWL()) - layoutParams.zPa()) / 2;
                if (this.tV.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.tV.getFlexWrap() != 2) {
                    int iMax = Math.max(eo.rp - view.getBaseline(), layoutParams.bWL());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((eo.rp - view.getMeasuredHeight()) + view.getBaseline(), layoutParams.zPa());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.tV.getFlexWrap() != 2) {
            view.layout(i, i2 + layoutParams.bWL(), i3, i4 + layoutParams.bWL());
        } else {
            view.layout(i, i2 - layoutParams.zPa(), i3, i4 - layoutParams.zPa());
        }
    }

    void IlO(View view, EO eo, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.Cc.MY layoutParams = view.getLayoutParams();
        int alignItems = this.tV.getAlignItems();
        if (layoutParams.vCE() != -1) {
            alignItems = layoutParams.vCE();
        }
        int i5 = eo.Bc;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - layoutParams.ea(), i2, ((i3 + i5) - view.getMeasuredWidth()) - layoutParams.ea(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + layoutParams.hp(), i2, (i3 - i5) + view.getMeasuredWidth() + layoutParams.hp(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.Bc.vCE.IlO(marginLayoutParams)) - com.bytedance.adsdk.ugeno.Bc.vCE.MY(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + layoutParams.hp(), i2, i3 + layoutParams.hp(), i4);
        } else {
            view.layout(i - layoutParams.ea(), i2, i3 - layoutParams.ea(), i4);
        }
    }

    private void IlO(int i, int i2, int i3, View view) {
        long[] jArr = this.MY;
        if (jArr != null) {
            jArr[i] = MY(i2, i3);
        }
        long[] jArr2 = this.vCE;
        if (jArr2 != null) {
            jArr2[i] = MY(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private static class MY implements Comparable<MY> {
        int IlO;
        int MY;

        private MY() {
        }

        @Override // java.lang.Comparable
        /* renamed from: IlO, reason: merged with bridge method [inline-methods] */
        public int compareTo(MY my) {
            int i = this.MY;
            int i2 = my.MY;
            return i != i2 ? i - i2 : this.IlO - my.IlO;
        }

        public String toString() {
            return "Order{order=" + this.MY + ", index=" + this.IlO + '}';
        }
    }

    static class IlO {
        List<EO> IlO;
        int MY;

        IlO() {
        }

        void IlO() {
            this.IlO = null;
            this.MY = 0;
        }
    }
}
