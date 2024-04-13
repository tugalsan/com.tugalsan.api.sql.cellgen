package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.time.client.TGS_Time;
import com.tugalsan.api.union.client.TGS_UnionExcuse;

public class TS_SQLCellGenLngTimeCur<E> extends TS_SQLCellGenAbstract<E, Long> {

    public TS_SQLCellGenLngTimeCur(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public TGS_UnionExcuse<Long> val() {
        return TGS_UnionExcuse.of(TGS_Time.getCurrentTime());
    }
}
