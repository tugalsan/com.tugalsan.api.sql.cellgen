package com.tugalsan.api.sql.cellgen.server;

import module com.tugalsan.api.function;
import module com.tugalsan.api.tuple;

abstract public class TS_SQLCellGenAbstract<E, V> implements TGS_FuncMTU_In1<TGS_Tuple1<V>> {

    public TS_SQLCellGenAbstract(E executor, int colIdx) {
        this.executor = executor;
        this.colIdx = colIdx;
    }
    final protected E executor;
    final protected int colIdx;

    @Override
    public void run(TGS_Tuple1<V> generatedValue) {
        generatedValue.value0 = val();
    }

    abstract public V val();
}
