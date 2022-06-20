package com.tugalsan.api.sql.cellgen.server;

public class TS_SQLCellGenLngDateDefault<E> extends TS_SQLCellGenAbstract<E, Long> {

    public TS_SQLCellGenLngDateDefault(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public Long val() {
        return 20000000L;
    }
}
