package org.liquigraph.core.writer;

import org.liquigraph.core.model.Changeset;

import java.util.Collection;

public interface ChangelogWriter {

    void write(Collection<Changeset> changelogsToInsert);

}
