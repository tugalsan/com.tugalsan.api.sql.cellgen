package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.time.client.TGS_TimeUtils;

public class TS_SQLCellGenLngDateDefault<E> extends TS_SQLCellGenAbstract<E, Long> {

    public TS_SQLCellGenLngDateDefault(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public Long val() {
        return TGS_TimeUtils.zeroDateLng();
    }
}
