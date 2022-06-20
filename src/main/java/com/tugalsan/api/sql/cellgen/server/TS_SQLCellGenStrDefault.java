package com.tugalsan.api.sql.cellgen.server;

public class TS_SQLCellGenStrDefault<E> extends TS_SQLCellGenAbstract<E, String> {

    public TS_SQLCellGenStrDefault(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public String val() {
        return "";
    }
}
