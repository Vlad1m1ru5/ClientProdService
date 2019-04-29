package org.kuba.clprsrv.sbt.controller;

import org.kuba.clprsrv.sbt.model.ClientRecord;

/**
 *  Омновная логика получения данных.
 *  DAO.
 *
 */
public interface RecordController {
    void input (ClientRecord clientRecord);
    void output (ClientRecord clientRecord);
    void update (ClientRecord clientRecord);
    void delete (ClientRecord clientRecord);
}
