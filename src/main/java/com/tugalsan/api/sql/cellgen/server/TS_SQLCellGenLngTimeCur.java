package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.time.client.TGS_Time;

public class TS_SQLCellGenLngTimeCur<E> extends TS_SQLCellGenAbstract<E, Long> {

    public TS_SQLCellGenLngTimeCur(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public Long val() {
        return TGS_Time.getCurrentTime();
    }
}
